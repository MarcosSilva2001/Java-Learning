package ClasesObjetos;

import java.util.Scanner;

public class Coche {

    /*
        *MODIFICADORES DE ACCESO:
            *PUBLIC: Los miembros declarados como públicos están accesibles desde cualquier parte del programa. No hay restricciones en el acceso.
    
            *PRIVATE: Los miembros declarados como privados solo son accesibles dentro de la misma clase. No se pueden acceder desde otras clases.
    
            *DEFAULT (sin modificador): Si no se especifica ningún modificador, se utiliza el modificador de acceso predeterminado, 
                                        que significa que el elemento es accesible solo dentro del mismo paquete.
                    
            NOTA!!! Es una buena practica que por defecto los atributos de una clase las declaremos privadas
    
     */
    
    
    // Atributos
    String marca;
    String color;
    int km;
    double precio;

    // metodos
    
    /* 
        METODO CONSTRUCTOR:    método con el mismo nombre que la clase, ejecutado automáticamente al crear un objeto. 
                               Su función es inicializar los atributos de la clase, preparando el objeto para su uso. 
                               Puede aceptar parámetros para personalizar la inicialización y no tiene un tipo de retorno explícito.
    
        OPERADOR THIS:         se utiliza para referirse a la instancia actual de la clase, ya sea para acceder a sus campos o para
                               o llamar a otros constructores de la misma clase.                  
     */
    
    //Constructor con parametros
    public Coche(String marca, String color, int km, double precio) {
        this.marca = marca;
        this.color = color;
        this.km = km;
        this.precio = precio;
    }

    //Constructor vacio
    public Coche() {
        
    }

    public void Pedir_Datos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------ PEDIR DATOS DEL COCHE ----------------");
        //System.out.println("Ingrese la marca:  ");
        this.marca = sc.nextLine();
        System.out.println("Ingrese el color del coche:  ");
        this.color = sc.nextLine();
        System.out.println("Ingrese el kilometraje :  ");
        this.km = sc.nextInt();
        System.out.println("Ingrese el precio:  ");
        this.precio = sc.nextDouble();
    }

    public void mostrar() {
        System.out.println("------------ MOSTRAR DATOS DEL COCHE ----------------");
        System.out.println("Marca = " + marca);
        System.out.println("Color = " + color);
        System.out.println("Km = " + km);
        System.out.println("Precio = " + precio);
    }

}
