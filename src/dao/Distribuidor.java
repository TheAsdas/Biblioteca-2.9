package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Compra;
import resources.ThrowError;

/**
 * This class manages distributors.
 *
 * @author Usuario
 * @author Gustavo
 *
 * @version 1.2 1/7/2020
 */
public class Distribuidor
  extends Connector
{
    /**
     * Adds a distributor to the DB.
     */
    public static void insert (model.Distribuidor d)
    {
        try
        {
            connect ();

            String query = "INSERT INTO distribuidor " +
              "(rutDistribuidor, telefono, nombreEmpresa, anosServicio) " +
              "VALUES (?, ?, ?, ?)";
            sentence = connection.prepareStatement ( query );

            sentence.setString ( 1, d.rut () );
            sentence.setString ( 2, d.telefono () );
            sentence.setString ( 3, d.nombreEmpresa () );
            sentence.setInt ( 4, d.añosServicio () );
            sentence.execute ();

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar distribuidor",
              e );
        }
    }

    /**
     * Deletes a distributor from the DB.
     */
    public static void delete (model.Distribuidor d)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "DELETE FROM distribuidor " +
              "WHERE rutDistribuidor = ?" );
            sentence.setString ( 1, d.rut () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "quitar distribuidor",
              e );
        }
    }

    /**
     * Returns all distributors in an ArrayList.
     */
    public static ArrayList<model.Distribuidor> select ()
    {
        ArrayList<model.Distribuidor> distribuidores = new ArrayList<> ();

        try
        {
            connect ();

            String query = "SELECT * FROM distribuidor";
            sentence = connection.prepareStatement ( query );
            results = sentence.executeQuery ();
            while ( results.next () )
            {
                model.Distribuidor d = new model.Distribuidor (
                  results.getString ( "rutDistribuidor" ),
                  results.getString ( "telefono" ),
                  results.getString ( "nombreEmpresa" ),
                  results.getInt ( "anosServicio" ) );

                distribuidores.add ( d );
            }
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir distribuidores",
              e );
        }

        return distribuidores;
    }

    /**
     * Retrives the distributor of a buy transaction.
     */
    public static void select (Compra c)
    {
        ArrayList<model.Distribuidor> distribuidores = select ();
        for ( model.Distribuidor d : distribuidores )
        {
            if ( c.rutDistribuidor ().matches ( d.rut () ) )
            {
                c.setDistribuidor ( d );
            }
        }
    }

}
