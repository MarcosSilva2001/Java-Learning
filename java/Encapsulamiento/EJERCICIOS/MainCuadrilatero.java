package Encapsulamiento.EJERCICIOS;

import javax.swing.JOptionPane;

public class MainCuadrilatero {

    public static void main(String[] args) {
        // creamos un objeto
        Cuadrilatero c1;

        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2"));

        // Control para saber que constructor usaremos
        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        // imprimimos el perimetro y el area
        
        JOptionPane.showMessageDialog(null, "El Perimetro es: " + c1.getPerimetro());
        JOptionPane.showMessageDialog(null, "El Area es: " + c1.getArea());
    }

}
