package Java_JOpcionPane;

import javax.swing.JOptionPane;

public class JOpcion_Prueba {

    public static void main(String[] args) {
        /*
            ------------- JOptionPane ----------------
            es una clase en Java que pertenece al paquete javax.swing y se utiliza para crear y mostrar cuadros de diálogo simples 
            que permiten la interacción con el usuario en aplicaciones de interfaz gráfica de usuario (GUI). 
            Los cuadros de diálogo JOptionPane pueden mostrar mensajes, solicitar entrada del usuario y presentar opciones para que el usuario elija.
        
            ------------- IntegerParseInt() ----------------
            Este método se utiliza para convertir una cadena que representa un número en formato de texto a su equivalente numérico en formato entero 
         */

        // ----------- ENTRADA DE DATOS POR PANTALLA ----------
        
        // cadena de texto
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        //  entero
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad "));

        // char
        char letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);

        // double
        double decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero decimal "));
        

        // ------------ SALIDA DE DATOS POR PANTALLA -----------
        
        JOptionPane.showMessageDialog(null, " Su nombre es " + nombre);
        JOptionPane.showMessageDialog(null, "Usted tiene " + edad + " años");
        JOptionPane.showMessageDialog(null, " Ingreso la letra " + letra);
        JOptionPane.showMessageDialog(null, " Ingreso el decimal " + decimal);
    }

}
