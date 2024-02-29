package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;

import java.time.LocalDate;

public class Paciente {
    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificion;
    public Integer numeroIdentificacion;
    public String correoElectronico;
    public Integer celular;
    public LocalDate fechaNacimiento;
    public Double altura;
    public Double peso;
    public TipoSangre tipoSangre;
    public char factorRh;

    public Paciente(String nombres, String apellidos, TipoIdentificacion tipoIdentificion, Integer numeroIdentificacion,
            String correoElectronico, Integer celular, LocalDate fechaNacimiento, Double altura, Double peso,
            TipoSangre tipoSangre, char factorRh) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificion = tipoIdentificion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRh = factorRh;
    }




}
