package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String grado;
    private String division;
    private String turno;
    private String cicloLectivo;
    private String cupoMaximo;

    public Curso() {
    }

    public Curso(Long id, String grado, String division, String turno, String cicloLectivo, String cupoMaximo) {
        this.id = id;
        this.grado = grado;
        this.division = division;
        this.turno = turno;
        this.cicloLectivo = cicloLectivo;
        this.cupoMaximo = cupoMaximo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCicloLectivo() {
        return cicloLectivo;
    }

    public void setCicloLectivo(String cicloLectivo) {
        this.cicloLectivo = cicloLectivo;
    }

    public String getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(String cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }
}