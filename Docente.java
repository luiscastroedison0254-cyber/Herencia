package sistema.escolar.modelo;

/**
 * Proyecto: Sistema Control Escolar
 * Autor: Luis Angel Castro Edison
 * Subclase: Docente
 */
public class docente extends persona {

    private String materia;
    private double sueldo;

    public docente(String nombre, int edad, String curp,
                    String materia, double sueldo) {
        super(nombre, edad, curp);
        this.materia = materia;
        this.sueldo = sueldo;
    }

    public void mostrarDatosDocente() {
        System.out.println("=== DOCENTE ===");
        mostrarDatos();
        System.out.println("Materia: " + materia);
        System.out.println("Sueldo: $" + sueldo);
    }
}
