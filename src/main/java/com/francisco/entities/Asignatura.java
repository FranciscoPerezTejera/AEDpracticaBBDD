package com.francisco.entities;


public class Asignatura {
    
    int id;
    int idAlumno;
    String nombreAsignatura;
    String curso;
    int notas;

    public Asignatura() {
    }

    public Asignatura(int id, int idAlumno, String nombreAsignatura, String curso, int notas) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.nombreAsignatura = nombreAsignatura;
        this.curso = curso;
        this.notas = notas;
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

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "id=" + id + ", idAlumno=" + idAlumno + ", nombreAsignatura=" + nombreAsignatura + ", curso=" + curso + ", notas=" + notas + '}';
    }
}
