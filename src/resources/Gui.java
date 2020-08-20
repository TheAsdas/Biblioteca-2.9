package resources;

import java.awt.Color;

/**
 * This class stores all the colors used in the UI construction, for
 * convinience.
 *
 * @author gustavo
 */
public final class Gui
{
    /**
     * A color that looks red to me.
     */
    public static final Color CRIMSON = new Color ( 232, 47, 48 );

    /**
     * A color that looks blue to me.
     */
    public static final Color MIDNIGHT_BLUE = new Color ( 36, 70, 165 );

    /**
     * A color that looks like skin to me.
     */
    public static final Color BEIGE = new Color ( 233, 211, 190 );

    /**
     * A color that looks black to me.
     */
    public static final Color DARK_SLATE_GRAY = new Color ( 20, 22, 28 );

    /**
     * A color that looks blue to me, but somewhat more opaque.
     */
    public static final Color DARK_BLUE = new Color ( 0, 0, 38 );
    
    /**
     * Sets the UI skin for this app.
     *
     * @param skin String with the sking to use.
     */
    public static void defineSkin (
      String skin)
    {
        //set the app looks and feel
        try
        {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels () )
            {
                if ( skin.equals ( info.getName () ) )
                {
                    javax.swing.UIManager.setLookAndFeel ( info.getClassName () );
                    System.out.println ( "UI cargada correctamente." );
                    break;
                }
            }
        }
        catch ( Exception e )
        {
            System.out.println ( "Error cargando UI: \n" + e );
        }
    }
    
}
