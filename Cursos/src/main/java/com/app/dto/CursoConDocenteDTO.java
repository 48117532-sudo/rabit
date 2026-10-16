package com.app.dto;

public class CursoConDocenteDTO {

    private Long id;
    private String grado;
    private String division;
    private String turno;
    private String cicloLectivo;
    private String cupoMaximo;
    private DocenteDTO docente;

    public CursoConDocenteDTO() {
    }

    public CursoConDocenteDTO(Long id, String grado, String division, String turno, String cicloLectivo, String cupoMaximo, DocenteDTO docente) {
        this.id = id;
        this.grado = grado;
        this.division = division;
        this.turno = turno;
        this.cicloLectivo = cicloLectivo;
        this.cupoMaximo = cupoMaximo;
        this.docente = docente;
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

    public DocenteDTO getDocente() {
        return docente;
    }

    public void setDocente(DocenteDTO docente) {
        this.docente = docente;
    }
}