/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class MetodoPago {

    //<editor-fold defaultstate="collapsed" desc="variables">
    //
    private int id;
    private String nombre;
    private static int cont;
    //
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="constructor">
    //***
    /**
     * Constructor.
     * @param nombre (String) Settea el nombre.
     */
    public MetodoPago(String nombre) {
        this.nombre = nombre;
    }
    //
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="setters&getters">
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        MetodoPago.cont = cont;
    }
    //
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="methods">
    //
    @Override
    public String toString() {
        return nombre;
    }
    //
    //</editor-fold>

} // end MetodoPago;
