package cl.praxis.GestorDeProyectos.controllers;

import cl.praxis.GestorDeProyectos.models.dto.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
        // metodo para mostrar persona
        @GetMapping("/persona")
        public Persona getPersona() {
            return new Persona("Cristopher", "Montecinos", 37);
        }
}
