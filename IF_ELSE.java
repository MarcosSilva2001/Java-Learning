import java.util.Scanner;

public class IF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // programa de numero par
        int num1;
        System.out.println("\nIngrese un valor: ");
        num1 = sc.nextInt();

        if (num1 / 2 == 0) {
            System.out.println("\nEl numero ingresado es Par...");
        } else
            System.out.println("\nEl numero ingresado es Impar...");

        sc.close();
    }

}
