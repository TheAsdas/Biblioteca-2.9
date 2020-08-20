package windows;

import dao.Session;
import dao.Connector;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import resources.*;

/**
 *
 * @author gusta
 */
public class Login
  extends javax.swing.JFrame
{
    private Object Box;

    /**
     * Constructor.
     */
    public Login ()
    {
        initComponents ();
        
    }
    
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelForm = new javax.swing.JPanel();
        buttonConnect = new javax.swing.JButton();
        inputPass = new javax.swing.JPasswordField();
        inputUser = new javax.swing.JTextField();
        labelInfo = new javax.swing.JLabel();
        panelTitle = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("¡Bienvenido!");
        setBackground(new java.awt.Color(233, 211, 190));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(233, 211, 190));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 500));
        setType(java.awt.Window.Type.POPUP);

        panelForm.setBackground(resources.Gui.MIDNIGHT_BLUE);
        panelForm.setBorder(null);
        panelForm.setName(""); // NOI18N
        panelForm.setLayout(new java.awt.GridBagLayout());

        buttonConnect.setBackground(resources.Gui.BEIGE);
        buttonConnect.setFont(fonts.Fonts.TEXT);
        buttonConnect.setForeground(resources.Gui.DARK_SLATE_GRAY);
        buttonConnect.setText("Conectar");
        buttonConnect.setMinimumSize (new Dimension(
            /* x */ buttonConnect.getWidth (), 
            /* y */ buttonConnect.getHeight ()));
    buttonConnect.addMouseListener(new java.awt.event.MouseAdapter()
    {
        public void mouseExited(java.awt.event.MouseEvent evt)
        {
            buttonConnectMouseExited(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt)
        {
            buttonConnectMousePressed(evt);
        }
    });
    buttonConnect.addActionListener(new java.awt.event.ActionListener()
    {
        public void actionPerformed(java.awt.event.ActionEvent evt)
        {
            buttonConnectAction(evt);
        }
    });
    buttonConnect.addKeyListener(new java.awt.event.KeyAdapter()
    {
        public void keyPressed(java.awt.event.KeyEvent evt)
        {
            btnEnterPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt)
        {
            btnEnterReleased(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipady = 30;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
    panelForm.add(buttonConnect, gridBagConstraints);

    inputPass.setBackground(resources.Gui.BEIGE);
    inputPass.setFont(fonts.Fonts.TEXT);
    inputPass.setForeground(java.awt.Color.gray);
    inputPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    inputPass.setText("password");
    inputPass.setPreferredSize(new java.awt.Dimension(100, 30));
    inputPass.addFocusListener(new java.awt.event.FocusAdapter()
    {
        public void focusGained(java.awt.event.FocusEvent evt)
        {
            inputPassFocused(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt)
        {
            inputPassUnfocused(evt);
        }
    });
    inputPass.addKeyListener(new java.awt.event.KeyAdapter()
    {
        public void keyReleased(java.awt.event.KeyEvent evt)
        {
            inputPassEnter(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipady = 30;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
    panelForm.add(inputPass, gridBagConstraints);

    inputUser.setBackground(resources.Gui.BEIGE);
    inputUser.setFont(fonts.Fonts.TEXT);
    inputUser.setForeground(java.awt.Color.gray);
    inputUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    inputUser.setText("username");
    inputUser.setPreferredSize(new java.awt.Dimension(100, 30));
    inputUser.addFocusListener(new java.awt.event.FocusAdapter()
    {
        public void focusGained(java.awt.event.FocusEvent evt)
        {
            inputUserFocused(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt)
        {
            inputUserUnfocused(evt);
        }
    });
    inputUser.addKeyListener(new java.awt.event.KeyAdapter()
    {
        public void keyReleased(java.awt.event.KeyEvent evt)
        {
            inputUserEnter(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipady = 30;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
    panelForm.add(inputUser, gridBagConstraints);
    inputUser.setBackground (resources.Gui.BEIGE);

    labelInfo.setFont(fonts.Fonts.TEXT);
    labelInfo.setForeground(resources.Gui.BEIGE);
    labelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelInfo.setText("Por favor, ingrese sus credenciales.");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipady = 30;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
    panelForm.add(labelInfo, gridBagConstraints);

    panelTitle.setBackground(resources.Gui.DARK_SLATE_GRAY);
    panelTitle.setLayout(new java.awt.GridBagLayout());

    labelTitle.setBackground(resources.Gui.DARK_SLATE_GRAY);
    labelTitle.setFont(fonts.Fonts.TITLE);
    labelTitle.setForeground(resources.Gui.BEIGE);
    labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    labelTitle.setText("FastDevelopment");
    labelTitle.setFocusable(false);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
    panelTitle.add(labelTitle, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
    panelForm.add(panelTitle, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.weightx = 1.0;
    panelForm.add(filler1, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.weightx = 1.0;
    panelForm.add(filler2, gridBagConstraints);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panelForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listener Actions">
    /**
     * Creates a sesssion and does a test connection to DB.
     */
    private void buttonConnectAction(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonConnectAction
    {//GEN-HEADEREND:event_buttonConnectAction
        createSession ();
        testConnection ();
    }//GEN-LAST:event_buttonConnectAction
    

    private void inputUserFocused(java.awt.event.FocusEvent evt)//GEN-FIRST:event_inputUserFocused
    {//GEN-HEADEREND:event_inputUserFocused
        if ( inputUser.getText ().trim ().equals ( "username" ) ||
          inputUser.getForeground () == Gui.CRIMSON )
        {
            inputUser.setText ( "" );
            inputUser.setForeground ( Gui.DARK_SLATE_GRAY );
        }

    }//GEN-LAST:event_inputUserFocused

    /**
     * When inputUser gets unfocused. Makes the text lighter and adds the
     * default text to the user field if it is empty.
     *
     * @param evt
     */
    private void inputUserUnfocused(java.awt.event.FocusEvent evt)//GEN-FIRST:event_inputUserUnfocused
    {//GEN-HEADEREND:event_inputUserUnfocused
        if ( inputUser.getText ().trim ().equals ( "" ) )
        {
            inputUser.setForeground ( Color.GRAY );
            inputUser.setText ( "username" );
        }
    }//GEN-LAST:event_inputUserUnfocused

    /**
     * When the user types enter in the use field. It moves you to the next
     * field.
     *
     * @param evt
     */
    private void inputUserEnter(java.awt.event.KeyEvent evt)//GEN-FIRST:event_inputUserEnter
    {//GEN-HEADEREND:event_inputUserEnter
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER )
        {
            inputPass.requestFocus ();
        }
    }//GEN-LAST:event_inputUserEnter

    /**
     * When you press ENTER on btnConnect
     *
     * @param evt
     */
    private void btnEnterPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnEnterPressed
    {//GEN-HEADEREND:event_btnEnterPressed
        if ( inputsAreValid () )
        {
            changeButtonStatus ();
        }

    }//GEN-LAST:event_btnEnterPressed

    /**
     * When Left Click is pressed on btnConnect.
     *
     * @param evt
     */
    private void buttonConnectMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_buttonConnectMousePressed
    {//GEN-HEADEREND:event_buttonConnectMousePressed
        if ( inputsAreValid () )
        {
            changeButtonStatus ();
        }
    }//GEN-LAST:event_buttonConnectMousePressed

    private void buttonConnectMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_buttonConnectMouseExited
    {//GEN-HEADEREND:event_buttonConnectMouseExited
        if ( buttonConnect.getText ().equals ( "Conectando..." ) )
        {
            buttonConnect.setText ( "Conectar" );
        }
    }//GEN-LAST:event_buttonConnectMouseExited

    private void btnEnterReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnEnterReleased
    {//GEN-HEADEREND:event_btnEnterReleased
        if ( inputsAreValid () )
        {
            buttonConnectAction ( null );
        }
    }//GEN-LAST:event_btnEnterReleased

    /**
     * When the user types enter in the pass field. It moves you to the connect
     * button.
     *
     * @param evt
     */
    private void inputPassEnter(java.awt.event.KeyEvent evt)//GEN-FIRST:event_inputPassEnter
    {//GEN-HEADEREND:event_inputPassEnter
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER )
        {
            buttonConnect.requestFocus ();
        }
    }//GEN-LAST:event_inputPassEnter

    /**
     * When inputPass gets unfocused. Makes the text lighter and adds the
     * default text to the password field if it is empty.
     *
     * @param evt
     */
    private void inputPassUnfocused(java.awt.event.FocusEvent evt)//GEN-FIRST:event_inputPassUnfocused
    {//GEN-HEADEREND:event_inputPassUnfocused
        if ( inputPass.getText ().trim ().equals ( "" ) )
        {
            inputPass.setForeground ( Color.gray );
            inputPass.setText ( "password" );
        }
    }//GEN-LAST:event_inputPassUnfocused

    /**
     * When inputPass gets focused.Makes the text darker and removes the default
     * text from the password field.
     *
     * @param evt
     */
    private void inputPassFocused(java.awt.event.FocusEvent evt)//GEN-FIRST:event_inputPassFocused
    {//GEN-HEADEREND:event_inputPassFocused
        if ( inputPass.getText ().trim ().equals ( "password" ) ||
          inputPass.getForeground () == Gui.CRIMSON )
        {
            inputPass.setText ( "" );
            inputPass.setForeground ( Gui.DARK_SLATE_GRAY );
            
        }
    }//GEN-LAST:event_inputPassFocused

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConnect;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

    /**
     * Checks the input fields of this component. It also sets them to a red
     * color if they're wrong and sets and error message in the label field.
     *
     * @return Returns true if every field is filled, or false otherwise.
     */
    private boolean inputsAreValid ()
    {
        //flags used for error checking
        boolean userNotValid = false;
        boolean passNotValid = false;

        //check user field
        if ( inputUser.getText ().equals ( "username" ) ||
          inputUser.getText ().equals ( "" ) )
        {
            userNotValid = true;
            inputUser.setForeground ( Gui.CRIMSON );
        }

        //check pass field
        if ( inputPass.getText ().trim ().equals ( "password" ) ||
          inputPass.getText ().trim ().equals ( "" ) )
        {
            passNotValid = true;
            inputPass.setForeground ( Gui.CRIMSON );
        }

        //set error message
        if ( userNotValid || passNotValid )
        {
            labelInfo.setForeground ( Gui.CRIMSON );
            labelInfo.setText ( "¡Ingrese " );
            if ( userNotValid )
            {
                labelInfo.setText ( labelInfo.getText () + "un usuario" );
            }
            if ( userNotValid && passNotValid )
            {
                labelInfo.setText ( labelInfo.getText () + " y " );
            }
            if ( passNotValid )
            {
                labelInfo.setText ( labelInfo.getText () + "una contraseña" );
            }
            labelInfo.setText ( labelInfo.getText () + "!" );
        }
        // revert to default message
        else
        {
            labelInfo.setForeground ( Gui.BEIGE );
            labelInfo.setText ( "Por favor, ingrese sus credenciales." );
        }
        
        return !(userNotValid || passNotValid);
    }
    
    private void changeButtonStatus ()
    {
        if ( buttonConnect.getText ().equals ( "Conectar" ) )
        {
            buttonConnect.setText ( "Conectando..." );
        }
        else
        {
            buttonConnect.setText ( "Conectar" );
        }
    }
    
    private void testConnection ()
    {
        try
        {
            Connector.testConnection ();
            openMainWindow ();
        }
        catch ( Exception e )
        {
            ThrowError.dbInvalidCredentials ();
            
        }
    }
    
    private void createSession ()
    {
        if ( inputsAreValid () )
        {
            Session.createSession (
              inputUser.getText (),
              inputPass.getText () );
        }
    }
    
    private void openMainWindow ()
    {
        Window.open ( new MainMenu () );
        Window.close ( this );
    }
    
}
