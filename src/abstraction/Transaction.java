package abstraction;

/**
 * This class represents a transaction. It could be buying, lending or selling.
 *
 * @author Gustavo
 * @version 1.0 2/7/2020
 */
public abstract class Transaction
{
    //variables
    protected Integer id;
    protected Integer precio;
    protected Integer cantidad;
    protected Float iva;
    protected String fecha;

    public int id ()
    {
        return id;
    }

    public int precio ()
    {
        return precio;
    }

    public int cantidad ()
    {
        return cantidad;
    }

    public float iva ()
    {
        return iva;
    }

    public float total ()
    {
        return (cantidad * precio) + (cantidad * precio * iva);
    }

    public String fecha ()
    {
        return this.fecha;
    }

}
