package dao;

import java.sql.*;
import java.util.*;
import resources.*;

/**
 * This class manages peresultsons's emails in the DB.
 *
 * @author Gustavo
 * @author Gabriel
 *
 * @version 1.0 26/6/2020
 */
public class Telefono
  extends Connector
{
//<editor-fold defaultstate="collapsed" desc="Employee">
    /**
     * Insert a employee's phone number.
     */
    public static void insert (
      model.Telefono t,
      model.Trabajador c)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "INSERT INTO teltrabajadores " +
              "(telefono, trabajador_rut) VALUES (?, ?)" );
            sentence.setString ( 1, t.telefono () );
            sentence.setString ( 2, c.rut () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar teléfonos",
              e );
        }
    }

    /**
     * Deletes the phone numbers of an employee.
     */
    public static void delete (
      model.Trabajador t)
    {
        try
        {
            connect ();

            for ( model.Telefono tel : t.listTelefonos () )
            {
                sentence = connection.prepareStatement ( "DELETE FROM teltrabajadores " +
                  "WHERE telefono = ?" );
                sentence.setString ( 1, tel.telefono () );
                sentence.execute ();
            }

            sentence.close();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "borrar teléfonos",
              e );
        }
    }

    /**
     * Retreives an employee's phone numbers.
     *
     * @return
     */
    public static ArrayList<model.Telefono> select (model.Trabajador tra)
    {
        ArrayList<model.Telefono> telefonos = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * " +
              "FROM teltrabajadores WHERE trabajador_rut = ?" );
            sentence.setString ( 1, tra.rut () );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Telefono t = new model.Telefono (
                  results.getString ( "telefono" ),
                  results.getString ( "trabajador_rut" ) );

                telefonos.add ( t );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir teléfonos",
              e );
        }
        return telefonos;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Client">
    /**
     * Agrega un telefono a un _Cliente_.
     */
    public static void insert (
      model.Telefono t,
      model.Cliente c)
    {
        try
        {
            connect ();

            String query = "INSERT INTO telclientes (telefono, cliente_rut) " +
              "VALUES (?,?) ";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, t.telefono () );
            sentence.setString ( 2, c.rut () );
            sentence.execute ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "Agregar teléfono",
              e );
        }
    }

    /**
     * Deletes the phone numbers of a client.
     */
    public static void delete (model.Cliente c)
    {
        try
        {
            connect ();

            for ( model.Telefono t : c.listTelefonos () )
            {
                String query = "DELETE FROM telclientes WHERE telefono=?";
                sentence = connection.prepareStatement ( query );
                sentence.setString ( 1, t.telefono () );
                sentence.execute ();
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "Borrar teléfono",
              e );
        }
    }

    /**
     * Consigue las telefonoes de un cliente.
     *
     * @return
     */
    public static ArrayList<model.Telefono> select (model.Cliente c)
    {
        ArrayList<model.Telefono> telefonos = new ArrayList<> ();

        try
        {
            connect ();

            String query = "SELECT * FROM telclientes WHERE cliente_rut = ?";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, c.rut () );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Telefono t = new model.Telefono (
                  results.getString ( "telefono" ),
                  results.getString ( "cliente_rut" ) );
                telefonos.add ( t );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "Conseguir teléfonos",
              e );
        }
        return telefonos;
    }
//</editor-fold>

}
