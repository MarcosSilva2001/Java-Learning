import java.util.Scanner;

public class WHILE_Promedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Programa de Promedio dado N valores
        int suma = 0;
        int contador = 0;
        int valor;

        System.out.println("\nIngrese un numero (0 para finalizar): ");
        valor = sc.nextInt();

        while (valor != 0) {

            suma += valor;
            contador++;

            System.out.println("Ingrese un numero (0 para finalizar): ");
            valor = sc.nextInt();
        }

        if (contador > 0) {
            System.out.println("\n\t\tPROMEDIO");
            System.out.println("El promedio de los numeros ingresados es: " + (suma / contador) + "\n\n");
        } else
            System.out.println("\nEl promedio de 0 es 0.\n\n");

        sc.close();
    }
}
