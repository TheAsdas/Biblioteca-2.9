package panels.clients;

import interfaces.Observer;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.*;
import panels.*;
import windows.Wizard;

/**
 * This component is a catalog for clients.
 *
 * @author Gustavo
 * @version 1.0 30/6/2020
 */
public class ClientCatalog
  extends abstraction.Catalog
{

    /**
     * Creates new form Catalog
     */
    public ClientCatalog ()
    {
        initComponents ();
        configComponets ();
    }

    private void configComponets ()
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
        jPanel1 = new javax.swing.JPanel();
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
                "RUT", "Nombre", "Nacimiento"
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

        jPanel1.setBackground(resources.Gui.BEIGE);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.GridBagLayout());

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
        jPanel1.add(buttonDelete, gridBagConstraints);

        buttonAdd.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-add.png"))); // NOI18N
        buttonAdd.setToolTipText("Agregar un cliente.");
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
        jPanel1.add(buttonAdd, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        panelTable.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 30, 30, 30);
        add(panelTable, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

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

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

    @Override
    protected void retrieveFromDatabase ()
    {
        entries = dao.Cliente.select ();

        for ( Object o : entries )
        {
            Cliente c = (Cliente) o;

            c.setCorreos ( dao.Mail.select ( c ) );
            c.setDirecciones ( dao.Direccion.select ( c ) );
            c.setTelefonos ( dao.Telefono.select ( c ) );
        }
    }

    @Override
    protected void configAddWizard ()
    {
        //panel 1: client attributes:
        PersonAttributes attributes = new PersonAttributes ();

        //panel 2: client's birthdate:
        DatePicker birth = new DatePicker ();
        birth.setBannerText ( "Seleccione la fecha de nacimiento." );
        birth.maxToday ();

        //panel 3: client's addresses:
        ListCreator addressCreator = new ListCreator ()
        {
            @Override
            protected Object createEntry (String userInput)
            {
                return new Direccion ( userInput );
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

        //panel 4: client's e-mails":
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

        //panel 5: client's phone numbers
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
                Cliente client = (Cliente) addWizard.createdEntry ();

                try
                {
                    dao.Cliente.insert ( client );
                    for ( Mail m : client.listCorreos () )
                    {
                        dao.Mail.insert ( m, client );
                    }
                    for ( Direccion d : client.listDirecciones () )
                    {
                        dao.Direccion.insert ( d, client );
                    }
                    for ( Telefono t : client.listTelefonos () )
                    {
                        dao.Telefono.insert ( t, client );
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
        addWizard.addLayer ( birth );
        addWizard.addLayer ( addressCreator );
        addWizard.addLayer ( emailCreator );
        addWizard.addLayer ( phoneCreator );
        addWizard.setTitle ( "ClientWizard" );

        //panel 6: resumer
        Resumer resumer = new Resumer ( addWizard )
        {
            @Override
            protected String generateResume ()
            {
                Cliente c = (Cliente) addWizard.createdEntry ();
                String resume;
                if ( c != null )
                {
                    this.normalText ();
                    resume =
                      "El siguiente cliente será creado: \n\n" +
                      "RUT: " + c.rut () + "\n" +
                      "Nombre: " + c.nombre () + "\n" +
                      "Ap. Paterno: " + c.paterno () + "\n" +
                      "Ap. Materno: " + c.materno () + "\n" +
                      "Fecha de nacimiento: " + c.fechaNacimiento () + "\n\n";
                    resume += "Dirección/es: \n";
                    if ( c.listDirecciones ().isEmpty () )
                    {
                        resume += "NINGUNA \n\n";
                    }
                    else
                    {
                        for ( Direccion d : c.listDirecciones () )
                        {
                            resume += d + "\n";
                        }
                        resume += "\n";
                    }
                    resume += "Correo/s: \n";
                    if ( c.listCorreos ().isEmpty () )
                    {
                        resume += "NINGUNO \n\n";
                    }
                    else
                    {
                        for ( Mail m : c.listCorreos () )
                        {
                            resume += m + "\n";
                        }
                        resume += "\n";
                    }
                    resume += "Teléfono/s: \n";
                    if ( c.listTelefonos ().isEmpty () )
                    {
                        resume += "NINGUNO \n\n";
                    }
                    else
                    {
                        for ( Telefono tel : c.listTelefonos () )
                        {
                            resume += tel + "\n";
                        }
                        resume += "\n";
                    }
                    resume += "Haga clic en el botón finalizar para agregar a " +
                      "este cliente.";
                }
                else
                {
                    this.errorText ();
                    resume = "Se ha detectado los siguientes errores:\n\n" +
                      "Los datos no han sido agregados correctamente.\n\n" +
                      "Retroceda y revise.";
                }

                return resume;
            }

            @Override
            protected void createEntry ()
            {
                if ( attributes.inputsAreCorrect () )
                {
                    Cliente c = new Cliente (
                      attributes.rut (),
                      attributes.nombre (),
                      attributes.paterno (),
                      attributes.materno (),
                      birth.fecha () );
                    c.setCorreos ( emailCreator.getEntries () );
                    c.setDirecciones ( addressCreator.getEntries () );
                    c.setTelefonos ( phoneCreator.getEntries () );

                    addWizard.setCreatedEntry ( c );
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
            Cliente c = (Cliente) o;

            dao.Mail.delete ( c );
            dao.Direccion.delete ( c );
            dao.Telefono.delete ( c );

            dao.Cliente.delete ( c );
        }
    }

    @Override
    protected void showEntriesInTable ()
    {
        for ( Object o : entries )
        {
            Cliente c = (Cliente) o;

            tableModel.addRow ( new Object[]
            {
                c.rut (),
                c,
                c.fechaNacimiento ()
            } );
        }
    }

    @Override
    protected ArrayList getSelection ()
    {
        ArrayList selectedEntries = new ArrayList<> ();
        int[] selectedRows = table.getSelectedRows ();

        for ( int i : selectedRows )
        {
            selectedEntries.add ( tableModel.getValueAt ( i, 1 ) );
        }

        return selectedEntries;
    }

}
