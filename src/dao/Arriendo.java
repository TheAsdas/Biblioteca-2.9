package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import resources.ThrowError;

/**
 * Class that manages the lend transactions from the DB.
 *
 * @author Usuario
 * @version 1.0 2/7/2020
 */
public class Arriendo
  extends Connector
{
    public static void insert (model.Arriendo a)
    {
        try
        {
            connect ();

            String query = "INSERT INTO arriendo " +
              "(fechaArriendo, fechaDevolucion, cantidad , precio , iva , trabajador_rut, cliente_rut, catalogo_isbn) " +
              "VALUES(?,?,?,?,?,?,?,?)";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, a.fecha () );
            sentence.setString ( 2, a.fechaDevolucion () );
            sentence.setInt ( 3, a.cantidad () );
            sentence.setInt ( 4, a.precio () );
            sentence.setFloat ( 5, a.iva () );
            sentence.setString ( 6, a.trabajador ().rut () );
            sentence.setString ( 7, a.cliente ().rut () );
            sentence.setInt ( 8, a.libro ().isbn () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar arriendo",
              e );
        }
    }

    /**
     * Returns an ArrayList with all the buy transactions.
     */
    public static ArrayList<model.Arriendo> select ()
    {
        ArrayList<model.Arriendo> arriendos = new ArrayList<> ();

        try
        {
            connect ();
            //add code pls
            String query = "SELECT * FROM arriendo";
            sentence = connection.prepareStatement ( query );
            results = sentence.executeQuery ();
            while ( results.next () )
            {
                model.Arriendo a = new model.Arriendo (
                  results.getInt ( "id" ),
                  results.getString ( "fechaArriendo" ),
                  results.getString ( "fechaDevolucion" ),
                  results.getInt ( "cantidad" ),
                  results.getInt ( "precio" ),
                  results.getFloat ( "iva" ),
                  results.getString ( "trabajador_rut" ),
                  results.getString ( "cliente_rut" ),
                  results.getInt ( "catalogo_isbn" ) );
                arriendos.add ( a );
            }
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "retornar arriendos",
              e );
        }

        return arriendos;
    }

    /**
     * Deletes a buy transaction from the DB.
     */
    public static void delete (model.Arriendo a)
    {
        try
        {
            connect ();
            String query = "DELETE FROM arriendo WHERE id=?";
            sentence = connection.prepareStatement ( query );
            sentence.setInt ( 1, a.id () );
            sentence.execute ();
            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "eliminar arriendo",
              e );
        }
    }

}
