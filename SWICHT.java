import java.util.Scanner;

public class SWICHT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;

        System.out.println("\nIngrese el numero del dia de la semana: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("\nEl dia es Lunes...");
                break;
            case 2:
                System.out.println("\nEl dia es Martes...");
                break;
            case 3:
                System.out.println("\nEl dia es Miercoles...");
                break;
            case 4:
                System.out.println("\nEl dia es Jueves...");
                break;
            case 5:
                System.out.println("\nEl dia es Viernes...");
                break;
            case 6:
                System.out.println("\nEl dia es Sabado...");
                break;
            case 7:
                System.out.println("\nEl dia es Domingo...");
                break;
            default:
                System.out.println("\nEl numero ingresado no corresponde a un dia de la semanda...");
                break;
        }

        sc.close();
    }
}
