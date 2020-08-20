package dao;

import java.sql.*;
import java.util.ArrayList;
import resources.ThrowError;

/**
 * Class that manages instances of employees in the DB.
 *
 * @author Gustavo, Gabriel
 * @version ion 1.0 26/6/2020
 */
public class Trabajador
  extends Connector
{
    public static void insert (model.Trabajador t)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "INSERT INTO trabajador " +
              "(rut, nombre, paterno, materno, fechaContrato) " +
              "VALUES (?,?,?,?,?)" );

            sentence.setString ( 1, t.rut () );
            sentence.setString ( 2, t.nombre () );
            sentence.setString ( 3, t.paterno () );
            sentence.setString ( 4, t.materno () );
            sentence.setString ( 5, t.fechaContrato () );

            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar trabajador",
              e );
        }
    }

    public static void delete (model.Trabajador t)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "DELETE FROM trabajador " +
              "WHERE rut=?" );

            sentence.setString ( 1, t.rut () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( Exception e )
        {
            ThrowError.dbTransactionFailed (
              "quitar trabajador",
              e );
        }
    }

    public static ArrayList<model.Trabajador> select ()
    {
        ArrayList<model.Trabajador> trabajadores = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * " +
              "FROM trabajador" );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Trabajador t = new model.Trabajador (
                  results.getString ( "rut" ),
                  results.getString ( "nombre" ),
                  results.getString ( "paterno" ),
                  results.getString ( "materno" ),
                  results.getString ( "fechaContrato" ) );

                trabajadores.add ( t );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir trabajadores",
              e );
        }
        return trabajadores;
    }

    /**
     * Retrieves a worker from a lend transaction
     *
     * @param a
     */
    public static void select (model.Arriendo a)
    {
        ArrayList<model.Trabajador> trabajadores = select ();

        for ( model.Trabajador t : trabajadores )
        {
            if ( a.rutTrabajador ().matches ( t.rut () ) )
            {
                a.setTrabajador ( t );
            }
        }
    }

    public static void select (model.Venta v)
    {
        ArrayList<model.Trabajador> trabajadores = select ();

        for ( model.Trabajador t : trabajadores )
        {
            if ( v.rutTrabajador ().matches ( t.rut () ) )
            {

            }
        }
    }

}
