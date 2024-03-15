package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Medico extends Usuario {

    private Long registroMedico;
    private Especialidad especialidad;

    public Medico(Integer id,
            String nombres,
            String apellidos,
            TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion,
            Long registroMedico,
            Especialidad especialidad) {
        // constructor clase padre
        // es un constructor de laclse hija
        // es lo primero que debe aparecer
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        // inicializar los atributos propios de la cloase padre

        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]";
    }

}
