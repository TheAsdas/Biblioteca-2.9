package abstraction;

import java.util.ArrayList;
import model.Direccion;
import model.Mail;
import model.Telefono;

/**
 * This is a person's basic attributes.
 *
 * @author Gustavo
 * @version 1.0 27/6/2020
 */
public abstract class Persona
{
    protected String nombre;
    protected String paterno;
    protected String materno;

    protected ArrayList<Mail> correos;
    protected ArrayList<Direccion> direcciones;
    protected ArrayList<Telefono> telefonos;

    public Persona ()
    {
        correos = new ArrayList<> ();
        direcciones = new ArrayList<> ();
        telefonos = new ArrayList<> ();
    }

//<editor-fold defaultstate="collapsed" desc="Getters">
    public String nombre ()
    {
        return nombre;
    }

    public String paterno ()
    {
        return paterno;
    }

    public String materno ()
    {
        return materno;
    }

    public ArrayList<Mail> listCorreos ()
    {
        return correos;
    }

    public ArrayList<Direccion> listDirecciones ()
    {
        return direcciones;
    }

    public ArrayList<Telefono> listTelefonos ()
    {
        return telefonos;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Setters">
    public void setCorreos (ArrayList correos)
    {
        this.correos = correos;
    }

    public void setDirecciones (ArrayList direcciones)
    {
        this.direcciones = direcciones;
    }

    public void setTelefonos (ArrayList telefonos)
    {
        this.telefonos = telefonos;
    }
//</editor-fold>

    @Override
    public String toString ()
    {
        return nombre + " " + paterno + " " + materno;
    }

}
