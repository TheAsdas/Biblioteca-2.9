/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.plaf.synth.SynthFormattedTextFieldUI;
import javax.swing.text.JTextComponent;

/**
 *
 * @author gusta
 */
public class GSpinner
  extends JSpinner
{
    //variables
    private Color bgColor = getBackground ();
    private Color textColor = getForeground ();

    public GSpinner ()
    {
        super ();
        repaintSpinner ();
    }

    public void setBgColor (Color bgColor)
    {
        this.bgColor = bgColor;
        repaintSpinner ();
    }

    public void setTextColor (Color textColor)
    {
        this.textColor = textColor;
        repaintSpinner ();
    }

    private void repaintSpinner ()
    {
        JComponent editor = this.getEditor ();

        for ( int i = 0; i < editor.getComponentCount (); i++ )
        {
            final Component comp = editor.getComponent ( i );
            if ( comp instanceof JTextComponent )
            {
                comp.setForeground ( textColor );
                ((JTextComponent) comp).setUI ( new SynthFormattedTextFieldUI ()
                {
                    @Override
                    protected void paint (
                      javax.swing.plaf.synth.SynthContext context,
                      java.awt.Graphics g)
                    {
                        g.setColor ( bgColor );
                        g.fillRect ( 3, 3, getComponent ().getWidth () - 3, getComponent ().getHeight () - 6 );
                        super.paint ( context, g );
                    }

                 ;
            }

             );
            }
            else if ( comp instanceof JButton )
            {
                setBackground ( resources.Gui.MIDNIGHT_BLUE );
            }
        }
    }

}
