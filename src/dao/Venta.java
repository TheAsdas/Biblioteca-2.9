package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import resources.ThrowError;

/**
 *
 * @author Usuario
 */
public class Venta
  extends Connector
{
    public static void insert (model.Venta c)
    {
        try
        {
            connect ();

            String query = "INSERT INTO venta " +
              "(fecha,precio,cantidad,iva,trabajador_rut,cliente_rut,catalogo_isbn) " +
              "VALUES(?,?,?,?,?,?,?)";
            sentence = connection.prepareStatement(query);
            sentence.setString(1, c.fecha());
            sentence.setInt(2, c.precio());
            sentence.setInt(3, c.cantidad());
            sentence.setFloat(4, c.iva());
            sentence.setString(5, c.trabajador().rut());
            sentence.setString(6, c.cliente().rut());
            sentence.setInt(7, c.libro().isbn());
            sentence.execute();
            sentence.close();
            disconnect();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar venta",
              e );
        }
    }

    /**
     * Returns an ArrayList with all the buy transactions.
     */
    public static ArrayList<model.Venta> select ()
    {
        ArrayList<model.Venta> ventas = new ArrayList<> ();

        try
        {
            connect();
            String query = "SELECT * from venta";
            sentence = connection.prepareStatement(query);
            results = sentence.executeQuery();
            while(results.next()){
                model.Venta v = new model.Venta(
                    results.getInt("id"),
                    results.getString("fecha"),
                    results.getInt("precio"),
                    results.getInt("cantidad"),
                    results.getInt("iva"),
                    results.getString("trabajador_rut"),
                    results.getString("cliente_rut"),
                    results.getInt("catalogo_isbn"));
                ventas.add(v);
            }
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "retornar ventas",
              e );
        }

        return ventas;
    }

    /**
     * Deletes a buy transaction from the DB.
     */
    public static void delete (model.Venta c)
    {
        try
        {
            connect ();
            String query = "DELETE FROM venta WHERE id=?";
            sentence = connection.prepareStatement ( query );
            sentence.setInt ( 1, c.id());
            sentence.execute ();
            sentence.close();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "borrar venta",
              e );
        }
    }

}
