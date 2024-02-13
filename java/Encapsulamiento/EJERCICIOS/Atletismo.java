package Encapsulamiento.EJERCICIOS;

/*
 --------------------------------------------------- Ejercicio 4 -----------------------------------------------------------------
Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas caracterizados 
por su número de atleta,nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.
----------------------------------------------------------------------------------------------------------------------------------
 */
public class Atletismo {
    // atributos
    private String nombre;
    private int num_atleta;
    private Double tiempo_carrera;
    
    // metodos
    // constructor

    public Atletismo(String nombre, int num_atleta, Double tiempo_carrera) {
        this.nombre = nombre;
        this.num_atleta = num_atleta;
        this.tiempo_carrera = tiempo_carrera;
    }
    
    // metodos getters
    public String getNombre() {
        return nombre;
    }

    public int getNum_atleta() {
        return num_atleta;
    }

    public double getTiempo() {
        return tiempo_carrera;
    }
    
    
    public static void mostrarGanador(String nombreGanador,int numGanador){
        
        System.out.println("----------------- GANADOR --------------------");
        System.out.println("El atleta con mejor tiempo es el numero ["+ numGanador + "] " + " y su nombre es " +nombreGanador );
    }
    
}
