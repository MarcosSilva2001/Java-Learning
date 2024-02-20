package Encapsulamiento;

import javax.swing.JOptionPane;

public class Clase1 {

    public static void main(String[] args) {

        // creamos un objeto de  claseEncapsulado
        ClaseEncapsulado objeto1 = new ClaseEncapsulado();

        // pedimos al usuario sus datos
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        objeto1.setEdad(edad);

        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre ");
        objeto1.setNombre(nombre);

        // imprimimos
        System.out.println("Su edad es " + objeto1.getEdad() + " años");
        System.out.println("Su nombre es " + objeto1.getNombre());
    }
}
