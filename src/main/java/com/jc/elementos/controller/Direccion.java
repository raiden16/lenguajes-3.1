
package com.jc.elementos.controller;


public class Direccion {
    private String calle;
    private String colonia;
    private String estado;
    private long cp;

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", estado=" + estado + ", cp=" + cp + '}';
    }

    public Direccion(String calle, String colonia, String estado, long cp) {
        this.calle = calle;
        this.colonia = colonia;
        this.estado = estado;
        this.cp = cp;
    }

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }
    
}
