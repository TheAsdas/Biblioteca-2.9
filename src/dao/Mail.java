package dao;

import java.sql.*;
import java.util.ArrayList;
import resources.*;

/**
 * This class manages peresultsons's emails in the DB.
 *
 * @author Gustavo
 * @author Gabriel
 *
 * @version 1.0 26/6/2020
 */
public class Mail
  extends Connector
{
//<editor-fold defaultstate="collapsed" desc="Employee">
    /**
     * Insert an employee's email.
     */
    public static void insert (
      model.Mail m,
      model.Trabajador c)
    {
        try
        {
            connect ();

            sentence = connection.prepareStatement ( "INSERT INTO " +
              "mailtrabajadores (mail, trabajador_rut) VALUES (?,?) " );
            sentence.setString ( 1, m.mail () );
            sentence.setString ( 2, c.rut () );
            sentence.execute ();

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar email",
              e );
        }
    }

    /**
     * Deletes the e-mail addresses of an employee.
     */
    public static void delete (
      model.Trabajador t)
    {
        try
        {
            connect ();

            for ( model.Mail m : t.listCorreos () )
            {
                sentence = connection.prepareStatement ( "DELETE FROM " +
                  "mailtrabajadores WHERE mail=?" );
                sentence.setString ( 1, m.mail () );
                sentence.execute ();
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "borrar email",
              e );
        }
    }

    /**
     * Retrieves the mails of an employee.
     */
    public static ArrayList<model.Mail> select (
      model.Trabajador t)
    {
        ArrayList<model.Mail> mails = new ArrayList<> ();

        try
        {
            connect ();

            sentence = connection.prepareStatement ( "SELECT * " +
              "FROM mailtrabajadores WHERE trabajador_rut = ?" );
            sentence.setString ( 1, t.rut () );
            results = sentence.executeQuery ();
            while ( results.next () )
            {
                model.Mail m = new model.Mail (
                  results.getString ( "mail" ),
                  results.getString ( "trabajador_rut" ) );

                mails.add ( m );
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir emails",
              e );
        }
        return mails;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Client">
    /**
     * Insert an client's mail.
     */
    public static void insert (
      model.Mail m,
      model.Cliente c)
    {
        //db magic
        try
        {
            connect ();
            String query = "INSERT INTO mailclientes (mail, cliente_rut) " +
              "VALUES (?,?) ";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, m.mail () );
            sentence.setString ( 2, c.rut () );
            sentence.execute ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "agregar emails",
              e );
        }
    }

    /**
     * Deletes an client's email.
     */
    public static void delete (
      model.Cliente c)
    {
        try
        {
            connect ();

            for ( model.Mail m : c.listCorreos () )
            {
                String query = "DELETE FROM mailclientes WHERE mail=?";
                sentence = connection.prepareStatement ( query );
                sentence.setString ( 1, m.mail () );
                sentence.execute ();
            }

            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "borrar emails",
              e );
        }
    }

    /**
     * Retrieves a client's emails.
     */
    public static ArrayList<model.Mail> select (model.Cliente c)
    {
        ArrayList<model.Mail> mails = new ArrayList<> ();

        try
        {
            connect ();

            String query = "SELECT * FROM mailclientes WHERE cliente_rut = ?";
            sentence = connection.prepareStatement ( query );
            sentence.setString ( 1, c.rut () );
            results = sentence.executeQuery ();
            while ( results.next () )
            {
                model.Mail m = new model.Mail ( results.getString ( "mail" ), results.getString ( "cliente_rut" ) );
                mails.add ( m );
            }
            sentence.close ();
            disconnect ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbTransactionFailed (
              "conseguir emails",
              e );
        }
        return mails;
    }
//</editor-fold>

}
