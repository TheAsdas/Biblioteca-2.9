package dao;

import java.sql.*;
import java.util.ArrayList;
import resources.*;

/**
 * Class that manages instances of book's categories in the DB.
 *
 * @author Gustavo, Gabriel
 * @version 1.1 - 12/6/2020
 */
public class Categoria
  extends Connector
{
    /**
     * Adds a category to the DB.
     */
    public static void insert (model.Categoria c)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "INSERT INTO categoria " +
              "(nombre) VALUES (?)" );
            sentence.setString ( 1, c.nombre () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar una categoría",
              e );
        }
    }

    /**
     * Returns an ArrayList with all the categories of the DB.
     */
    public static ArrayList<model.Categoria> select ()
    {
        ArrayList<model.Categoria> listaCategoria = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * " +
              "FROM categoria" );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Categoria c = new model.Categoria (
                  results.getInt ( "id" ),
                  results.getString ( "nombre" ) );

                listaCategoria.add ( c );
            }

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir categorías",
              e );
        }
        catch ( NullPointerException e )
        {

        }

        return listaCategoria;
    }

    /**
     * Removes a category from the DB.
     */
    public static void delete (model.Categoria c)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "DELETE FROM categoria " +
              "WHERE id = ?" );
            sentence.setInt ( 1, c.id () );
            sentence.execute ();

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "quitar categoría",
              e );
        }
        catch ( NullPointerException e )
        {

        }
    }

    /**
     * Inserts the categories of a book.
     */
    public static void insert (model.Libro l)
    {
        try
        {
            connect ();

            for ( model.Categoria c : l.listaCategorias () )
            {
                sentence = connection.prepareStatement (
                  "INSERT INTO catalogo_categoria (categoria_id,catalogo_isbn) " +
                  "values (?,?)" );
                sentence.setInt ( 1, c.id () );
                sentence.setInt ( 2, l.isbn () );

                sentence.execute ();
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir categorías de un libro",
              e );
        }
        catch ( NullPointerException e )
        {

        }
    }

    /**
     * Returns an ArrayList with all the categories of a book.
     */
    public static ArrayList<model.Categoria> select (model.Libro l)
    {

        ArrayList<model.Categoria> categorias = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT id, nombre " +
              "FROM categoria AS a " +
              "INNER JOIN catalogo_categoria AS c " +
              "ON a.id = c.categoria_id WHERE c.catalogo_isbn = ?" );
            sentence.setInt ( 1, l.isbn () );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Categoria c = new model.Categoria (
                  results.getInt ( "id" ),
                  results.getString ( "nombre" ) );

                categorias.add ( c );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir categorías de un libro",
              e );
        }
        catch ( NullPointerException e )
        {

        }

        return categorias;
    }

    /**
     * Deletes the categories of a book.
     */
    public static void delete (model.Libro l)
    {
        for ( model.Categoria c : l.listaCategorias () )
        {
            delete ( c );
        }
    }

}
