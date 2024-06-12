package com.campuslands.persistencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersistenciaApplication {

	public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        // Crear una nueva persona
        Persona persona = new Persona(1, "Juan", 25);
        personaDAO.createPersona(persona);

        // Leer todas las personas
        System.out.println("Personas:");
        for (Persona p : personaDAO.readPersonas()) {
            System.out.println(p);
        }

        // Actualizar una persona
        Persona updatedPersona = new Persona(1, "Juan", 26);
        personaDAO.updatePersona(updatedPersona);

        // Leer todas las personas después de la actualización
        System.out.println("\nPersonas después de la actualización:");
        for (Persona p : personaDAO.readPersonas()) {
            System.out.println(p);
        }

        // Eliminar una persona
        personaDAO.deletePersona(1);

        // Leer todas las personas después de la eliminación
        System.out.println("\nPersonas después de la eliminación:");
        for (Persona p : personaDAO.readPersonas()) {
            System.out.println(p);
        }
    }
}
