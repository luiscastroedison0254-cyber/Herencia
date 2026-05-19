package sistema.escolar.modelo;

/**
 * Proyecto: Sistema Control Escolar
 * Autor: Luis Angel Castro Edison
 * Subclase: Estudiante
 */
public class estudiante extends persona {

    private String carrera;
    private int semestre;

    public estudiante(String nombre, int edad, String curp,
                       String carrera, int semestre) {
        super(nombre, edad, curp);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public void mostrarDatosEstudiante() {
        System.out.println("=== ESTUDIANTE ===");
        mostrarDatos();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
