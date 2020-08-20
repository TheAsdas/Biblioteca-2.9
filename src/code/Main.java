package code;

import dao.Session;
import fonts.*;
import resources.*;
import windows.*;

/**
 * This is the main process of the FastDevelopment app.
 *
 * @author Gustavo
 */
public class Main
{
    //constants
    public static final boolean DEBUG_MODE = false;

    /**
     * Main method.
     *
     * @param args the command line arguments
     */
    public static void main (
      String[] args)
    {
        //define gui skin
        Gui.defineSkin ( "Nimbus" );
        //load fonts
        new Fonts ();

        startApp ();
    }

    private static void startApp ()
    {
        java.awt.EventQueue.invokeLater (new Runnable ()
        {
            @Override
            public void run ()
            {
                if ( !DEBUG_MODE )
                {
                    Window.open ( new Login () );
                }

                if ( DEBUG_MODE )
                {
                    Session.createSession (
                      "fastdevelopment",
                      "gamp2297" );
                    Window.open ( new MainMenu () );
                }
            }

        } );
    }

}
