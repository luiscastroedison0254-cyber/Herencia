package sistema.escolar.modelo;

/**
 * Proyecto: Sistema Control Escolar
 * Autor: Luis Angel Castro Edison
 * Subclase: Administrativo
 */
public class administrativo extends persona {

    private String area;
    private String puesto;

    public administrativo(String nombre, int edad, String curp,
                           String area, String puesto) {
        super(nombre, edad, curp);
        this.area = area;
        this.puesto = puesto;
    }

    public void mostrarDatosAdministrativo() {
        System.out.println("=== ADMINISTRATIVO ===");
        mostrarDatos();
        System.out.println("Área: " + area);
        System.out.println("Puesto: " + puesto);
    }
}
