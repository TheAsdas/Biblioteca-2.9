/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 * This interface decides which actions a Picker object does.
 *
 * @author Gustavo
 * @version 1.0 21/6/2020
 */
public interface AttributePicker
{
    /**
     * Defines which configuration dialog to open.
     */
    public abstract void configToOpen ();

    /**
     * Defines the code used to retrieve entries from the DB.
     *
     * @return Returns an ArrayList with the entries.
     */
    public abstract ArrayList retrieveFromDatabase ();

}
