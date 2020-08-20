package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Arriendo;
import model.Venta;
import resources.ThrowError;

/**
 * This class manages entries of clients in the DB.
 *
 * @author Gustavo
 * @author Gabriel
 * @version 1.0 30/6/2020
 */
public class Cliente
  extends Connector
{
    /**
     * Add a client to the DB.
     */
    public static void insert (model.Cliente c)
    {
        //db magic
        try
        {
            connect ();
            String query = "INSERT INTO cliente " +
              "(rut, nombre, paterno, materno, fechaNacimiento) " +
              "VALUES (?,?,?,?,?) ";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, c.rut () );
            sentence.setString ( 2, c.nombre () );
            sentence.setString ( 3, c.paterno () );
            sentence.setString ( 4, c.materno () );
            sentence.setString ( 5, c.fechaNacimiento () );
            sentence.execute ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar cliente",
              e );
        }
    }

    /**
     * Removes a client from the DB.
     */
    public static void delete (model.Cliente c)
    {
        //db magic
        try
        {
            connect ();
            String query = "DELETE FROM cliente WHERE rut=?";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, c.rut () );
            sentence.execute ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "quitar cliente",
              e );
        }
    }

    /**
     * Retrieves clients from the DB.
     */
    public static ArrayList<model.Cliente> select ()
    {
        //create ArrayList
        ArrayList<model.Cliente> clientes = new ArrayList<> ();
        //db magic
        try
        {
            connect ();
            //add code pls
            String query = "SELECT * FROM cliente";
            sentence = connection.prepareStatement ( query );
            results = sentence.executeQuery ();
            while ( results.next () )
            {
                model.Cliente c = new model.Cliente (
                  results.getString ( "rut" ),
                  results.getString ( "nombre" ),
                  results.getString ( "paterno" ),
                  results.getString ( "materno" ),
                  results.getString ( "fechaNacimiento" ) );
                clientes.add ( c );
            }
            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir clientes",
              e );
        }

        return clientes;
    }

    /**
     * Retrieves the client of an lend transaction.
     */
    public static void select (model.Arriendo a)
    {
        ArrayList<model.Cliente> clientes = select ();

        for ( model.Cliente c : clientes )
        {
            if ( a.rutCliente ().matches ( c.rut () ) )
            {
                a.setCliente ( c );
            }
        }
    }

    public static void select (model.Venta v)
    {
        ArrayList <model.Cliente> clientes = select ();
        
        for ( model.Cliente c : clientes )
        {
            if ( v.rutCliente ().matches ( c.rut ()))
            {
                v.setCliente ( c );
            }
        }
    }

}
