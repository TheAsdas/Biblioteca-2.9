package resources;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * This class manages all the windows that can be showed into the screen.
 *
 * @author gusta
 */
public class Window
{
    private static final ArrayList<Container> ALL_WINDOWS = new ArrayList<> ();

    /**
     *
     * @param c
     */
    public static void open (Container c)
    {
        //if component does not exist
        if ( !componentExists ( c ) )
        {
            //add it and configure it
            ALL_WINDOWS.add ( c );
            setupWindow ( c );
        }
        else
        {
            //error handling
            System.out.println ( "Error. Esta ventana ya está abierta." );
        }
    }

    public static void openDialog (Container c)
    {
        ALL_WINDOWS.add ( c );
    }

    /**
     * This method will configure the last window that has been openend.
     *
     * @param c
     */
    private static void setupWindow (Container c)
    {
        //set centered location
        Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();
        c.setLocation ( dim.width / 2 - c.getSize ().width / 2, dim.height / 2 - c.getSize ().height / 2 );
        //set visible
        c.setVisible ( true );
    }

    /**
     * Removes a component from the opened list.
     *
     * @param c
     */
    public static void close (JFrame c)
    {
        ALL_WINDOWS.remove ( c );
        c.dispose ();

        closeIfNoOpen ();
    }

    /**
     * Removes a component from the opened list.
     */
    public static void close (JDialog d)
    {
        ALL_WINDOWS.remove ( d );
        d.dispose ();

        closeIfNoOpen ();
    }

    /**
     * Check if there's any repeated component loaded into the window list.
     *
     * @param window Window to check.
     *
     * @return This returns true if a component of the same class exists inside
     * the list, otherwise it returns false.
     */
    private static boolean componentExists (Container window)
    {
        boolean windowsExists = false;
        
        try
        {
            for ( Container c : ALL_WINDOWS )
            {
                if ( c.getClass () == window.getClass () )
                {
                    windowsExists = true;
                }
            }
        }
        catch ( NullPointerException e )
        {
            System.out.println ( "Ventana inválida." );
        }
        return windowsExists;
    }

    private static void closeIfNoOpen ()
    {
        if ( ALL_WINDOWS.isEmpty () )
        {
            System.exit ( 0 );
        }
    }

}
