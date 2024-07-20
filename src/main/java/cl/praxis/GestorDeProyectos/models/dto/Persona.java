package cl.praxis.GestorDeProyectos.models.dto;

public class Persona {
    // Variables
    String name;
    String lastName;
    int ages;
    //Constructors

    //Constructor Void
    public Persona() {
    }
    //Constructor & Methods
    public Persona(String name, String lastName, int ages) {
        this.name = name;
        this.lastName = lastName;
        this.ages = ages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }


    //To String formato para imprimir en consola.
    @Override
    public String toString() {
        return ">--|DATOS DEL ALUMNO|--<\n" +
                "Nombre: " + name + '\n' +
                "Apellido: " + lastName + '\n' +
                "Edad: " + ages;
    }
}
