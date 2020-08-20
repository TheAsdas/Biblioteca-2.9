package model;

/**
 * Refers to a book's category from the DB.
 *
 * @author Gabriel, Gustavo
 * @version 1.1 - 11/6/2020
 */
public class Categoria
{
    //variables
    private final Integer id;
    private final String nombre;

    /**
     * Constructor that sets the variables of the entity.
     *
     * @param id Int with the category's ID.
     * @param nombre String with the category's ID.
     */
    public Categoria (
      int id,
      String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public Categoria (
      String nombre)
    {
        this.id = null;
        this.nombre = nombre;
    }

    //<editor-fold defaultstate="collapsed" desc="setters&getters">
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
     * Returns the entity's name whenever this entity is called as a String.
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
