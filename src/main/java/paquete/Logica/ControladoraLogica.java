package paquete.Logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import paquete.Persistencia.ControladoraPersistencia;

// Va a contener los métodos que necesito para un CRUD que luego los puedo llamar en la controladora de persistencia
public class ControladoraLogica {

    ControladoraPersistencia controladora = new ControladoraPersistencia();  // Instancia de ControladoraPersistencia

    // Método para crear un registro de alumno en la base de datos a partir de los datos ingresados
    public void crearAlumno(Alumno alumno) {  // recibe un objeto Alumno como parámetro
        controladora.crearAlumno(alumno);  // Llama al método crearAlumno de la controladora para crear un nuevo registro de alumno
        JOptionPane.showMessageDialog(null, "Alumno Agregado Exitosamente!!");
    }

    // Método para eliminar un registro de la tabla alumno en la base de datos 
    public void eliminarAlumno(int id) {
        controladora.eliminarAlumno(id);
        JOptionPane.showMessageDialog(null, "Alumno Eliminado Exitosamente!!");
    }

    public void actualizarAlumno(Alumno alumno) {
        controladora.actualizarAlumno(alumno);
        JOptionPane.showMessageDialog(null, "Datos del alumno actualizados con exito");
    }

    public Alumno traerAlumno(int id) {
        // va a  retornar el alumno que encuentre en la persistencia
        return controladora.encontrarAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        // va a  retornar la lista de alumnos que encuentre en la persistencia
        return controladora.traerListaAlumnos();
    }
}
