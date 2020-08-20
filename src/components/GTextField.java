package components;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

/**
 * A genetically modified JTextField that allows placeholder text.
 *
 * @author Gustavo
 * @version 1.0 18/6/2020
 */
public class GTextField
  extends JTextField
{
    //variables
    private String placeholder = "Sample placeholder text";
    private Color placeholderColor = Color.GRAY;
    private Color textColor = getForeground ();
    private boolean userHasWritten = false;

    public GTextField ()
    {
        super ();
        createFocusListener ();

    }

//<editor-fold defaultstate="collapsed" desc="Setters">
    public void setPlaceholder (String placeholder)
    {
        this.placeholder = placeholder;
        reset ();
    }

    public void setPlaceholderColor (Color c)
    {
        this.placeholderColor = c;
        reset ();
    }

    public void setTextColor (Color c)
    {
        this.textColor = c;
    }

    public void setWrittenStatus (boolean b)
    {
        userHasWritten = b;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    /**
     * Restores this component's placeholder text.
     */
    public final void reset ()
    {
        this.setText ( placeholder );
        this.setForeground ( placeholderColor );
        this.userHasWritten = false;

    }

    /**
     * Use this to retrieve this component's text. This is compatible with the
     * placeholder, so if the user has not written anything, and the placeholder
     * is showing, it will return an empty String.
     *
     * @return Returns a String with the text.
     */
    public String retrieveText ()
    {
        if ( userHasWritten )
        {
            return this.getText ();
        }
        else
        {
            return "";
        }
    }

    /**
     * Use this to define this component's text. This is compatible with the
     * placeholder technology, so it wont collide with the default Swing
     * setting.
     */
    public void defineText (String string)
    {
        if ( string.trim ().isEmpty () && !userHasWritten )
        {
            reset ();
        }
        else
        {
            super.setText ( string.trim () );
            setForeground ( textColor );
            userHasWritten = true;
        }

    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private Methods">
    private void focused ()
    {
        if ( getText ().trim ().equals ( placeholder ) && !userHasWritten )
        {
            setText ( "" );
            setForeground ( textColor );
            userHasWritten = false;
        }
        else
        {
            userHasWritten = true;
        }
    }

    private void unfocused ()
    {
        if ( getText ().trim ().equals ( "" ) )
        {
            setText ( placeholder );
            setForeground ( placeholderColor );
            userHasWritten = false;
        }
        else
        {
            userHasWritten = true;
        }
    }

    private void createFocusListener ()
    {
        addFocusListener ( new FocusListener ()
        {
            @Override
            public void focusGained (FocusEvent fe)
            {
                focused ();
            }

            @Override
            public void focusLost (FocusEvent fe)
            {
                unfocused ();
            }

        } );
    }
//</editor-fold>

}
