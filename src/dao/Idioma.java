package dao;

import java.sql.*;
import java.util.ArrayList;
import resources.ThrowError;

/**
 * Class that manages instances of book's languajes in the DB.
 *
 * @author Gustavo, Gabriel
 * @version 1.2 - 12/6/2020
 */
public class Idioma
  extends Connector
{
    public static void insert (model.Idioma i)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "INSERT INTO idioma " +
              "(nombre) VALUES (?)" );
            sentence.setString ( 1, i.nombre () );
            sentence.execute ();

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar idioma",
              e );
        }
    }

    /**
     * Returns an ArrayList with all the languajes of the DB.
     */
    public static ArrayList<model.Idioma> select ()
    {
        ArrayList<model.Idioma> listaIdiomas = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * FROM idioma" );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Idioma i = new model.Idioma (
                  results.getInt ( "id" ),
                  results.getString ( "nombre" ) );

                listaIdiomas.add ( i );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir idiomas",
              e );
        }

        return listaIdiomas;
    }

    /**
     * Removes a languaje from the database.
     */
    public static void delete (model.Idioma i)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "DELETE FROM idioma WHERE id= ?" );
            sentence.setInt ( 1, i.id () );
            sentence.execute ();

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "quitar idioma",
              e );
        }
    }

    /**
     * Inserts the languajes of a book.
     */
    public static void insert (model.Libro l)
    {
        try
        {
            connect ();

            for ( model.Idioma i : l.listaIdiomas () )
            {
                sentence = connection.prepareStatement (
                  "INSERT INTO catalogo_idioma (idioma_id,catalogo_isbn) " +
                  "VALUES (?,?)" );
                sentence.setInt ( 1, i.id () );
                sentence.setInt ( 2, l.isbn () );

                sentence.execute ();
            }

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir idioma de " + l.titulo (),
              e );
        }
    }

    /**
     * Removes the languajes of a book.
     */
    public static void delete (model.Libro l)
    {
        for ( model.Idioma i : l.listaIdiomas () )
        {
            delete ( i );
        }
    }

    //TODO
    /**
     * Selects the languajes of a book.
     */
    public static ArrayList<Idioma> select (model.Libro l)
    {
        throw new RuntimeException ( "You forgot to program me, idiot." );
    }

}
