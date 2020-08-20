package model;

/**
 * Refers to a person's address from the DB.
 *
 * @author Gustavo, Gabriel
 * @version 1.0 26/6/2020
 */
public class Direccion
{
    //variables
    private final String direccion;
    private final String rut;

    public Direccion (
      String direccion)
    {
        this.direccion = direccion;
        this.rut = "";
    }

    public Direccion (
      String rut,
      String direccion)
    {
        this.rut = rut;
        this.direccion = direccion;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String direccion ()
    {
        return direccion;
    }

    public String rut ()
    {
        return rut;
    }
    //</editor-fold>

    @Override
    public String toString ()
    {
        return direccion;
    }

}
