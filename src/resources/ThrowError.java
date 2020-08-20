package resources;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * This class handles error popup windows.
 *
 * @author gustavo
 * @version 1.0 13/6/2020
 */
public class ThrowError
{
    /**
     * Shows an error dialog with information about the Exception ocurred.
     *
     * @param title Window's title.
     * @param error Error description.
     * @param e Exception to show in dialog.
     */
    private static void errorDialog (
      String title,
      String error,
      Exception e)
    {
        JOptionPane.showMessageDialog ( null, "<html>" + error + "<br/>" + e + "</html>", title,
          JOptionPane.ERROR_MESSAGE );
    }

    /**
     * Shows an error dialog.
     *
     * @param title Window's title.
     * @param error Error description.
     */
    private static void errorDialog (
      String title,
      String error)
    {
        JOptionPane.showMessageDialog (
          null,
          "<html>" + error + "</html>",
          title,
          JOptionPane.ERROR_MESSAGE );
    }

    private static void alertDialog (
      String title,
      String error)
    {
        JOptionPane.showMessageDialog (
          null,
          "<html>" + error + "</html>",
          title,
          JOptionPane.WARNING_MESSAGE );
    }

    public static void dbConnectionFailed (Exception e)
    {
        e.printStackTrace ();
        errorDialog (
          "Error al conectar",
          "Fue imposible conectarse con la base de datos. <br/> " +
          "Posibles causas de este error: <br/>" +
          " - Credenciales incorrectas. <br/>" +
          " - Base de datos no diponible." );
    }

    public static void dbInvalidCredentials ()
    {
        errorDialog (
          "Credenciales inválidas",
          "Las credenciales entregadas por el usuario <br/>" +
          "parecen ser inválidas." );
    }

    public static void dbDisconnectionFailed (SQLException e)
    {
        e.printStackTrace ();
        errorDialog (
          "Error al desconectar",
          "Fue imposible desconectarse correctamente <br/>" +
          "de la base de datos." );
    }

    public static void dbTransactionFailed (
      String action,
      Exception e)
    {
        e.printStackTrace ();
        errorDialog (
          "Transacción fallida",
          "No fue posible " + action + "." );
    }

    public static void debugInvalidFrame ()
    {
        errorDialog (
          "Frame inválido",
          "Este frame no pudo ser cargado." );
    }

    public static void interfaceInvalid (Exception e)
    {
        e.printStackTrace ();
        alertDialog (
          "Interfaz inválida",
          "El programador no incluyó una <br/>" +
          "interfaz para este elemento." );
    }

    public static void inputWrongFormat (String format)
    {
        alertDialog (
          "Formato incorrecto",
          "En este campo usted puede ingresar: <br/>" +
          format );
    }

    public static void dbEntryExists ()
    {
        errorDialog (
          "Esta entrada ya existe",
          "No puede agregar dos objetos con el <br/>" +
          " mismo nombre a la base de datos." );
    }

    public static void wizardFailed (Exception e)
    {
        e.printStackTrace ();

        errorDialog (
          "La tarea fracasó exitosamente.",
          "El Wizard no pudo agregar la entrada <br/>" +
          "a la base de datos." );
    }

}
