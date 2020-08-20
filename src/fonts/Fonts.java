package fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

/**
 * This class loads the fonts into memory when created. The application also
 * retrieves its fonts from here.
 *
 * @author Gustavo
 * @version 1.0 2/6/2020
 */
public final class Fonts
{
    public static Font TITLE;
    public static Font TEXT;

    /**
     * Constructor.
     */
    public Fonts ()
    {
        TITLE = cargarFuente ( "title.otf", 70f );
        TEXT = cargarFuente ( "text.ttf", 30f );
    }

    /**
     * Load a font into memory.
     *
     * @param fontName Font name with extension.
     * @param size Font's size in px. Required to be written with and f at the
     * end.
     *
     * @return Returns a font object.
     */
    private Font cargarFuente (
      String fontName,
      Float size
    )
    {
        try
        {
            //load font's directory
            InputStream directory = getClass ()
              .getResourceAsStream ( fontName );

            //info message
            System.out.println ( "Cargando fuente: " + directory );

            //return new created font object
            return Font
              .createFont ( Font.TRUETYPE_FONT, directory )
              .deriveFont ( size );
        }
        catch ( FontFormatException | IOException e )
        {
            //error handling
            System.out.println ( "Error cargando fuente: " + fontName );

            //return default font
            return new Font ( "Arial", Font.BOLD, size.intValue () );
        }

    }

}
