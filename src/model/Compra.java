package model;

/**
 * This object represents a buy transaction of the table.
 *
 * @author Gustavo
 * @author Gabriel
 *
 * @version 1.0 1/7/2020
 */
public class Compra
  extends abstraction.Transaction
{
    private final String rutDistribuidor;
    private final Integer isbnLibro;
    private Distribuidor distribuidor;
    private Libro libro;
    

    public Compra (
      int precio,
      int cantidad,
      float iva,
      Distribuidor distribuidor,
      String fecha,
      Libro libro)
    {
        this.precio = precio;
        this.cantidad = cantidad;
        this.iva = iva;
        this.distribuidor = distribuidor;
        this.libro = libro;
        this.fecha = fecha;

        this.id = null;
        this.rutDistribuidor = null;
        this.isbnLibro = null;
    }

    public Compra (
      int id,
      int precio,
      int cantidad,
      float iva,
      int idFactura,
      int isbnLibro,
      String fecha,
      String rutDistribuidor)
    {
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.iva = iva;
        this.fecha = fecha;
        this.rutDistribuidor = rutDistribuidor;
        this.isbnLibro = isbnLibro;
    }

//<editor-fold defaultstate="collapsed" desc="Getters">
    public Distribuidor distribuidor ()
    {
        return distribuidor;
    }

    public String rutDistribuidor ()
    {
        return rutDistribuidor == null ?
          distribuidor.rut () : rutDistribuidor;
    }

    public Libro libro ()
    {
        return libro;
    }

    public Integer isbnLibro ()
    {
        return isbnLibro == null ?
          isbnLibro : libro.isbn ();
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Setters">
    public void setDistribuidor (Distribuidor d)
    {
        this.distribuidor = d;
    }

    public void setLibro (Libro libro)
    {
        this.libro = libro;
    }
//</editor-fold>

    @Override
    public String toString ()
    {
        return Integer.toString ( this.id );
    }

}
