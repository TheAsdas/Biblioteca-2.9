package abstraction;

import windows.DatabaseEditor;
import windows.Wizard;
import interfaces.Observer;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * Abstract catalog.
 *
 * @author Gustavo
 *
 * @version 1.0 26/2020
 */
public abstract class Catalog
  extends javax.swing.JPanel
{
    //variables
    protected ArrayList entries;
    protected DefaultTableModel tableModel;
    protected Wizard addWizard;
    protected Wizard infoWizard;
    protected Frame parent;
    ArrayList<Observer> observers = new ArrayList<> ();

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    /**
     * Updates this catalog's table.
     */
    public void update ()
    {
        retrieveFromDatabase ();
        cleanTable ();
        showEntriesInTable ();
    }

    /**
     * Sets this catalog's parent frame.
     */
    public void setParent (Frame parent)
    {
        this.parent = parent;
    }

    /**
     * Adds an observer to this component.
     */
    public void addObserver (Observer o)
    {
        observers.add ( o );
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Abstract Methods">
    /**
     * Retrieves entry from the DB.
     */
    protected abstract void retrieveFromDatabase ();

    /**
     * Configures the Wizard used to add entries.
     */
    protected abstract void configAddWizard ();

    /**
     * Configures the Wizard used to get info about entries.
     */
    protected abstract void configInfoWizard ();

    /**
     * Deletes the selected entries from the table.
     */
    protected abstract void dropFromDatabase ();

    /**
     * Selects which data from the entries are shown in the table.
     */
    protected abstract void showEntriesInTable ();

    /**
     * Gets the selected entries from the table.
     */
    protected abstract ArrayList getSelection ();
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private/Protected Methods">
    private void cleanTable ()
    {
        this.tableModel.setRowCount ( 0 );
    }

    /**
     * Cofigures the observer between the picker and the editor.
     *
     * @param editor This editor updates the table/list when the user closes it.
     * @param picker This picker's list get updated when the editor is closes.
     */
    protected void createObserver (
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

    /**
     * Activates the stored observers.
     */
    protected void checkObservers ()
    {
        for ( Observer o : observers )
        {
            o.methodHappened ();
        }
    }

    /**
     * Opens a Wizard that let's the user add complex entries to a database.
     */
    protected void openAddWizard ()
    {
        configAddWizard ();
        resources.Window.open ( addWizard );
    }

    /**
     * Opens a Wizard that lets the user view entries in full detail.
     */
    protected void openInfoWizard ()
    {
        configInfoWizard ();
        resources.Window.open ( infoWizard );
    }
//</editor-fold>

}
