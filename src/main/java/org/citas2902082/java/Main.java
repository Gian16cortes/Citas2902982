package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Santii!");

        Medico m = new Medico(1,
                "Santi",
                "Delgado",
                TipoIdentificacion.CC,
                101369868764L,
                34443L,
                Especialidad.GINECOLOGO);

        System.out.println(m.toString());

    }

}