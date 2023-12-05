package com.francisco.entities;


public class Direccion {
    
    int id;
    int idAlumno;
    String direccion;

    public Direccion() {
    }

    public Direccion(int id, int idAlumno, String direccion) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", idAlumno=" + idAlumno + ", direccion=" + direccion + '}';
    }
    
    
    
}
