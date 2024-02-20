import java.util.Scanner;

public class FOR_TablaMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // programa de tabla de multiplicar
        int num_Tabla;

        System.out.println("\nIngrese el numero de la tabla de multiplicar que desea: ");
        num_Tabla = sc.nextInt();

        System.out.println("\n-----------------------------------------------");
        System.out.println("\t  TABLA DE MULTIPLICAR DEL NUMERO " + num_Tabla);

        for (int i = 1; i <= 10; i++) {

            System.out.println("\t\t    " + num_Tabla + " X " + i + " = " + num_Tabla * i);
        }
        System.out.println("----------------------------------------------\n");

        sc.close();
    }
}