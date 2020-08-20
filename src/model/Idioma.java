package model;

/**
 * Refers to a book's languaje from the DB.
 *
 * @author Gabriel, Gustavo
 * @version 1.1 - 11/6/2020
 */
public class Idioma
{
    //variables
    private final int id;
    private final String nombre;

    public Idioma (
      int id,
      String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public Idioma (
      String nombre)
    {
        this.id = 0;
        this.nombre = nombre;
    }

    //<editor-fold defaultstate="collapsed" desc="getters">
    /**
     * Returns this entity's ID.
     *
     * @return Int with this ID.
     */
    public int id ()
    {
        return id;
    }

    /**
     * Returns this entity's name.
     *
     * @return String with this name.
     */
    public String nombre ()
    {
        return nombre;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="extra methods">
    /**
     * Returns this entity's name whenever it's called as a String.
     *
     * @return String with the entity's name.
     */
    @Override
    public String toString ()
    {
        return this.nombre;
    }
    //</editor-fold>

}
