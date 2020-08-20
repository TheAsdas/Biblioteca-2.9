package dao;

/**
 * Saves an user's session data.
 *
 * @author gustavo
 * @version 1 (30/5/2020)
 */
public class Session
{
    //variables
    private static String user;
    private static String pass;

    public static void createSession (
      String user,
      String pass)
    {
        Session.user = user;
        Session.pass = pass;
    }

    //<editor-fold defaultstate="collapsed" desc="getters">
    public static String user ()
    {
        return Session.user;
    }

    public static String pass ()
    {
        return Session.pass;
    }
    //</editor-fold>

    public static boolean isValid ()
    {
        return (user != null && pass != null);
    }

}
