package dao;

import java.sql.*;
import resources.*;

/**
 * This class manages the connection with the DB.
 *
 * @author Gabriel, Gustavo
 * @version 1.2 - 13/6/2020
 */
public class Connector
{

    //variables
    protected static Connection connection;
    protected static ResultSet results;
    protected static PreparedStatement sentence;

    //<editor-fold defaultstate="collapsed" desc="methods">
    public static void connect ()
    {
        try
        {
            Class.forName ( "com.mysql.jdbc.Driver" );
            String url = "jdbc:mysql://localhost:3306/" + Session.user () +
              "?autoReconnect=true&useSSL=false";
            connection = DriverManager.getConnection (
              url,
              "root",
              Session.pass () );
        }
        catch ( ClassNotFoundException | SQLException e )
        {
            ThrowError.dbConnectionFailed ( e );
        }
    }

    public static void disconnect ()
    {
        try
        {
            connection.close ();
        }
        catch ( SQLException e )
        {
            ThrowError.dbDisconnectionFailed ( e );
        }
    }

    public static void testConnection ()
      throws Exception
    {
        if ( Session.isValid () )
        {
            connect ();
            disconnect ();
        }
        else
        {
            throw new Exception ( "Unable to connect to DB." );
        }
    }

    //</editor-fold>
}
