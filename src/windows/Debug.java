/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import panels.SimplePicker;
import panels.MultiPicker;
import model.Editorial;
import model.Autor;
import abstraction.Picker;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import panels.libro.*;
import interfaces.*;
import panels.ListCreator;
import panels.Resumer;
import panels.PersonAttributes;
import panels.DatePicker;
import panels.QuantityChooser;

/**
 *
 * @author gusta
 */
public class Debug
  extends javax.swing.JFrame
{
    //variables
    private JPanel selectedFrame;
    
    public Debug ()
    {
        initComponents ();
        configComponents ();
    }
    
    private void configComponents ()
    {
        this.comboChoseFrame.removeAllItems ();
        
        selectedFrame = mainPanel;
        
        this.comboChoseFrame.addItem ( "Nothing" );
        this.comboChoseFrame.addItem ( "Book Attributes" );
        this.comboChoseFrame.addItem ( "Simple Picker (Editorial)" );
        this.comboChoseFrame.addItem ( "Multiple Picker (Author)" );
        this.comboChoseFrame.addItem ( "Wizard test" );
        this.comboChoseFrame.addItem ( "Resumer test" );
        this.comboChoseFrame.addItem ( "Person Attributes Test" );
        this.comboChoseFrame.addItem ( "Recruitment test" );
        this.comboChoseFrame.addItem ( "List Creator test" );
        this.comboChoseFrame.addItem ( "Distribuidor test" );
        this.comboChoseFrame.addItem ( "Quantity Picker test" );
        
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        comboChoseFrame = new javax.swing.JComboBox<>();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Debug Window OwO");
        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
        });

        comboChoseFrame.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                comboChoseFrameActionPerformed(evt);
            }
        });
        getContentPane().add(comboChoseFrame, java.awt.BorderLayout.PAGE_START);

        mainPanel.setBackground(resources.Gui.DARK_BLUE);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listeners">
    private void comboChoseFrameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboChoseFrameActionPerformed
    {//GEN-HEADEREND:event_comboChoseFrameActionPerformed
        checkIndex ( this.comboChoseFrame.getSelectedIndex () );
    }//GEN-LAST:event_comboChoseFrameActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        resources.Window.close ( this );
    }//GEN-LAST:event_formWindowClosed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> comboChoseFrame;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private Methods">
    private void checkIndex (int comboIndex)
    {
        switch ( comboIndex )
        {
            case 0:
                setFrame ( mainPanel );
                break;
            case 1:
                setFrame ( new BookAttributes () );
                break;
            case 2:
                setFrame ( configEditorialGui () );
                break;
            case 3:
                setFrame ( configAuthorGui () );
                break;
            case 4:
                setFrame ( mainPanel );
                resources.Window.open ( configWizard () );
                break;
            case 5:
                setFrame ( configResumer () );
                break;
            case 6:
                setFrame ( new PersonAttributes () );
                break;
            case 7:
                setFrame ( new DatePicker () );
                break;
            case 8:
                setFrame ( configListCreator () );
                break;
            case 9:
                setFrame ( mainPanel );
                resources.Window.open ( new DistributorEditor ( this, true ) );
                break;
            case 10:
                setFrame ( new QuantityChooser () );
                break;
            default:
                resources.ThrowError.debugInvalidFrame ();
        }
    }
    
    private void setFrame (JPanel p)
    {
        this.remove ( selectedFrame );
        this.add ( p, BorderLayout.CENTER );
        selectedFrame = p;
        redrawWindow ();
        
    }
    
    private void redrawWindow ()
    {
        this.invalidate ();
        this.validate ();
        this.repaint ();
    }
    
    private void createObserver (
      DatabaseEditor editor,
      Picker picker)
    {
        editor.addObserver ( new Observer ()
        {
            @Override
            public void methodHappened ()
            {
                picker.updateItems ();
            }
            
        } );
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Editorial Config">
    private SimplePicker configEditorialGui ()
    {
        DatabaseEditor editor = editorialEditor ();
        SimplePicker picker = editorialPicker ( editor );
        createObserver ( editor, picker );
        
        return picker;
    }
    
    private static SimplePicker editorialPicker (
      DatabaseEditor editor)
    {
        SimplePicker picker = new SimplePicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.Window.open ( editor );
            }
            
            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Editorial.select ();
            }
            
        };
        picker.setBannerText ( "Seleccione la editorial. Si no sabe cuál es, " +
          "eliga la opción 'Desconocida'. " );
        picker.updateItems ();
        
        return picker;
    }
    
    private DatabaseEditor editorialEditor ()
    {
        DatabaseEditor editor = new DatabaseEditor (
          this,
          true )
        {
            @Override
            public void insertIntoDatabase (Object o)
            {
                dao.Editorial.insert ( new Editorial (
                  (String) o ) );
                
            }
            
            @Override
            public void deleteFromDatabase (Object o)
            {
                dao.Editorial.delete ( (Editorial) o );
            }
            
            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Editorial.select ();
            }
            
        };
        
        editor.setBannerText ( "Agregar o quitar editoriales." );
        editor.setInfoText ( "Nombre de editorial:" );
        editor.setInputFormat ( "^([\\w\\d]+\\s)*[\\w\\d]+$" );
        editor.setFormatError ( "Letras y números, separados por espacios." );
        editor.updateList ();
        
        return editor;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Author Config">
    private MultiPicker configAuthorGui ()
    {
        DatabaseEditor editor = authorEditor ();
        MultiPicker picker = authorPicker ( editor );
        createObserver ( editor, picker );
        
        return picker;
    }
    
    private DatabaseEditor authorEditor ()
    {
        DatabaseEditor editor = new DatabaseEditor (
          this,
          true )
        {
            @Override
            public void insertIntoDatabase (Object o)
            {
                String userInput = (String) o;
                String[] vars = userInput.split ( " " );
                
                dao.Autor.insert ( new Autor (
                  vars[0],
                  vars[1],
                  vars[2] ) );
            }
            
            @Override
            public void deleteFromDatabase (Object o)
            {
                dao.Autor.delete ( (Autor) o );
            }
            
            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Autor.select ();
            }
            
        };
        editor.setBannerText ( "Agregar/quitar autores." );
        editor.setInfoText ( "Nombre del autor:" );
        editor.setInputFormat ( "^([a-zA-Z]+\\s){2}[a-zA-Z]+$" );
        editor.setFormatError ( "Solo letras. <br/>" +
          "Nombre, apellido materno y paterno. <br/>" +
          "Ej: Joseph Vissarionovich Stalin" );
        editor.updateList ();
        
        return editor;
    }
    
    private MultiPicker authorPicker (DatabaseEditor editor)
    {
        Picker picker = new MultiPicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.Window.open ( editor );
            }
            
            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Autor.select ();
            }
            
        };
        picker.setBannerText ( "Seleccione los autores. Puede seleccionar " +
          "más de uno. En caso de que sea un libro anónimo, no seleccione" +
          " nada." );
        picker.updateItems ();
        
        return (MultiPicker) picker;
    }
//</editor-fold>

    private Container configWizard ()
    {
        Wizard wizard = new Wizard (
          this,
          true )
        {
            @Override
            protected void finAction ()
            {
                System.out.println ( "Kachigga, my nigga." );
            }
            
        };
        
        JPanel p = new JPanel ();
        p.setBackground ( Color.yellow );
        wizard.addLayer ( p );
        p = new JPanel ();
        p.setBackground ( Color.red );
        wizard.addLayer ( p );
        
        wizard.setTitle ( "Wizard test" );
        
        return wizard;
    }
    
    private Resumer configResumer ()
    {
        Resumer r = new Resumer ( null )
        {
            @Override
            protected String generateResume ()
            {
                return "Kachigga, my Nigga";
            }
            
            @Override
            protected void createEntry ()
            {
                //do nothing
            }
            
        };
        
        r.setResumeText ( "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
          "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" );
        
        return r;
    }
    
    private JPanel configListCreator ()
    {
        ListCreator creator = new ListCreator ()
        {
            @Override
            protected Object createEntry (String userInput)
            {
                return userInput;
            }
            
        };
        
        creator.setInputRegex ( "^[A-Z0-9]+@[A-Z0-9]+\\.[A-Z]+$" );
        creator.setErrorMessage (
          "Correos electrónicos conformados <br/>" +
          "por números y letras. <br/>" +
          "Ej: ejemplo@dominio.com" );
        creator.setBannerText ( "Ingrese el o los e-mails." );
        creator.setLabelText ( "Correo electrónico:" );
        return creator;
    }
    
}
