package model;

/**
 *
 * @author gusta
 */
public class Cliente
  extends abstraction.Persona
{
    private final String rut;
    private final String fechaNacimiento;

    public Cliente (
      String rut,
      String nombre,
      String paterno,
      String materno,
      String fechaNacimiento)
    {
        this.rut = rut;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.fechaNacimiento = fechaNacimiento;
    }

//<editor-fold defaultstate="collapsed" desc="Getters">
    public String rut ()
    {
        return rut;
    }

    public String fechaNacimiento ()
    {
        return fechaNacimiento;
    }
//</editor-fold>

}
