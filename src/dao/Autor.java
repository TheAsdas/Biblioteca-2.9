package dao;

import java.sql.*;
import java.util.ArrayList;
import resources.*;

/**
 * Class that manages instances of book's authors in the DB.
 *
 * @author Gustavo, Gabriel
 * @version 1.1 12/6/2020
 */
public class Autor
  extends Connector
{
    //sql utils


    //<editor-fold defaultstate="collapsed" desc="methods">
    /**
     * Inserts an author in the DB.
     */
    public static void insert (model.Autor a)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "INSERT INTO autor " +
              "(nombre, paterno, materno) VALUES (?,?,?) " );
            sentence.setString ( 1, a.nombre () );
            sentence.setString ( 2, a.paterno () );
            sentence.setString ( 3, a.materno () );

            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar un autor",
              e );
        }
        catch ( NullPointerException e )
        {

        }
    }

    /**
     * Returns all authors in an ArrayList.
     */
    public static ArrayList<model.Autor> select ()
    {
        ArrayList<model.Autor> autores = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * FROM autor" );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Autor a = new model.Autor (
                  results.getInt ( "id" ),
                  results.getString ( "nombre" ),
                  results.getString ( "paterno" ),
                  results.getString ( "materno" ) );

                autores.add ( a );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir autores",
              e );
        }
        catch ( NullPointerException e )
        {

        }
        return autores;
    }

    /**
     * Deletes an author from the DB.
     */
    public static void delete (model.Autor a)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "DELETE FROM autor WHERE id = ?" );
            sentence.setInt ( 1, a.id () );
            sentence.execute ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "borrar autor",
              e );
        }
        catch ( NullPointerException e )
        {

        }
    }

    /**
     * Adds a book's authors to the DB. Note that this method only adds foreing
     * keys.
     *
     * @param l Book with the authors you want to add.
     */
    public static void insert (model.Libro l)
    {
        try
        {
            connect ();

            for ( model.Autor a : l.listaAutores () )
            {
                sentence = connection.prepareStatement (
                  "INSERT INTO catalogo_autor (autor_id,catalogo_isbn) " +
                  "VALUES (?, ?)" );
                sentence.setInt ( 1, a.id () );
                sentence.setInt ( 2, l.isbn () );

                sentence.execute ();
            }

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar autores al libro",
              e );
        }
        catch ( NullPointerException e )
        {

        }
    }

    //TODO
    /**
     * Deletes all the authors associated with a book. Note that this method
     * only affects foreign keys.
     *
     * @param l Book to delete authors from.
     */
    public static void delete (model.Libro l)
    {
         try
        {
            connect ();

            sentence = connection.prepareStatement ( "delete from catalogo where isbn= ?" );
            sentence.setInt(1, l.isbn());
            
            sentence.execute();
            sentence.close ();
            disconnect ();
            
        }
         
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "deletear libro",
              e );
        }
    }

    /**
     * Returns the authors of the specified book.
     */
    public static ArrayList<model.Autor> select (model.Libro l)
    {
        ArrayList<model.Autor> autores = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT nombre, " +
              "paterno, materno FROM autor AS a " +
              "INNER JOIN catalogo_autor AS c " +
              "ON a.id = c.autor_id WHERE c.catalogo_isbn = ?" );
            sentence.setInt ( 1, l.idEditorial () );

            results = sentence.executeQuery ();
            while ( results.next () )
            {
                model.Autor autor = new model.Autor (
                  results.getInt ( "id" ),
                  results.getString ( "nombre" ),
                  results.getString ( "paterno" ),
                  results.getString ( "materno" ) );

                autores.add ( autor );

            }
            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir los autores de un libro",
              e );
        }
        catch ( NullPointerException e )
        {

        }

        return autores;
    }
    //</editor-fold>

}
