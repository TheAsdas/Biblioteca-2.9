package model;

/**
 * This is Distributor entry from the DB.
 *
 * @author Usuario
 * @author Gustavo
 *
 *
 * @version 1.2 1/7/2020
 */
public class Distribuidor
{

    private final String rut;
    private final String telefono;
    private final String nombreEmpresa;
    private final Integer añosServicio;

    public Distribuidor (String rut,
      String telefono,
      String nombreEmpresa,
      int añosServicio)
    {
        this.rut = rut;
        this.telefono = telefono;
        this.nombreEmpresa = nombreEmpresa;
        this.añosServicio = añosServicio;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String rut ()
    {
        return rut;
    }

    public String telefono ()
    {
        return telefono;
    }


    public String nombreEmpresa ()
    {
        return nombreEmpresa;
    }


    public int añosServicio ()
    {
        return añosServicio;
    }
    //</editor-fold>

    @Override
    public String toString ()
    {
        return this.nombreEmpresa;
    }
}
