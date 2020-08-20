package model;

import abstraction.Persona;

/**
 * Refers to an author from the DB.
 *
 * @author gabriel, gustavo
 * @version 1.3 - 11/6/2020
 */
public class Autor
  extends Persona
{
    //variables
    private final int id;

    /**
     * Constructor that sets the variables of the entity.
     *
     * @param id Int with this autor's ID.
     * @param nombre String with the author's name.
     * @param paterno String with the author's middle name.
     * @param materno String with the author's last name.
     */
    public Autor (
      int id,
      String nombre,
      String paterno,
      String materno)
    {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }

    public Autor (
      String nombre,
      String paterno,
      String materno)
    {
        this.id = 0;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }

    //<editor-fold defaultstate="collapsed" desc="getters">
    public Integer id ()
    {
        return id;
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="extra methods">
    @Override
    public String toString ()
    {
        return this.nombre + " " + this.paterno + " " + this.materno;
    }
    //</editor-fold>

}
