package com.emergentes.modelo;

public class Usuario {
    private int id_u;
    private String usuario;
    private String correo;
    private String contraseña;

    public Usuario() {
    }

    public int getId_u() {
        return id_u;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setId_u(int id_u) {
        this.id_u = id_u;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id_u + ", usuario=" + usuario + ", correo=" + correo + ", contraseña=" + contraseña + '}';
    }    
}
