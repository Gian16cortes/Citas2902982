package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;

import java.time.LocalDate;

public class Paciente {
    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoIdentificacion tipoIdentificion;
    private Integer numeroIdentificacion;
    private String correoElectronico;
    private Integer celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRh;

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

    public Paciente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoIdentificacion getTipoIdentificion() {
        return tipoIdentificion;
    }

    public void setTipoIdentificion(TipoIdentificacion tipoIdentificion) {
        this.tipoIdentificion = tipoIdentificion;
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRh() {
        return factorRh;
    }

    public void setFactorRh(char factorRh) {
        this.factorRh = factorRh;
    }

}
