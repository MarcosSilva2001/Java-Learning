package Encapsulamiento.EJERCICIOS;

import java.util.Scanner;

public class MainVehiculo {

    public static int menorPrecioVehiculo(Vehiculo coches[]) {
        
        int pos = 0;
        
        for (int i = 1; i < coches.length; i++) {

            if (coches[pos].getPrecio() > coches[i].getPrecio()) {

                pos = i;
            }
        }
        
        return pos;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String marca;
        int modelo;
        float precio;
        int numVehiculos;

        System.out.print("Digite la cantidad de vehiculos que desea cargar: ");
        numVehiculos = sc.nextInt();

        // definimos un vector de objetos de la clase Vehiculo
        Vehiculo[] coches = new Vehiculo[numVehiculos];

        // cargamos los datos
        System.out.println("------------- CARGUE LOS DATOS DE LOS VEHICULOS -------------");
        System.out.println();
        
        for (int i = 0; i < coches.length; i++) {

            System.out.print("Ingrese las caracteristicas del coche " + (i + 1) + " : ");
            System.out.print("Intruduzca la marca: ");
            marca = sc.nextLine();
            System.out.print("Intruduzca el modelo: ");
            modelo = sc.nextInt();
            System.out.print("Intruduzca el precio: ");
            precio = sc.nextFloat();

            // insertamos los datos en la posicion i del array para crear un nuevo objeto con esos datos
            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        // hallar el coche mas barato del array
        int posMin = menorPrecioVehiculo(coches);
        
        System.out.println("----------------- IMPRIMIMOS EL RESULTADO ------------------");
        System.out.println("El vehiculo que tiene menor precio es el " + posMin );
        
    }
}

