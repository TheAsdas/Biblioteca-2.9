package components;

import java.awt.*;
import javax.swing.*;

/**
 * This is a custom JPopupMenu, with customizable background color.
 *
 * @author gustavo
 * @version 1.0 - 14/6/2020
 */
public class GPopup extends JPopupMenu
{
    Color bgColor = Color.WHITE;

    public void setColor (Color color)
    {
        bgColor = color;
    }

    @Override
    protected void paintComponent (Graphics g)
    {
        super.paintComponent ( g );
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor ( bgColor );
        g2d.fillRect ( 0, 0, getWidth () - 1, getHeight () - 1 );

    }

}
