package com.francisco.entities;


public class Familiar {
    
    int id;
    int idAlumno;
    String nombre;
    String sexo;
    int telefono;
    boolean custodia;

    public Familiar() {
    }

    public Familiar(int id, int idAlumno, String nombre, String sexo, int telefono, boolean custodia) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
        this.custodia = custodia;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isCustodia() {
        return custodia;
    }

    public void setCustodia(boolean custodia) {
        this.custodia = custodia;
    }

    @Override
    public String toString() {
        return "Familiar{" + "id=" + id + ", idAlumno=" + idAlumno + ", nombre=" + nombre + ", sexo=" + sexo + ", telefono=" + telefono + ", custodia=" + custodia + '}';
    }
    
    
}
