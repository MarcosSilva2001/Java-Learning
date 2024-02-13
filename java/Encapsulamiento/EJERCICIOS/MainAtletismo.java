package Encapsulamiento.EJERCICIOS;

import java.util.Scanner;

public class MainAtletismo {

    //metodos
    public static int atletaMasVeloz(Atletismo atletas[]) {

        int pos = 0;
        for (int i = 0; i < atletas.length; i++) {

            if (atletas[pos].getTiempo() > atletas[i].getTiempo()) {

                pos = i;
            }
        }

        return pos;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        String nombre;
        int num_atleta;
        Double tiempo;
        int can_Atletas;

        System.out.println("Ingrese la cantidad de atletas que participan en la carrera: ");
        can_Atletas = sc.nextInt();

        // definimos un array de la clase Atletismo
        Atletismo[] atletas = new Atletismo[can_Atletas];

        for (int i = 0; i < atletas.length; i++) {

            //pedir datos y cargar
            // ...
            System.out.print("Numero de Atleta : ");
            num_atleta = sc.nextInt();
            
            sc.nextLine();

            System.out.print("Nombre : ");
            nombre = sc.nextLine();

            System.out.print("Tiempo : ");
            tiempo = sc.nextDouble();

            // cargamos el array usando el constructor para crear un objeto en cada posicion del vector
            atletas[i] = new Atletismo(nombre, num_atleta, tiempo);

        }

        int mejorPos = atletaMasVeloz(atletas);

        //mostramos el mejor atleta
        Atletismo.mostrarGanador(atletas[mejorPos].getNombre(), atletas[mejorPos].getNum_atleta());
    }

}
