package windows;

import abstraction.Catalog;
import java.awt.Component;
import java.util.ArrayList;
import resources.*;

/**
 *
 * @author gusta
 */
public class MainMenu
  extends javax.swing.JFrame
{

    //variables
    private ArrayList<Component> menuPanels;

    /**
     * Creates new form MainMenu
     */
    public MainMenu ()
    {
        initComponents ();
        configComponents ();

    }

    /**
     * Makes extra configurations to components.
     */
    private void configComponents ()
    {

        //arraylist config
        menuPanels = new ArrayList<> ();

        //left menu config
        leftMenu.groupButtons ();

        //add every panel from the layer pane into a list
        menuPanels.add ( defaultPane );
        menuPanels.add ( bookCatalog );
        menuPanels.add ( clientCatalog );
        menuPanels.add ( employeeCatalog );
        menuPanels.add ( transactionTabs );

        switchPanel ( defaultPane );

    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonDebug = new javax.swing.JButton();
        leftMenu = new components.GMenu();
        btnLibros = new components.GMenuButton();
        btnTrabajadores = new components.GMenuButton();
        btnClientes = new components.GMenuButton();
        btnTransacciones = new components.GMenuButton();
        layerOptions = new javax.swing.JLayeredPane();
        defaultPane = new javax.swing.JPanel();
        bookCatalog = new panels.libro.BookCatalog();
        employeeCatalog = new panels.trabajador.EmployeeCatalog();
        clientCatalog = new panels.clients.ClientCatalog();
        transactionTabs = new javax.swing.JTabbedPane();
        buyCatalog1 = new panels.transactions.BuyCatalog();
        lendCatalog1 = new panels.transactions.LendCatalog();
        sellCatalog1 = new panels.transactions.SellCatalog();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FastDevelopment's Admin");
        setMinimumSize(new java.awt.Dimension(1200, 1000));
        setSize(new java.awt.Dimension(600, 500));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
        });

        panelTitle.setBackground(resources.Gui.DARK_SLATE_GRAY);
        panelTitle.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(resources.Gui.DARK_SLATE_GRAY);
        jLabel1.setFont(fonts.Fonts.TITLE);
        jLabel1.setForeground(resources.Gui.MIDNIGHT_BLUE);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FastDevelopment");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        panelTitle.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(fonts.Fonts.TEXT);
        jLabel2.setForeground(resources.Gui.MIDNIGHT_BLUE);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrador Literario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        panelTitle.add(jLabel2, gridBagConstraints);

        jSeparator1.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelTitle.add(jSeparator1, gridBagConstraints);

        buttonDebug.setText("Debug");
        buttonDebug.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        panelTitle.add(buttonDebug, gridBagConstraints);
        buttonDebug.setVisible (code.Main.DEBUG_MODE);

        getContentPane().add(panelTitle, java.awt.BorderLayout.PAGE_START);

        btnLibros.setButtonText("Libros");
        btnLibros.setButtonText ("Libros");
        btnLibros.setIcon ("/icons/icon-book.png");
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                menuButtonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        leftMenu.add(btnLibros, gridBagConstraints);

        btnTrabajadores.setButtonText("Trabajadores");
        btnTrabajadores.setButtonText ("Trabajadores");
        btnTrabajadores.setIcon ("/icons/icon-employee.png");
        btnTrabajadores.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                menuButtonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        leftMenu.add(btnTrabajadores, gridBagConstraints);

        btnClientes.setButtonText("Clientes");
        btnClientes.setButtonText ("Clientes");
        btnClientes.setIcon ("/icons/icon-person.png");
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                menuButtonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        leftMenu.add(btnClientes, gridBagConstraints);

        btnTransacciones.setButtonText("Transacciones");
        btnTransacciones.setButtonText ("Transacciones");
        btnTransacciones.setIcon ("/icons/icon-transactions.png");
        btnTransacciones.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                menuButtonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        leftMenu.add(btnTransacciones, gridBagConstraints);

        getContentPane().add(leftMenu, java.awt.BorderLayout.LINE_START);

        layerOptions.setBackground(resources.Gui.DARK_BLUE);
        layerOptions.setForeground(resources.Gui.DARK_BLUE);
        layerOptions.setLayout(new java.awt.CardLayout());

        defaultPane.setBackground(resources.Gui.DARK_BLUE);
        layerOptions.add(defaultPane, "card2");

        bookCatalog.setParent(this);
        layerOptions.add(bookCatalog, "card6");
        layerOptions.add(employeeCatalog, "card6");
        layerOptions.add(clientCatalog, "card6");

        transactionTabs.setFont(fonts.Fonts.TEXT);
        transactionTabs.addTab("Comprar", buyCatalog1);
        transactionTabs.addTab("Arrendar", lendCatalog1);
        transactionTabs.addTab("Vender", sellCatalog1);

        layerOptions.add(transactionTabs, "card6");

        getContentPane().add(layerOptions, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listeners">
    private void menuButtonPressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_menuButtonPressed
    {//GEN-HEADEREND:event_menuButtonPressed
        if ( evt.getSource () == btnLibros )
        {
            switchPanel ( bookCatalog );
        }
        else if ( evt.getSource () == btnTrabajadores )
        {
            switchPanel ( employeeCatalog );
        }
        else if ( evt.getSource () == btnClientes )
        {
            switchPanel ( clientCatalog );
        }
        else if ( evt.getSource () == btnTransacciones )
        {
            switchPanel ( transactionTabs );
        }
    }//GEN-LAST:event_menuButtonPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        Window.close ( this );
    }//GEN-LAST:event_formWindowClosed

    private void buttonPressed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPressed
    {//GEN-HEADEREND:event_buttonPressed
        resources.Window.open ( new Debug () );
    }//GEN-LAST:event_buttonPressed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panels.libro.BookCatalog bookCatalog;
    private components.GMenuButton btnClientes;
    private components.GMenuButton btnLibros;
    private components.GMenuButton btnTrabajadores;
    private components.GMenuButton btnTransacciones;
    private javax.swing.JButton buttonDebug;
    private panels.transactions.BuyCatalog buyCatalog1;
    private panels.clients.ClientCatalog clientCatalog;
    private javax.swing.JPanel defaultPane;
    private panels.trabajador.EmployeeCatalog employeeCatalog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLayeredPane layerOptions;
    private components.GMenu leftMenu;
    private panels.transactions.LendCatalog lendCatalog1;
    private javax.swing.JPanel panelTitle;
    private panels.transactions.SellCatalog sellCatalog1;
    private javax.swing.JTabbedPane transactionTabs;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

    private void switchPanel (Component c)
    {
        hidePanels ();
        if ( c instanceof Catalog )
        {
            Catalog cat = (Catalog) c;
            cat.update ();
        }
        c.setVisible ( true );
    }

    private void hidePanels ()
    {
        for ( Component c : menuPanels )
        {
            c.setVisible ( false );
        }
    }

}
