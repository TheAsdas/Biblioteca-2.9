package panels.libro;

import windows.DatabaseEditor;
import windows.Wizard;
import interfaces.Observer;
import java.util.ArrayList;
import javax.swing.*;
import model.*;
import javax.swing.table.DefaultTableModel;
import panels.*;

/**
 * This GUI is a catalog of the avaible books.
 *
 * @author Gustavo
 * @author Gabriel
 *
 * @version 1.2 26/6/2020
 */
public class BookCatalog
  extends abstraction.Catalog
{
    public BookCatalog ()
    {
        initComponents ();
        configComponents ();
    }

    private void configComponents ()
    {
        this.tableModel = (DefaultTableModel) table.getModel ();
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonsPanel = new javax.swing.JPanel();
        buttonDelete = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

        setBackground(resources.Gui.BEIGE);
        setLayout(new java.awt.GridBagLayout());

        panelBackground.setBackground(resources.Gui.BEIGE);
        panelBackground.setLayout(new java.awt.GridBagLayout());

        table.setAutoCreateRowSorter(true);
        table.setBackground(resources.Gui.DARK_BLUE);
        table.setFont(fonts.Fonts.TEXT);
        table.setForeground(resources.Gui.BEIGE);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "ISBN", "Título", "Autor", "Editorial"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        table.setFillsViewportHeight(true);
        table.setRowHeight(40);
        table.setSelectionBackground(resources.Gui.MIDNIGHT_BLUE);
        table.setSelectionForeground(resources.Gui.DARK_BLUE);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelBackground.add(jScrollPane1, gridBagConstraints);

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
        buttonAdd.setToolTipText("Agregar un libro.");
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
        panelBackground.add(buttonsPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 30, 30, 30);
        add(panelBackground, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPressed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPressed
    {//GEN-HEADEREND:event_buttonPressed
        JButton pressedButton = (JButton) evt.getSource ();

        if ( pressedButton == buttonAdd )
        {
            openAddWizard ();
        }
        else if ( pressedButton == buttonDelete )
        {
            dropFromDatabase ();
            update ();
        }
    }//GEN-LAST:event_buttonPressed

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Book Add Wizard">
    @Override
    protected void configAddWizard ()
    {
        //wizard panels
        BookAttributes bookAttributes = new BookAttributes ();
        SimplePicker editorialPicker = configEditorialGui ();
        MultiPicker authorPicker = configAuthorGui ();
        MultiPicker languajePicker = configLanguajeGui ();
        MultiPicker categoryPicker = configCategoryGui ();

        //wizard configuration
        addWizard = new Wizard ( parent, true )
        {
            @Override
            protected void finAction ()
            {
                Libro l = (Libro) addWizard.createdEntry ();

                try
                {
                    dao.Libro.insert ( l );
                    dao.Libro.retrieveIsbn ( l );
                    dao.Autor.insert ( l );
                    dao.Idioma.insert ( l );
                    dao.Categoria.insert ( l );
                }
                catch ( NullPointerException e )
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
        addWizard.setTitle ( "BookWizard" );

        //resumer configuration
        Resumer resume = new Resumer ( addWizard )
        {
            @Override
            protected String generateResume ()
            {
                String resume;
                Libro l = (Libro) addWizard.createdEntry ();

                if ( l != null )
                {
                    this.normalText ();
                    //main attributes resume
                    String editorial = (l.editorial () == null) ?
                      "DESCONOCIDA" : l.editorial ().nombre ();
                    String año = (l.año () > 0) ?
                      l.año () + " D.C." : l.año () * -1 + " A.C.";

                    resume = "El siguiente libro será creado: \n\n" +
                      "Título: " + l.titulo () + "\n" +
                      "Páginas: " + l.paginas () + "\n" +
                      "Año: " + año + "\n" +
                      "Precio: " + l.precio () + "\n" +
                      "Editorial: " + editorial + "\n" +
                      "\n\n";

                    //authors resume
                    resume += "Autores: \n";
                    if ( l.listaAutores ().isEmpty () )
                    {
                        resume += "ANÓNIMO \n\n";
                    }
                    else
                    {
                        for ( Autor a : l.listaAutores () )
                        {
                            resume += a.toString () + "\n";
                        }
                        resume += "\n\n";
                    }

                    //languajes resume
                    resume += "Idiomas: \n";
                    if ( l.listaIdiomas ().isEmpty () )
                    {
                        resume += "NINGUNO \n\n";
                    }
                    else
                    {
                        for ( Idioma i : l.listaIdiomas () )
                        {
                            resume += i.toString () + "\n";
                        }
                        resume += "\n\n";
                    }

                    //categories resume
                    resume += "Categorías: \n";
                    if ( l.listaCategorias ().isEmpty () )
                    {
                        resume += "NINGUNA \n\n";
                    }
                    else
                    {
                        for ( Categoria c : l.listaCategorias () )
                        {
                            resume += c.nombre () + "\n";
                        }
                        resume += "\n\n";
                    }
                    resume += "Haga clic en finalizar para agregar este libro" +
                      " a la base de datos.";
                }
                else
                {
                    this.errorText ();
                    resume = "Se han detectado los siguientes errores:\n\n";
                    if ( !editorialPicker.selectionIsValid () )
                    {
                        resume += "No seleccionó una editorial.\n\n";
                    }
                    if ( !bookAttributes.inputsAreValid () )
                    {
                        resume += "Los datos del libro están incorrectos.\n\n";
                    }
                    resume += "Retroceda y revise.";
                }

                return resume;
            }

            @Override
            protected void createEntry ()
            {
                if ( bookAttributes.inputsAreValid () && editorialPicker.selectionIsValid () )
                {
                    addWizard.setCreatedEntry ( new Libro (
                      bookAttributes.title (),
                      bookAttributes.pages (),
                      bookAttributes.year (),
                      bookAttributes.price (),
                      (Editorial) editorialPicker.getSelection (),
                      languajePicker.getSelection (),
                      authorPicker.getSelection (),
                      categoryPicker.getSelection ()
                    ) );
                }
                else
                {
                    addWizard.setCreatedEntry ( null );
                }
            }

        };

        addWizard.addLayer ( bookAttributes );
        addWizard.addLayer ( editorialPicker );
        addWizard.addLayer ( authorPicker );
        addWizard.addLayer ( languajePicker );
        addWizard.addLayer ( categoryPicker );
        addWizard.addLayer ( resume );
    }

    //<editor-fold defaultstate="collapsed" desc="Editorial GUI">
    private SimplePicker configEditorialGui ()
    {
        DatabaseEditor editor = configEditorialEditor ();
        SimplePicker picker = configEditorialPicker ( editor );
        createObserver ( editor, picker );

        return picker;
    }

    private DatabaseEditor configEditorialEditor ()
    {
        DatabaseEditor editor = new DatabaseEditor ( parent, true )
        {
            @Override
            public void insertIntoDatabase (Object o)
            {
                Editorial e = new Editorial ( (String) o );
                dao.Editorial.insert ( e );
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

        editor.setBannerText (
          "Acá usted puede agregar y quitar editoriales."
        );
        editor.setInfoText (
          "Ingrese editorial:"
        );
        editor.setInputFormat (
          "^([\\w\\d]+\\s)*[\\w\\d]+$"
        );
        editor.setFormatError (
          "palabras compuestas por <br/>" +
          "letras y números, <br/>" +
          "separados por espacios."
        );
        editor.updateList ();
        editor.setTitle ( "EditorialEditor" );

        return editor;
    }

    private SimplePicker configEditorialPicker (DatabaseEditor e)
    {
        SimplePicker picker = new SimplePicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.Window.open ( e );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Editorial.select ();
            }

        };
        picker.setBannerText (
          "Eliga la editorial del libro."
        );
        picker.updateItems ();
        picker.setRequired ( true );

        return picker;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Author GUI">
    private MultiPicker configAuthorGui ()
    {
        DatabaseEditor editor = configAuthorEditor ();
        MultiPicker picker = configAuthorPicker ( editor );
        createObserver ( editor, picker );

        return picker;
    }

    private DatabaseEditor configAuthorEditor ()
    {
        DatabaseEditor editor = new DatabaseEditor ( parent, true )
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

        editor.setBannerText (
          "Acá usted puede agregar y quitar autores."
        );
        editor.setInfoText (
          "Ingrese autor:"
        );
        editor.setInputFormat (
          "^([a-zA-Z]+\\s){2}[a-zA-Z]+$"
        );
        editor.setFormatError (
          "nombre, apellido paterno <br/>" +
          "y materno, separados por <br/>" +
          "espacios. c/u. <br/>" +
          "Ejemplo: <br/>" +
          "Esteban Pablo Trabajos"
        );
        editor.updateList ();
        editor.setTitle ( "AuthorEditor" );

        return editor;
    }

    private MultiPicker configAuthorPicker (DatabaseEditor e)
    {
        MultiPicker picker = new MultiPicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.Window.open ( e );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Autor.select ();
            }

        };
        picker.setBannerText (
          "Eliga el o los autores del libro."
        );
        picker.updateItems ();

        return picker;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Languaje GUI">
    private MultiPicker configLanguajeGui ()
    {
        DatabaseEditor editor = configLanguajeEditor ();
        MultiPicker picker = configLanguajePicker ( editor );
        createObserver ( editor, picker );

        return picker;
    }

    private DatabaseEditor configLanguajeEditor ()
    {
        DatabaseEditor editor = new DatabaseEditor ( parent, true )
        {
            @Override
            public void insertIntoDatabase (Object o)
            {
                dao.Idioma.insert ( new Idioma ( (String) o ) );
            }

            @Override
            public void deleteFromDatabase (Object o)
            {
                dao.Idioma.delete ( (Idioma) o );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Idioma.select ();
            }

        };

        editor.setBannerText (
          "Acá usted puede agregar y quitar idiomas."
        );
        editor.setInfoText (
          "Ingrese idioma:"
        );
        editor.setInputFormat (
          "^[a-zA-ZñÑ]+$"
        );
        editor.setFormatError (
          "solo letras, y sin espacios"
        );
        editor.updateList ();
        editor.setTitle ( "LanguajeEditor" );

        return editor;
    }

    private MultiPicker configLanguajePicker (DatabaseEditor e)
    {
        MultiPicker picker = new MultiPicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.Window.open ( e );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Idioma.select ();
            }

        };
        picker.setBannerText (
          "Eliga el o los idiomas del libro."
        );
        picker.updateItems ();

        return picker;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Category GUI">
    private MultiPicker configCategoryGui ()
    {
        DatabaseEditor editor = configCategoryEditor ();
        MultiPicker picker = configCategoryPicker ( editor );
        createObserver ( editor, picker );

        return picker;
    }

    private DatabaseEditor configCategoryEditor ()
    {
        DatabaseEditor editor = new DatabaseEditor ( parent, true )
        {
            @Override
            public void insertIntoDatabase (Object o)
            {
                dao.Categoria.insert ( new Categoria ( (String) o ) );
            }

            @Override
            public void deleteFromDatabase (Object o)
            {
                dao.Categoria.delete ( (Categoria) o );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Categoria.select ();
            }

        };

        editor.setBannerText (
          "Acá usted puede agregar y quitar categorías."
        );
        editor.setInfoText (
          "Ingrese categoría:"
        );
        editor.setInputFormat (
          "^[a-zA-ZñÑ]+$"
        );
        editor.setFormatError (
          "solo letras, y sin espacios"
        );
        editor.updateList ();
        editor.setTitle ( "CategoryEditor");

        return editor;
    }

    private MultiPicker configCategoryPicker (DatabaseEditor e)
    {
        MultiPicker picker = new MultiPicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.Window.open ( e );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Categoria.select ();
            }

        };
        picker.setBannerText (
          "Eliga la o las categorías del libro."
        );
        picker.updateItems ();

        return picker;
    }
    //</editor-fold>
//</editor-fold>

    @Override
    protected void dropFromDatabase ()
    {
        for ( Object o : getSelection () )
        {
            Libro l = (Libro) o;
            dao.Libro.delete ( l );
            dao.Idioma.delete ( l );
            dao.Categoria.delete ( l );
            dao.Autor.delete ( l );
        }
    }

    @Override
    protected void showEntriesInTable ()
    {
        for ( Object o : entries )
        {
            model.Libro l = (model.Libro) o;

            tableModel.addRow ( new Object[]
            {
                l.isbn (),
                l,
                (l.listaAutores ().isEmpty () ? "ANÓNIMO" : l.autores ()),
                (l.editorial () == null ? "DESCONOCIDA" : l.editorial ())
            } );
        }

    }

    @Override
    protected void retrieveFromDatabase ()
    {
        entries = dao.Libro.select ();

        for ( Object o : entries )
        {
            Libro l = (Libro) o;
            l.setAutores ( dao.Autor.select ( l ) );
            dao.Editorial.select ( l );

        }
    }

    @Override
    protected ArrayList getSelection ()
    {
        ArrayList selectedEntries = new ArrayList ();
        int[] selectedRows = table.getSelectedRows ();

        for ( int i : selectedRows )
        {
            selectedEntries.add ( tableModel.getValueAt ( i, 1 ) );
        }

        return selectedEntries;
    }

    @Override
    protected void configInfoWizard ()
    {

    }

}
