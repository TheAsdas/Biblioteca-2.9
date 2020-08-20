package model;

import abstraction.Persona;

/**
 *
 * @author Gustavo, Gabriel
 * @version 1.0 - 26/6/2020
 */
public class Trabajador
  extends Persona
{
    private final String rut;
    private final String fechaContrato;

    public Trabajador (
      String rut,
      String nombre,
      String paterno,
      String materno,
      String fechaContrato)
    {
        this.rut = rut;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.fechaContrato = fechaContrato;
    }

    public String rut ()
    {
        return rut;
    }

    public String fechaContrato ()
    {
        return fechaContrato;
    }

    @Override
    public String toString ()
    {
        return nombre + " " + paterno + " " + materno;
    }

}
