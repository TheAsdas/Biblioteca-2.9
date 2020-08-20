package model;

/**
 *
 * @author Gustavo, Gabriel
 * @version 1.0 26/6/2020
 */
public class Mail
{
    //variables
    private final String mail;
    private final String rut;

    public Mail (
      String mail)
    {
        this.mail = mail;
        this.rut = "";
    }

    public Mail (
      String rut,
      String mail)
    {
        this.rut = rut;
        this.mail = mail;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String mail ()
    {
        return mail;
    }

    public String rut ()
    {
        return rut;
    }
    //</editor-fold>

    @Override
    public String toString ()
    {
        return mail;
    }
    
    

}
