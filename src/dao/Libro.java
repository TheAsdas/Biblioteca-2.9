package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Arriendo;
import model.Venta;
import resources.ThrowError;

/**
 * This class manages books in the DB.
 *
 * @author Gabriel, Gustavo
 * @version 1.1 - 11/6/2020
 */
public class Libro
  extends Connector
{
    /**
     * Adds a book to the database.
     *
     * @param l Book to be added.
     */
    public static void insert (model.Libro l)
    {
        try
        {
            connect ();

            String query = "INSERT INTO catalogo " +
              "(titulo, numPaginas, anoPublicacion, precio";
            if ( l.editorial () != null )
            {
                query += ", editorial_id)" +
                  "VALUES (?, ?, ?, ?, ?)";
            }
            else
            {
                query += ") VALUES (?, ?, ?, ?)";
            }
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, l.titulo () );
            sentence.setInt ( 2, l.paginas () );
            sentence.setInt ( 3, l.año () );
            sentence.setInt ( 4, l.precio () );
            if ( l.editorial () != null )
            {
                sentence.setInt ( 5, l.editorial ().id () );
            }
            sentence.execute ();

            sentence.close ();
            disconnect ();

        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar " + l.titulo (),
              e );
        }
    }

    /**
     * Deletes a book from the database.
     *
     * @param l Book to be deleted.
     */
    public static void delete (model.Libro l)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "DELETE FROM catalogo " +
              "WHERE isbn = ?" );

            sentence.setInt ( 1, l.isbn () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "borrar " + l.titulo (),
              e );
        }
    }

    /**
     * Retrieves every book from the DB. It also retrieves every author,
     * languaje and category of every book.
     *
     * @return Returns an ArrayList of books.
     */
    public static ArrayList<model.Libro> select ()
    {
        ArrayList<model.Libro> libros = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * FROM catalogo" );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Libro l = new model.Libro (
                  results.getInt ( "isbn" ),
                  results.getString ( "titulo" ),
                  results.getInt ( "numPaginas" ),
                  results.getInt ( "anoPublicacion" ),
                  results.getInt ( "precio" ),
                  results.getInt ( "editorial_id" ) );
                libros.add ( l );

            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir libros",
              e );
        }

        return libros;
    }

    /**
     * Gets the ISBN of a book by searching by it's variables. If this method
     * fails, it will simply return the same book without ISBN.
     */
    public static void retrieveIsbn (model.Libro l)
    {
        ArrayList<model.Libro> libros = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * FROM catalogo " +
              "WHERE titulo='" + l.titulo () + "'" +
              "AND  editorial_id='" + l.editorial ().id () + "'" );
            System.out.println ( sentence );
            results = sentence.executeQuery ();

            while ( results.next () )
            {
                model.Libro li = new model.Libro (
                  results.getInt ( "isbn" ),
                  results.getString ( "titulo" ),
                  results.getInt ( "numPaginas" ),
                  results.getInt ( "anoPublicacion" ),
                  results.getInt ( "precio" ),
                  results.getInt ( "editorial_id" ) );

                libros.add ( li );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir libros",
              e );
        }

        l.setIsbn ( libros.get ( 0 ).isbn () );
    }

    /**
     * Returns a book with a specific ISBN.
     */
    public static model.Libro selectByIsbn (int isbn)
    {
        ArrayList<model.Libro> libros = select ();
        model.Libro libro = null;

        for ( model.Libro l : libros )
        {
            if ( l.isbn () == isbn )
            {
                libro = l;
            }
        }

        return libro;
    }

    public static void select (model.Arriendo a)
    {
        ArrayList<model.Libro> libros = select ();

        for ( model.Libro l : libros )
        {
            if ( a.isbnLibro() == l.isbn () )
            {
                a.setLibro ( l );
            }
        }
    }

    public static void select (model.Venta v)
    {
        ArrayList<model.Libro> libros = select ();

        for ( model.Libro l : libros )
        {
            if ( v.isbnLibro () == l.isbn () )
            {
                v.setLibro ( l );
            }
        }
    }

}
