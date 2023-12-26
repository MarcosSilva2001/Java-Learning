package Metodos;

import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // daclaro una variable del tipo Operaciones_Aritmetica
        Operaciones_Aritmetica operacion1 = new Operaciones_Aritmetica();

        // var es una variable que se adapta al tipo de dato que se le asigne, pero es
        // solo vara variables locales
        var numero = 10;

        System.out.print("Ingrese un valor: ");
        operacion1.a = sc.nextInt();
        System.out.print("Ingrese otro valor: ");
        operacion1.b = sc.nextInt();

        operacion1.Suma();
        operacion1.Resta();

        // llamamos al metodo Multiplicacion y le pasamos los valores por parametro
        int resultado = operacion1.Multiplicaion(operacion1.a, operacion1.b);

        System.out.println("Multimplicaion: " + operacion1.a + " x " + operacion1.b + " = " + resultado);

        // llamamos al metodo Division
        operacion1.Division(operacion1.a, operacion1.b);

        sc.close();
    }
}
