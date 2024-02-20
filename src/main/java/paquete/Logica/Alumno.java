
package paquete.Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fehcaNac;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fehcaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fehcaNac = fehcaNac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFehcaNac() {
        return fehcaNac;
    }

    public void setFehcaNac(Date fehcaNac) {
        this.fehcaNac = fehcaNac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno --> ");
        sb.append(" | ID: ").append(id);
        sb.append(" | Nombre: ").append(nombre);
        sb.append(" | Apellido: ").append(apellido);
        sb.append(" | Fecha Nacimiento: ").append(fehcaNac);
        sb.append('|');
        return sb.toString();
    }
    
    
  
}