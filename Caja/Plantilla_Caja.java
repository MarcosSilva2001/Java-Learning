package Caja;

import java.util.Scanner;

//creamos una clase para calcular el volumen de una caja dado su alto, ancho y profuncidad
public class Plantilla_Caja {

    Scanner sc = new Scanner(System.in);
    //// atributos de la clase
    int altura;
    int ancho;
    int profundidad;

    // metodos

    public void Desplegar_Pantalla() {

        System.out.println("\t\tCALCULAR VOLUMEN DE UN CUBO");
        System.out.println("Ingrese los datos.... \n");

        System.out.print("Alto: ");
        this.altura = sc.nextInt();
        System.out.print("Ancho: ");
        this.ancho = sc.nextInt();
        System.out.print("Profundidad: ");
        this.profundidad = sc.nextInt();

        int volumen = altura * ancho * profundidad;

        System.out.println("\nEL VOLUMEN DE LA CAJA ES: " + volumen);

    }

}