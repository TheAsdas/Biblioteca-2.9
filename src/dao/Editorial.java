/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import resources.*;

/**
 * Class that manages instances of book's editorials in the DB.
 *
 * @author Gustavo, Gabriel
 * @version 1.1 12/6/2020
 */
public class Editorial
  extends Connector
{
    /**
     * Adds an Editorial to the DB.
     */
    public static void insert (model.Editorial e)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "INSERT INTO editorial " +
              "(nombre) VALUES (?)" );
            sentence.setString ( 1, e.nombre () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException ex )
        {
            ThrowError.dbTransactionFailed (
              "agregar editorial",
              ex );
        }
    }

    /**
     * Returns an ArrayList with all the editorials.
     */
    public static ArrayList<model.Editorial> select ()
    {
        ArrayList<model.Editorial> editoriales = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * " +
              "FROM editorial" );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Editorial e = new model.Editorial (
                  results.getInt ( "id" ),
                  results.getString ( "nombre" ) );

                editoriales.add ( e );
            }

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir editoriales",
              e );
        }

        return editoriales;
    }

    /**
     * Deletes an Editorial from the DB.
     */
    public static void delete (model.Editorial e)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "DELETE FROM editorial " +
              "WHERE id = ?" );
            sentence.setInt ( 1, e.id () );
            sentence.execute ();

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException ex )
        {
            ThrowError.dbTransactionFailed (
              "quitar editorial",
              ex );
        }
    }

    /**
     * Retrieves a book's editorial from the DB.
     */
    public static void select (model.Libro l)
    {
        model.Editorial e;

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * FROM editorial " +
              "WHERE id = ?" );
            sentence.setInt ( 1, l.idEditorial () );
            results = sentence.executeQuery ();

            if ( results.next () )
            {
                e = new model.Editorial (
                  results.getInt ( "id" ),
                  results.getString ( "nombre" ) );

                l.setEditorial ( e );
            }

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException ex )
        {
            ThrowError.dbTransactionFailed (
              "obtener editorial",
              ex );
        }
    }

    //TODO
    /**
     * Removes the editorial of a book.
     */
    public static void delete (model.Libro l)
    {
        throw new RuntimeException ( "You forgot to program me, idiot." );
    }

}
