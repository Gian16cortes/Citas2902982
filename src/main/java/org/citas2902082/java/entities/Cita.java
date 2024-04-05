package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Cita {

    protected Integer id;
    protected LocalDateTime fecha;
    protected Paciente paciente;
    protected Consultorio consultorio;

    public Cita(LocalDateTime fecha, Paciente paciente, Consultorio consultorio) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

}
