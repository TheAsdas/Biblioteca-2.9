package dao;

import java.sql.*;
import java.util.ArrayList;
import resources.ThrowError;

/**
 * This class manages the the addresses of the DB.
 *
 * @author Gustavo
 * @author Gabriel
 *
 * @version 1.0 26/6/2020
 */
public class Direccion
  extends Connector
{

//<editor-fold defaultstate="collapsed" desc="Employee">
    /**
     * Adds an employee's address to the DB.
     */
    public static void insert (
      model.Direccion d,
      model.Trabajador c)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "INSERT INTO " +
              "dirtrabajadores (direccion, trabajador_rut) VALUES (?,?)" );
            sentence.setString ( 1, d.direccion () );
            sentence.setString ( 2, c.rut () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar direccion",
              e );
        }
    }

    /**
     * Removes an employee's address from the DB.
     */
    public static void delete (
      model.Trabajador t)
    {
        try
        {
            connect ();

            for ( model.Direccion d : t.listDirecciones () )
            {
                sentence = connection.prepareStatement ( "DELETE FROM " +
                  "dirtrabajadores WHERE direccion = ?" );
                sentence.setString ( 1, d.direccion () );
                sentence.execute ();
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "borrar direccion",
              e );
        }
    }

    /**
     * Returns an ArrayList with the addresses of an employee.
     */
    public static ArrayList<model.Direccion> select (
      model.Trabajador t)
    {
        ArrayList<model.Direccion> direcciones = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * " +
              "FROM dirtrabajadores WHERE trabajador_rut = ?" );
            sentence.setString ( 1, t.rut () );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Direccion d = new model.Direccion (
                  results.getString ( "direccion" ),
                  results.getString ( "trabajador_rut" ) );

                direcciones.add ( d );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( Exception e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir direccion",
              e );
        }
        return direcciones;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Client">
    /**
     * Inserts a client's address.
     */
    public static void insert (
      model.Direccion d,
      model.Cliente c)
    {
        try
        {
            connect ();
            String query = "INSERT INTO dirclientes (direccion, cliente_rut) " +
              "VALUES (?,?) ";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, d.direccion () );
            sentence.setString ( 2, c.rut () );
            sentence.execute ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar direccion",
              e );
        }
    }

    /**
     * Delete a client's email.
     */
    public static void delete (
      model.Cliente c)
    {
        try
        {
            connect ();

            for ( model.Direccion d : c.listDirecciones () )
            {
                String query = "DELETE FROM dirclientes WHERE direccion=?";
                sentence = connection.prepareStatement ( query );
                sentence.setString ( 1, d.direccion () );
                sentence.execute ();
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar direccion",
              e );
        }
    }

    /**
     * Retrieve a client's address.
     */
    public static ArrayList<model.Direccion> select (
      model.Cliente c)
    {
        ArrayList<model.Direccion> direcciones = new ArrayList<> ();

        try
        {
            connect ();

            String query = "SELECT * FROM dirclientes WHERE cliente_rut = ?";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, c.rut () );
            results = sentence.executeQuery ();
            while ( results.next () )
            {
                model.Direccion d = new model.Direccion ( results.getString ( "direccion" ), results.getString ( "cliente_rut" ) );
                direcciones.add ( d );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir direcciones",
              e );
        }

        return direcciones;
    }
//</editor-fold>

}
