package cl.praxis.GestorDeProyectos.models.services;

import cl.praxis.GestorDeProyectos.models.dto.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestorDeProyectosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorDeProyectosApplication.class, args);
		//Método para imprimir persona en consola
		Persona persona = new Persona("Cristopher", "Montecinos", 37);
		System.out.println(persona);
	}
}
