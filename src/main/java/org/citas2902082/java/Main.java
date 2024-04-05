package org.citas2902082.java;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Consultorio;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.Estados;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Santii!");

        Medico medico1 = new Medico(1,
                "Santi",
                "Delgado",
                TipoIdentificacion.CC,
                101369868764L,
                75743L,
                Especialidad.GINECOLOGO);

        Medico medico2 = new Medico(2,
                "Luigi",
                "Cortes",
                TipoIdentificacion.CC,
                1013323234L,
                34773L,
                Especialidad.GINECOLOGO);

        Medico medico3 = new Medico(3,
                "Dayana",
                "Vellotas",
                TipoIdentificacion.CC,
                1013693233L,
                7474743L,
                Especialidad.GINECOLOGO);

        Paciente paciente1 = new Paciente(
                "Oscar",
                "Perez",
                TipoIdentificacion.CC,
                101351256,
                "oscar546@gmail",
                322924690,
                LocalDate.of(1997, 07, 01),
                1.56,
                45.0,
                TipoSangre.A,
                '+');

        Paciente paciente2 = new Paciente(
                "Oscar",
                "Perez",
                TipoIdentificacion.CC,
                101351256,
                "oscar546@gmail",
                322924690,
                LocalDate.of(1997, 07, 01),
                1.56,
                45.0,
                TipoSangre.A,
                '+');

        Paciente paciente3 = new Paciente(
                "Oscar",
                "Perez",
                TipoIdentificacion.CC,
                101351256,
                "oscar546@gmail",
                322924690,
                LocalDate.of(1997, 07, 01),
                1.56,
                45.0,
                TipoSangre.A,
                '+');

        Paciente paciente4 = new Paciente(
                "Oscar",
                "Perez",
                TipoIdentificacion.CC,
                101351256,
                "oscar546@gmail",
                322924690,
                LocalDate.of(1997, 07, 01),
                1.56,
                45.0,
                TipoSangre.A,
                '+');

        Paciente paciente5 = new Paciente(
                "Oscar",
                "Perez",
                TipoIdentificacion.CC,
                101351256,
                "oscar546@gmail",
                322924690,
                LocalDate.of(1997, 07, 01),
                1.56,
                45.0,
                TipoSangre.A,
                '+');

        Enfermero enfermero1 = new Enfermero(
                5,
                "Santiago",
                "Delgado",
                TipoIdentificacion.CC,
                101234245245L,
                Especialidad.CARDIOLOGIA);

        Enfermero enfermero2 = new Enfermero(
                6,
                "Gian",
                "Cortes",
                TipoIdentificacion.CC,
                101245745245L,
                Especialidad.GINECOLOGO);

        Enfermero enfermero3 = new Enfermero(
                7,
                "Dayana",
                "Aguilar",
                TipoIdentificacion.CC,
                101234245951L,
                Especialidad.ODONTOLOGO);

        System.out.println(medico1.toString());
        System.out.println(medico2.toString());
        System.out.println(medico3.toString());

        System.out.println(paciente1.toString());
        System.out.println(paciente2.toString());
        System.out.println(paciente3.toString());
        System.out.println(paciente4.toString());
        System.out.println(paciente5.toString());

        System.out.println(enfermero1.toString());
        System.out.println(enfermero2.toString());
        System.out.println(enfermero3.toString());
        Consultorio consultorio1 = new Consultorio("Kra 34 #3-sur", 7);
        Consultorio consultorio2 = new Consultorio("Kra 34 #3-sur", 5);

        CitaMedico cita1 = new CitaMedico(LocalDateTime.of(2022, 07, 07, 07, 07, 07), paciente5, consultorio1, "gripe",
                enfermero3, Estados.AGENDADA);
        CitaMedico cita2 = new CitaMedico(LocalDateTime.of(2023, 07, 07, 07, 07, 07),
                paciente2, consultorio2, "escopolamina", enfermero2, Estados.AGENDADA);
        cita2.cancelarCita();

        System.out.println(" Fecha: " + cita1.getFecha() + "|" + " Consultorio: " + cita1.getConsultorio() + "|" +
                "Nombre medico: " + cita1.getEnfermero().getNombres() + "Apellidos medico: "
                + cita1.getEnfermero().getApellidos() + "|" + "Nombre Paciente: " + cita1.getPaciente().getNombres()
                + "Apellidos Paciente: " + cita1.getPaciente().getApellidos());

    }
}