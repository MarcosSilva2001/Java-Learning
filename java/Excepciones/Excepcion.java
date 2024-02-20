package Excepciones;

import java.util.Scanner;

/*
    -------------------------------------------- Exception -------------------------------------------
    Cuando un programa java viola las restricciones semanticas del lenguaje se produce un error, 
    la maquina virtual java comunica este hecho al programa por medio de una excepcion
    Las excepciones pueden ser porbocadas por un desbordeamiento de memoria , un discoduro estropeado, 
    un intento de dividir por cero , intentar acceder a un vector fuera de sus limites , etc.
    Cuando esto ocurre la maquina java crea un objeto de la clase "exception"
    --------------------------------------------------------------------------------------------------

    El manejo de exceptiones es importante para el programa porque este ayuda a que el programa no se frene 
    ante una excepcion sino que lo pueda manejar y evadir los errores para que se pueda ejecutar lo que está 
    despues de la excepcion.

 */

public class Excepcion {

    public static void main(String[] args) {
        // prueba de excepcion de division por cero es una EXCEPTION NO VERIFICADA DE RunTimeException 

        int num1 = 2, num2 = 0;

        int div = num1 / num2;

        System.out.println("Division : " + div);
        
        // se produjo una exception   ---> java.lang.ArithmeticException 

        /*
            java.lang es un paquete y en el hay muchas clases de exceptiones como en este caso la ArithmeticException
            
            Cuando ocurre una excepción, se arroja una instancia de una clase que hereda de la clase Throwable. 
         */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero : ");
        int numero = sc.nextInt();
        System.out.println("numero = " + numero);
    

        /* 
            Otro tipo de excepciones es la de imput que se puede dar al ingresar un valor por consola que no sea del tipo 
            de dato de la variable declarada que deriva de la clase --->  java.util.InputMismatchException
        */
    }    
        

}
