package model;

/**
 * This class represents a sell transaction from the DB.
 *
 * @author Gustavo
 * @version 1.0 2/7/2020
 */
public class Venta
  extends abstraction.Transaction
{
    //variables
    private final String fecha;
    private final String rutTrabajador;
    private final String rutCliente;
    private final Integer isbnLibro;
    private Trabajador trabajador;
    private Cliente cliente;
    private Libro libro;

    public Venta (
      String fecha,
      int cantidad,
      int precio,
      float iva,
      Trabajador trabajador,
      Cliente cliente,
      Libro libro)
    {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
        this.trabajador = trabajador;
        this.cliente = cliente;
        this.libro = libro;

        this.id = null;
        this.rutTrabajador = null;
        this.rutCliente = null;
        this.isbnLibro = null;
    }

    public Venta (int id,
      String fecha,
      int cantidad,
      int precio,
      float iva,
      String rutTrabajador,
      String rutCliente,
      int isbnLibro)
    {
        this.id = id;
        this.fecha = fecha;;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
        this.rutTrabajador = rutTrabajador;
        this.rutCliente = rutCliente;
        this.isbnLibro = isbnLibro;
    }

//<editor-fold defaultstate="collapsed" desc="Getters">
    public String fecha ()
    {
        return fecha;
    }

    public String rutTrabajador ()
    {
        return rutTrabajador;
    }

    public String rutCliente ()
    {
        return rutCliente;
    }

    public Integer isbnLibro ()
    {
        return isbnLibro;
    }

    public Trabajador trabajador ()
    {
        return trabajador;
    }

    public Cliente cliente ()
    {
        return cliente;
    }

    public Libro libro ()
    {
        return libro;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Setters">
    public void setTrabajador (Trabajador trabajador)
    {
        this.trabajador = trabajador;
    }

    public void setCliente (Cliente cliente)
    {
        this.cliente = cliente;
    }

    public void setLibro (Libro libro)
    {
        this.libro = libro;
    }
//</editor-fold>

    @Override
    public String toString ()
    {
        return id.toString ();
    }

}
