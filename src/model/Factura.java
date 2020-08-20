package model;


/**
 * This class corresponds to a invoice from the DB.
 *
 * @author Gustavo
 * @author Gabriel
 *
 * @version 1.2 1/7/2020
 */
public class Factura
{
    //variables
    private final Integer numFolio;
    private final Integer precioNeto;
    private final Integer idMetodoPago;
    private final String fecha;
    private MetodoPago metodoPago;

    public Factura (
      int precioNeto,
      String fecha,
      MetodoPago metodoPago)
    {
        this.precioNeto = precioNeto;
        this.fecha = fecha;
        this.metodoPago = metodoPago;

        this.numFolio = null;
        this.idMetodoPago = null;
    }

    public Factura (
      int numFolio,
      int precioNeto,
      int idMetodoPago,
      String fecha)
    {
        this.numFolio = numFolio;
        this.precioNeto = precioNeto;
        this.idMetodoPago = idMetodoPago;
        this.fecha = fecha;
    }

//<editor-fold defaultstate="collapsed" desc="Getters">
    public Integer numFolio ()
    {
        return numFolio;
    }

    public Integer precioNeto ()
    {
        return precioNeto;
    }

    public Integer idMetodoPago ()
    {
        return idMetodoPago;
    }

    public String fecha ()
    {
        return fecha;
    }

    public MetodoPago metodoPago ()
    {
        return metodoPago;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Setters">
    public void setMetodoPago (MetodoPago metodoPago)
    {
        this.metodoPago = metodoPago;
    }
//</editor-fold>

    @Override
    public String toString ()
    {
        return numFolio.toString ();
    }

}