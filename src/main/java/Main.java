
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import paquete.Logica.Alumno;
import paquete.Logica.ControladoraLogica;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ControladoraLogica control = new ControladoraLogica(); // Instancia de ControladoraLogica

    // Métodos
    public static void opcionMenu() {
        System.out.print("\n========================================== MENU CRUD ==========================================\n");
        System.out.println("\t\t\t\t1.  Agregar Alumno.");
        System.out.println("\t\t\t\t2.  Buscar Alumno.");
        System.out.println("\t\t\t\t3.  Listar Alumnos.");
        System.out.println("\t\t\t\t4.  Actualizar Datos del Alumno.");
        System.out.println("\t\t\t\t5.  Eliminar Alumno.");
        System.out.println("\t\t\t\t6.  Salir.\n");
        System.out.print("\t\t\t\t---> OPCION: ");
    }

    public static void agregarAlumno() {
        System.out.print("\n========================================== INGRESE LOS DATOS DEL ALUMNO ==========================================\n");
        System.out.print("\t\t\t\tID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea
        System.out.print("\t\t\t\tNombre: ");
        String nombre = sc.nextLine();
        System.out.print("\t\t\t\tApellido: ");
        String apellido = sc.nextLine();
        System.out.print("\t\t\t\tFecha de Nacimiento (YYYY-MM-DD): ");
        String fechaNacimientoStr = sc.nextLine();

        // Convertir la cadena de fecha en un objeto Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = sdf.parse(fechaNacimientoStr);
        } catch (ParseException e) {
            System.out.println("\t\tFormato de fecha incorrecto. Use el formato YYYY-MM-DD.");
            return; // Salir del método si hay un error en el formato de fecha
        }

        // Creamos un objeto alumno con los datos ingresados
        Alumno alu = new Alumno(id, nombre, apellido, fechaNacimiento);
        // Llamamos a la controladora para agregar un nuevo alumno
        control.crearAlumno(alu);

    }

    public static void buscarAlumno() {
        try {
            System.out.print("\n========================================== BUSCAR ALUMNO POR ID ==========================================\n");
            System.out.print("\t\t\t\tID: ");
            int id = sc.nextInt();

            Alumno alu = control.traerAlumno(id);
            if (alu != null) {
                System.out.println(alu.toString());
            } else {
                System.out.println("\n\t\t\t\tAlumno no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("\n\t\t\t\tError al buscar alumno: " + e.getMessage());
        }
    }

    public static void listarAlumnos() {
        try {
            System.out.println("\n========================================== LISTA DE ALUMNOS ==========================================\n");
            ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
            for (Alumno alumno : listaAlumnos) {
                System.out.println(alumno.toString());
            }
        } catch (Exception e) {
            System.out.println("\n\t\t\t\tError al listar alumnos: " + e.getMessage());
        }
    }

    public static void actualizarAlumno() {

        try {
            System.out.print("\n========================================== ACTUALIZAR ALUMNO ==========================================\n");
            System.out.println("\t\t\t\t1. Editar ID ");
            System.out.println("\t\t\t\t2. Editar Nombre ");
            System.out.println("\t\t\t\t3. Editar Apellido ");
            System.out.println("\t\t\t\t4. Editar Fecha de Nacimiento ");
            System.out.print("\t\t\t\tSELECCIONE UNA OPCION --->  ");
            int opcionActualizar = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            System.out.print("\n\t\t\t\tID del alumno a actualizar: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            Alumno alu = control.traerAlumno(id);

            switch (opcionActualizar) {
                case 1:
                    System.out.print("\n\t\t\t\tIngrese el nuevo ID: ");
                    int nuevoId = sc.nextInt();
                    sc.nextLine(); // Consumir la nueva línea
                    alu.setId(nuevoId);
                    control.actualizarAlumno(alu);
                    break;
                case 2:
                    System.out.print("\n\t\t\t\tIngrese el nuevo Nombre: ");
                    String nuevoNombre = sc.nextLine();
                    alu.setNombre(nuevoNombre);
                    control.actualizarAlumno(alu);
                    break;
                case 3:
                    System.out.print("\n\t\t\t\tIngrese el nuevo Apellido: ");
                    String nuevoApellido = sc.nextLine();
                    alu.setApellido(nuevoApellido);
                    control.actualizarAlumno(alu);
                    break;
                case 4:
                    System.out.print("\n\t\t\t\tIngrese la nueva Fecha de Nacimiento (YYYY-MM-DD): ");
                    String fechaNacimientoStr = sc.nextLine();

                    // Convertir la cadena de fecha en un objeto Date
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date nuevaFechaNacimiento = null;
                    try {
                        nuevaFechaNacimiento = sdf.parse(fechaNacimientoStr);
                    } catch (ParseException e) {
                        System.out.println("\n\t\tFormato de fecha incorrecto. Use el formato YYYY-MM-DD.");
                        return; // Salir del método si hay un error en el formato de fecha
                    }

                    alu.setFehcaNac(nuevaFechaNacimiento);
                    control.actualizarAlumno(alu);
                    break;
                default:
                    System.out.println("\n\t\t\t\tOPCION INCORRECTA.");
            }
        } catch (Exception e) {
            System.out.println("\n\t\t\t\tError al actualizar alumno: " + e.getMessage());
        }
    }

    public static void eliminarAlumno() {
        try {
            System.out.print("\n========================================== ELIMINAR ALUMNO POR ID ==========================================\n");
            System.out.print("\t\t\t\tID: ");
            int id = sc.nextInt();
            control.eliminarAlumno(id);
        } catch (Exception e) {
            System.out.println("\n\t\t\t\tError al eliminar alumno: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int opcion;
        do {
            opcionMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea después de leer la opción

            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    listarAlumnos();
                    break;
                case 4:
                    actualizarAlumno();
                    break;
                case 5:
                    eliminarAlumno();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "ADIOS!!!");
                    break;
                default:
                    System.out.println("\t\tOpción no válida. Por favor, seleccione una opción válida.\n");
                    break;
            }
        } while (opcion != 6);

    }
}
