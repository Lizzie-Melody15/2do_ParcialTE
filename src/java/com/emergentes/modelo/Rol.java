package com.emergentes.modelo;

public class Rol {
   
    private int id_r;
    private String descripcion;

    public Rol() {
    }

    public void setId_r(int id_r) {
        this.id_r = id_r;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_r() {
        return id_r;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id_r + ", descripcion=" + descripcion + '}';
    }        
}
