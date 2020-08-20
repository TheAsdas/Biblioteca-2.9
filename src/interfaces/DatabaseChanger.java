package interfaces;

import java.util.ArrayList;

/**
 * This interface specifies to which table to add/remove/retrieve from.
 *
 * @author Gustavo
 * @version 1.0 19/6/2020
 */
public interface DatabaseChanger
{
    public abstract void insertIntoDatabase (Object o);

    public abstract void deleteFromDatabase (Object o);

    public abstract ArrayList retrieveFromDatabase ();

}
