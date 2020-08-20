/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.trabajador;

import panels.DatePicker;
import interfaces.Observer;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.Direccion;
import model.Mail;
import model.Telefono;
import model.Trabajador;
import panels.ListCreator;
import panels.PersonAttributes;
import panels.Resumer;
import windows.Wizard;

/**
 *
 * @author gusta
 */
public class EmployeeCatalog
  extends abstraction.Catalog
{
    public EmployeeCatalog ()
    {
        initComponents ();
        configComponents ();
    }

    private void configComponents ()
    {
        tableModel = (DefaultTableModel) table.getModel ();
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonsPanel = new javax.swing.JPanel();
        buttonDelete = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

        setBackground(resources.Gui.BEIGE);
        setLayout(new java.awt.GridBagLayout());

        panelTable.setBackground(resources.Gui.BEIGE);
        panelTable.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBackground(resources.Gui.DARK_BLUE);
        jScrollPane1.setForeground(resources.Gui.BEIGE);

        table.setBackground(resources.Gui.DARK_BLUE);
        table.setFont(fonts.Fonts.TEXT);
        table.setForeground(resources.Gui.BEIGE);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"123-4", "Gustavo Herrera C", "26/6/2020"},
                {"785-6", "Scrungus Mungus B", "26/6/2020"},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "RUT", "Nombre", "Contratado"
            }
        ));
        table.setFillsViewportHeight(true);
        table.setGridColor(resources.Gui.MIDNIGHT_BLUE);
        table.setRowHeight(40);
        table.setSelectionBackground(resources.Gui.MIDNIGHT_BLUE);
        table.setSelectionForeground(resources.Gui.DARK_BLUE);
        jScrollPane1.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelTable.add(jScrollPane1, gridBagConstraints);

        buttonsPanel.setBackground(resources.Gui.BEIGE);
        buttonsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonsPanel.setLayout(new java.awt.GridBagLayout());

        buttonDelete.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-remove.png"))); // NOI18N
        buttonDelete.setToolTipText("Quitar entradas seleccionadas.");
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
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        buttonsPanel.add(buttonDelete, gridBagConstraints);

        buttonAdd.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-add.png"))); // NOI18N
        buttonAdd.setToolTipText("Agregar un empleado.");
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
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        buttonsPanel.add(buttonAdd, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        panelTable.add(buttonsPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 30, 30, 30);
        add(panelTable, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listeners">
    private void buttonPressed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPressed
    {//GEN-HEADEREND:event_buttonPressed
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
    }//GEN-LAST:event_buttonPressed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

    @Override
    public void dropFromDatabase ()
    {
        for ( Object o : getSelection () )
        {
            Trabajador t = (Trabajador) o;

            dao.Direccion.delete ( t );
            dao.Mail.delete ( t );
            dao.Telefono.delete ( t );

            dao.Trabajador.delete ( t );
        }
    }

    @Override
    protected void retrieveFromDatabase ()
    {
        entries = dao.Trabajador.select ();
    }

    @Override
    protected void showEntriesInTable ()
    {
        for ( Object o : entries )
        {
            model.Trabajador t = (model.Trabajador) o;

            tableModel.addRow ( new Object[]
            {
                t.rut (),
                t,
                t.fechaContrato ()
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
            selectedObjects.add ( tableModel.getValueAt ( i, 1 ) );
        }

        return selectedObjects;
    }

    @Override
    protected void configInfoWizard ()
    {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void configAddWizard ()
    {
        //panel 1: employee attributes
        PersonAttributes attributes = new PersonAttributes ();

        //panel 2: employee's recruitment
        DatePicker recruitment = new DatePicker ();
        recruitment.setBannerText ( "Seleccione la fecha de contratación." );

        //panel 3: employee's addresses
        ListCreator addressCreator = new ListCreator ()
        {
            @Override
            protected Object createEntry (String userInput)
            {
                return new model.Direccion ( userInput );
            }

        };
        abstraction.Configurator.configListCreator (
          addressCreator,
          "Ingrese la o las direcciones.",
          "Dirección:",
          "^[A-Z 0-9 \\s \\, ÁÉÍÓÚ Ñ]+$",
          "Letras y números, separados <br/>" +
          "por comas o espacios. <br/>" +
          "Ej: Calle 123, Región, País" );

        //panel 4: employee's e-mails
        ListCreator emailCreator = new ListCreator ()
        {
            @Override
            protected Object createEntry (String userInput)
            {
                return new model.Mail ( userInput );
            }

        };
        abstraction.Configurator.configListCreator (
          emailCreator,
          "Ingrese el o los e-mails.",
          "E-mail: ",
          "^[A-Z0-9]+@[A-Z0-9]+\\.[A-Z]+$",
          "Correos electrónicos conformados <br/>" +
          "por números y letras. <br/>" +
          "Ej: ejemplo@dominio.com" );

        //panel 5: employee's phone numbers
        ListCreator phoneCreator = new ListCreator ()
        {
            @Override
            protected Object createEntry (String userInput)
            {
                return new model.Telefono ( userInput );
            }

        };
        abstraction.Configurator.configListCreator (
          phoneCreator,
          "Ingrese el o los teléfonos.",
          "Teléfono:",
          "^[0-9]+-[0-9]+$",
          "Números separados por guiones.<br/>" +
          "Ej: 569-12345678" );

        //wizard creation
        addWizard = new Wizard ( parent, true )
        {
            @Override
            protected void finAction ()
            {
                Trabajador employee = (Trabajador) addWizard.createdEntry ();

                try
                {
                    dao.Trabajador.insert ( employee );
                    for ( Mail m : employee.listCorreos () )
                    {
                        dao.Mail.insert ( m, employee );
                    }
                    for ( Direccion d : employee.listDirecciones () )
                    {
                        dao.Direccion.insert ( d, employee );
                    }
                    for ( Telefono t : employee.listTelefonos () )
                    {
                        dao.Telefono.insert ( t, employee );
                    }
                }
                catch ( Exception e )
                {
                    resources.ThrowError.wizardFailed ( e );
                }
            }

        };
        addWizard.addObserver ( new Observer ()
        {
            @Override
            public void methodHappened ()
            {
                update ();
            }

        } );
        addWizard.addLayer ( attributes );
        addWizard.addLayer ( recruitment );
        addWizard.addLayer ( addressCreator );
        addWizard.addLayer ( emailCreator );
        addWizard.addLayer ( phoneCreator );
        addWizard.setTitle ( "EmployeeWizard" );

        //panel 6: resumer
        Resumer resumer = new Resumer ( addWizard )
        {
            @Override
            protected String generateResume ()
            {
                Trabajador t = (Trabajador) addWizard.createdEntry ();
                String resume;
                if ( t != null )
                {
                    this.normalText ();
                    resume =
                      "El siguiente trabajador será creado: \n\n" +
                      "RUT: " + t.rut () + "\n" +
                      "Nombre: " + t.nombre () + "\n" +
                      "Ap. Paterno: " + t.paterno () + "\n" +
                      "Ap. Materno: " + t.materno () + "\n" +
                      "Contratado el: " + t.fechaContrato () + "\n\n";
                    resume += "Dirección/es: \n";
                    if ( t.listDirecciones ().isEmpty () )
                    {
                        resume += "NINGUNA \n\n";
                    }
                    else
                    {
                        for ( Direccion d : t.listDirecciones () )
                        {
                            resume += d + "\n";
                        }
                        resume += "\n";
                    }
                    resume += "Correo/s: \n";
                    if ( t.listCorreos ().isEmpty () )
                    {
                        resume += "NINGUNO \n\n";
                    }
                    else
                    {
                        for ( Mail m : t.listCorreos () )
                        {
                            resume += m + "\n";
                        }
                        resume += "\n";
                    }
                    resume += "Teléfono/s: \n";
                    if ( t.listTelefonos ().isEmpty () )
                    {
                        resume += "NINGUNO \n\n";
                    }
                    else
                    {
                        for ( Telefono tel : t.listTelefonos () )
                        {
                            resume += tel + "\n";
                        }
                        resume += "\n";
                    }
                    resume += "Haga clic en el botón finalizar para agregar a " +
                      "este empleado.";
                }
                else
                {
                    this.errorText ();
                    resume = "Los datos del empleado no han sido agregados " +
                      "correctamente.\n\n" +
                      "Retroceda y revise.";
                }

                return resume;
            }

            @Override
            protected void createEntry ()
            {

                if ( attributes.inputsAreCorrect () )
                {
                    Trabajador t = new Trabajador (
                      attributes.rut (),
                      attributes.nombre (),
                      attributes.paterno (),
                      attributes.materno (),
                      recruitment.fecha () );
                    t.setCorreos ( emailCreator.getEntries () );
                    t.setDirecciones ( addressCreator.getEntries () );
                    t.setTelefonos ( phoneCreator.getEntries () );

                    addWizard.setCreatedEntry ( t );
                }
                else
                {
                    addWizard.setCreatedEntry ( null );
                }
            }

        };
        addWizard.addLayer ( resumer );
    }

}
