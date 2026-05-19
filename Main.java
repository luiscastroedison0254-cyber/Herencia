package sistema.escolar.modelo;

/**
 * Proyecto: Sistema Control Escolar
 * Autor: Luis Angel Castro Edison
 * Materia: Programación Orientada a Objetos
 */
public class Main {

    public static void main(String[] args) {

        estudiante estudiante1 = new estudiante(
                "Ana López",
                20,
                "AALP030201",
                "Sistemas",
                4
        );

        docente docente1 = new docente(
                "Carlos Pérez",
                40,
                "CAPE850101",
                "Programación",
                12000
        );

        administrativo admin1 = new administrativo(
                "Laura Gómez",
                35,
                "LAGO890212",
                "Recursos Humanos",
                "Coordinadora"
        );

        estudiante1.mostrarDatosEstudiante();
        System.out.println();
        
        docente1.mostrarDatosDocente();
        System.out.println();
        
        admin1.mostrarDatosAdministrativo();
    }
}
