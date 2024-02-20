import java.util.Scanner;

public class Datos_Usuario_PorTeclado {
    public static void main(Clase_String[] args) {
        // desarrollo del codigo
        Scanner sc = new Scanner(System.in);

        // definimos las variables a utilizar
        String nombre;
        String Profesion;
        int edad;
        double sueldo;

        // por pantalla mostramos un mensaje para pedir los datos
        System.out.println("\t\tINGRESE SUS DATOS");
        System.out.println("\nIngrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su profesion: ");
        Profesion = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese en US su sueldo: ");
        sueldo = sc.nextDouble();

        // imprimimos por pantalla los datos
        System.out.println("------------------------------------------------------");
        System.out.println("\t\tLOS DATOS DEL USUARIO SON");
        System.out.println("\nNombre: " + nombre);
        System.out.println("Profesion: " + Profesion);
        System.out.println("Edad: " + edad);
        System.out.println("Suledo: $ " + sueldo);
        System.out.println("------------------------------------------------------");

        sc.close(); // cerramos la clase scanner creada para obtener los datos por teclado
    }
}
