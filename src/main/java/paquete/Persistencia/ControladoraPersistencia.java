package paquete.Persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import paquete.Logica.Alumno;
import paquete.Persistencia.exceptions.NonexistentEntityException;

// Se encarga de controlar cada una de las instancia de las JPAControllers que tengamos CRUD
public class ControladoraPersistencia {

    AlumnoJpaController alu_jpa = new AlumnoJpaController();  // Instancia de AlumnoJpaController

    // Método para crear un registro de alumno en la base de datos
    public void crearAlumno(Alumno alumno) {  // recibe un objeto Alumno como parámetro
        alu_jpa.create(alumno);  // Llama al método create que está en AlumnoJpaController para crear un nuevo registro de alumno
        
    }

    public void eliminarAlumno(int id) {
        try {
            alu_jpa.delete(id);

        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarAlumno(Alumno alumno) {
        try {
            alu_jpa.update(alumno);

        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Consulta por un solo alumno que tenga dicho id
    public Alumno encontrarAlumno(int id) {
        // devuelve el alumno que encuentre en la base de datos con el id que le mandamos
        return alu_jpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {

        // Debemos trasformar la lista qyue recibimos de  AlumnoJpaController a un ArrayList
        List<Alumno> listaAux = alu_jpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listaAux);

        // devuelve la lista de alumnos que encuentre en la base de datos 
        return listaAlumnos;
    }

}
