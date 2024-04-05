package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.Estados;

public class CitaMedico extends Cita implements IAgendable {

    private String procedimiento;
    private Enfermero enfermero;
    private Estados estados;

    public CitaMedico(LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String procedimiento,
            Enfermero enfermero, Estados estados) {
        super(fecha, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
        this.estados = estados;
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

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);

    }

    @Override
    public void cancelarCita() {
        System.out.println("Cita cancelada");
        this.estados = Estados.CANCELADA;
    }

    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

}
