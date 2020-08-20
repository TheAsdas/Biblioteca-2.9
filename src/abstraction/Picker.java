package abstraction;

import java.util.ArrayList;

/**
 * This abstract class defines the things a Picker object can do.
 *
 * @author Gustavo
 * @version 1.1 27/6/2020
 */
public abstract class Picker
  extends javax.swing.JPanel
  implements interfaces.AttributePicker
{
    //variables
    protected ArrayList entries;
    protected boolean required = false;

    /**
     * Updates the entries of the DB. Stores the entries in an ArrayList, and
     * then it shows it in a Jtable or Jlist.
     */
    public void updateItems ()
    {
        populateArrayList ();
        clearObjects ();
        showOnScreen ( entries );
    }

    /**
     * Defines if it is obligatory for the user to choose at least one entry.
     * Giving it a true, it means it is neccesary.
     */
    public void setRequired (boolean isRequired)
    {
        this.required = isRequired;
    }

    /**
     * Filter the table's contents.
     */
    protected void search ()
    {
        clearObjects ();
        showOnScreen ( filterEntries () );
    }

    /**
     * Defines the text of this component's banner.
     *
     * @param text String with the text to set.
     */
    public abstract void setBannerText (String text);

    /**
     * Returns the selected objects. Returns an ArrayList if the user selected
     * more than one.
     *
     * @return Returns an object, or an ArrayList of them.
     */
    public abstract Object getSelection ();

    /**
     * Returns true if the user selection is valid, returns false otherwise.
     */
    public abstract boolean selectionIsValid ();

    /**
     * Removes all the objects of the list/table model.
     */
    protected abstract void clearObjects ();

    /**
     * Retrieves data from the DB and stores it in a ArrayList.
     */
    protected abstract void populateArrayList ();

    /**
     * Shows entries in the table/list.
     *
     * @param entries ArrayList with the entries to show.
     */
    protected abstract void showOnScreen (ArrayList entries);

    /**
     * Filters the entries saved on the ArrayList.
     *
     * @return Returns a new ArrayList with filtered items.
     */
    protected abstract ArrayList filterEntries ();

}
