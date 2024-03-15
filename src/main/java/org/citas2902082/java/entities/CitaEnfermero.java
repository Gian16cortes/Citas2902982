package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.Especialidad;

public class CitaEnfermero extends Cita {

    private String procedimiento;
    private Enfermero enfermero;

    public CitaEnfermero(LocalDateTime fecha,
            Paciente paciente,
            String procedimiento,
            Enfermero enfermero) {
        super(fecha, paciente);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

}
