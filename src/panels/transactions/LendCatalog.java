/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.transactions;

import windows.Wizard;
import interfaces.Observer;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.*;
import panels.*;

/**
 * This panel is a catalog that shows lend transactions.
 *
 * @author Gustavo
 * @version 1.0 2/7/2020
 */
public class LendCatalog
  extends abstraction.Catalog
{
    public LendCatalog ()
    {
        initComponents ();
        tableModel = (DefaultTableModel) table.getModel ();
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        componentsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonsPanel = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setBackground(resources.Gui.BEIGE);
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        componentsPanel.setBackground(resources.Gui.BEIGE);
        componentsPanel.setLayout(new java.awt.GridBagLayout());

        table.setBackground(resources.Gui.DARK_BLUE);
        table.setFont(fonts.Fonts.TEXT);
        table.setForeground(resources.Gui.BEIGE);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "ID", "Arrendado el", "Devolverse el", "Arrendado por", "Arrendado a"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        table.setFillsViewportHeight(true);
        table.setGridColor(resources.Gui.MIDNIGHT_BLUE);
        table.setRowHeight(40);
        table.setSelectionBackground(resources.Gui.MIDNIGHT_BLUE);
        table.setSelectionForeground(resources.Gui.DARK_BLUE);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(0).setMinWidth(100);
            table.getColumnModel().getColumn(0).setPreferredWidth(100);
            table.getColumnModel().getColumn(0).setMaxWidth(500);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        componentsPanel.add(jScrollPane1, gridBagConstraints);

        buttonsPanel.setBackground(resources.Gui.BEIGE);
        buttonsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonsPanel.setLayout(new java.awt.GridBagLayout());

        buttonAdd.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-add.png"))); // NOI18N
        buttonAdd.setToolTipText("Haga clic acá para crear una compra.");
        buttonAdd.setMaximumSize(new java.awt.Dimension(60, 60));
        buttonAdd.setMinimumSize(new java.awt.Dimension(60, 60));
        buttonAdd.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        buttonsPanel.add(buttonAdd, gridBagConstraints);

        buttonDelete.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-remove.png"))); // NOI18N
        buttonDelete.setToolTipText("Haga clic acá para eliminar las compras seleccionadas.");
        buttonDelete.setMaximumSize(new java.awt.Dimension(60, 60));
        buttonDelete.setMinimumSize(new java.awt.Dimension(60, 60));
        buttonDelete.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        buttonsPanel.add(buttonDelete, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        componentsPanel.add(buttonsPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(componentsPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown
        update ();
    }//GEN-LAST:event_formComponentShown

    private void buttonPressed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPressed
    {//GEN-HEADEREND:event_buttonPressed
        {
            JButton buttonPressed = (JButton) evt.getSource ();

            if ( buttonPressed == buttonAdd )
            {
                openAddWizard ();
            }
            else if ( buttonPressed == buttonDelete )
            {
                dropFromDatabase ();
                update ();
            }
        }
    }//GEN-LAST:event_buttonPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel componentsPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

    @Override
    protected void retrieveFromDatabase ()
    {
        entries = dao.Arriendo.select ();

        for ( Object o : entries )
        {
            Arriendo a = (Arriendo) o;
            dao.Cliente.select ( a );
            dao.Trabajador.select ( a );
            dao.Libro.select ( a );
        }
    }

    @Override
    protected void configAddWizard ()
    {
        //panel 1: select employee
        SimplePicker employeePicker = new SimplePicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.ThrowError.interfaceInvalid ( new RuntimeException (
                  "Kachigga, my nigga." ) );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Trabajador.select ();
            }

        };
        employeePicker.setBannerText ( "Seleccione el empleado que hará " +
          "la transacción." );
        employeePicker.updateItems ();
        employeePicker.setRequired ( true );
        employeePicker.toggleConfigButton ( false );

        //panel 2: select client
        SimplePicker clientPicker = new SimplePicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.ThrowError.interfaceInvalid ( new RuntimeException (
                  "Kachigga, my nigga." ) );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Cliente.select ();
            }

        };
        clientPicker.setBannerText ( "Seleccione el cliente que arrendará el" +
          "libro." );
        clientPicker.updateItems ();
        clientPicker.setRequired ( true );
        clientPicker.toggleConfigButton ( false );

        //panel 3: select libro
        SimplePicker bookPicker = new SimplePicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.ThrowError.interfaceInvalid (
                  new RuntimeException ( "Kachigga, my nigga." ) );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                ArrayList<Libro> libros = dao.Libro.select ();
                for ( Libro l : libros )
                {
                    dao.Editorial.select ( l );
                }

                return libros;
            }

        };
        bookPicker.toggleConfigButton ( false );
        bookPicker.setBannerText ( "Eliga el libro que quiere arrendar." );
        bookPicker.setRequired ( true );
        bookPicker.updateItems ();

        //panel 3: select quantity/price/tax
        QuantityChooser bookQuantity = new QuantityChooser ();

        //panel 4: choose date
        DatePicker datePicker = new DatePicker ();
        datePicker.setBannerText ( "Seleccione la fecha de devolución." );
        datePicker.minToday ();

        //wizard config
        addWizard = new Wizard ( parent, true )
        {
            @Override
            protected void finAction ()
            {
                Arriendo a = (Arriendo) addWizard.createdEntry ();
                dao.Arriendo.insert ( a );
            }

        };
        addWizard.setTitle ( "LendWizard" );
        addWizard.addLayer ( employeePicker );
        addWizard.addLayer ( clientPicker );
        addWizard.addLayer ( bookPicker );
        addWizard.addLayer ( bookQuantity );
        addWizard.addLayer ( datePicker );
        addWizard.addObserver ( new Observer ()
        {
            @Override
            public void methodHappened ()
            {
                update ();
            }

        } );

        //panel 5: resumer
        Resumer resumer = new Resumer ( addWizard )
        {
            @Override
            protected String generateResume ()
            {
                Arriendo a = (Arriendo) addWizard.createdEntry ();
                String resume;

                if ( a != null )
                {
                    this.normalText ();
                    resume = "Usted efectuará el siguiente arriendo: \n" +
                      "Libro: " + a.libro () + "\n" +
                      "Editorial: " + a.libro ().editorial () + "\n\n" +
                      "Datos de la transacción: \n" +
                      "Cantidad: " + a.cantidad () + "\n" +
                      "Precio: $" + a.precio () + "\n" +
                      "IVA: %" + a.iva () * 100 + "\n" +
                      "Total: $" + a.total () + ". \n\n" +
                      "Si está seguro de que esto está correcto, presione " +
                      "finalizar para ingresar esta transacción a la base de " +
                      "datos.";
                }
                else
                {
                    this.errorText ();
                    resume = "Se han detectado los siguientes errores: \n\n";
                    if ( !employeePicker.selectionIsValid () )
                    {
                        resume += "Usted no seleccionó un empleado.\n\n";
                    }
                    if ( !clientPicker.selectionIsValid () )
                    {
                        resume += "Usted no seleccionó un distribuidor.\n\n";
                    }
                    if ( !bookPicker.selectionIsValid () )
                    {
                        resume += "Usted no seleccionó un libro.\n\n";
                    }
                    if ( !bookQuantity.inputsAreCorrect () )
                    {
                        resume += "Los datos de venta están incorrectos. \n\n";
                    }
                    resume += "Retroceda y revise.";
                }

                return resume;
            }

            @Override
            protected void createEntry ()
            {
                if ( employeePicker.selectionIsValid () &&
                  clientPicker.selectionIsValid () &&
                  bookPicker.selectionIsValid () &&
                  bookQuantity.inputsAreCorrect () )
                {
                    addWizard.setCreatedEntry ( new Arriendo (
                      datePicker.today (),
                      datePicker.fecha (),
                      bookQuantity.cantidad (),
                      bookQuantity.precio (),
                      bookQuantity.iva (),
                      (Trabajador) employeePicker.getSelection (),
                      (Cliente) clientPicker.getSelection (),
                      (Libro) bookPicker.getSelection () )
                    );
                }
                else
                {
                    addWizard.setCreatedEntry ( null );
                }
            }

        };
        addWizard.addLayer ( resumer );

    }

    @Override

    protected void configInfoWizard ()
    {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void dropFromDatabase ()
    {
        for ( Object o : getSelection () )
        {
            Arriendo a = (Arriendo) o;
            dao.Arriendo.delete ( a );
        }
    }

    @Override
    protected void showEntriesInTable ()
    {
        for ( Object o : entries )
        {
            Arriendo a = (Arriendo) o;
            tableModel.addRow ( new Object[]
            {
                a,
                a.fecha (),
                a.fechaDevolucion (),
                a.trabajador (),
                a.cliente ()
            } );

        }
    }

    @Override
    protected ArrayList getSelection ()
    {
        int[] selectedRows = table.getSelectedRows ();
        ArrayList selectedObjects = new ArrayList ();

        for ( int i : selectedRows )
        {
            selectedObjects.add ( tableModel.getValueAt ( i, 0 ) );
        }

        return selectedObjects;
    }

}
