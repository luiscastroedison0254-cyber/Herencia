package sistema.escolar.modelo;

/**
 * Proyecto: Sistema Control Escolar
 * Autor: Luis Angel Castro Edison
 * Clase Base: Persona
 */
public class persona {

    private String nombre;
    private int edad;
    private String curp;

    public persona(String nombre, int edad, String curp) {
        this.nombre = nombre;
        this.edad = edad;
        this.curp = curp;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("CURP: " + curp);
    }
}
