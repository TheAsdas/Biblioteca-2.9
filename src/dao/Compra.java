package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import resources.ThrowError;

/**
 * Class that manages the buy transactions from the DB.
 *
 * @author Gabriel
 * @author Gustavo
 * @version 1.0 2/7/2020
 */
public class Compra
  extends Connector
{
    public static void insert (model.Compra c)
    {
        try
        {
            connect ();

            String query = "INSERT INTO compra " +
              "(distribuidor_rutDistribuidor, precio, catalogo_isbn, cantidad,iva, fechaCompra) " +
              "VALUES(?, ?,?,?,?,?)";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, c.distribuidor ().rut () );
            sentence.setInt ( 2, c.precio () );
            sentence.setInt ( 3, c.libro ().isbn () );
            sentence.setInt ( 4, c.cantidad () );
            sentence.setFloat ( 5, c.iva () );
            sentence.setString ( 6, c.fecha () );
            sentence.execute ();

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar compra",
              e );
        }
    }

    /**
     * Returns an ArrayList with all the buy transactions.
     */
    public static ArrayList<model.Compra> select ()
    {
        ArrayList<model.Compra> compras = new ArrayList<> ();

        try
        {
            connect ();
            String query = "SELECT * from compra";
            sentence = connection.prepareStatement ( query );
            results = sentence.executeQuery ();
            while ( results.next () )
            {
                model.Compra c = new model.Compra (
                  results.getInt ( "id" ),
                  results.getInt ( "precio" ),
                  results.getInt ( "cantidad" ),
                  results.getFloat ( "iva" ),
                  results.getInt ( "factura_numFolio" ),
                  results.getInt ( "catalogo_isbn" ),
                  results.getString ( "fechaCompra" ),
                  results.getString ( "distribuidor_rutDistribuidor" )
                );
                compras.add ( c );
            }
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir compras",
              e );
        }

        return compras;
    }

    /**
     * Deletes a buy transaction from the DB.
     */
    public static void delete (model.Compra c)
    {
        try
        {
            connect ();
            String query = "DELETE FROM compra WHERE id=?";
            sentence = connection.prepareStatement ( query );
            sentence.setInt ( 1, c.id () );
            sentence.execute ();
            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "eliminar compra",
              e );
        }
    }

}
