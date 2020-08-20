package model;

/**
 * Refers to a book's editorial from the DB.
 *
 * @author Gustavo
 * @author Gabriel
 *
 * @version 1.0 16/6/2020
 */
public class Telefono
{
    //variables
    private final String telefono;
    private final String rut;

    public Telefono (
      String telefono)
    {
        this.telefono = telefono;
        this.rut = "";
    }

    public Telefono (
      String telefono,
      String rut)
    {
        this.telefono = telefono;
        this.rut = rut;
    }

    public String telefono ()
    {
        return telefono;
    }

    public String rut ()
    {
        return rut;
    }

    @Override
    public String toString ()
    {
        return telefono;
    }
    
    

}
