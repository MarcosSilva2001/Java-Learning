package Eventos_Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListenerMouse {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de Hover en Java");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 600);
        ventana.setBackground(Color.DARK_GRAY);

        JLabel etiqueta = new JLabel("Click");
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.LIGHT_GRAY);
        etiqueta.setBounds(100, 20, 60, 30);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setVerticalAlignment(SwingConstants.CENTER);

        /*
         * addMouseListener es un método en Java que se utiliza para agregar un
         * "escuchador de eventos del mouse"
         * a un componente gráfico. Este método es comúnmente utilizado en bibliotecas
         * gráficas como Swing en Java
         * para manejar eventos relacionados con el ratón.
         * 
         * ---------- Los métodos más comunes de la interfaz MouseListener ------------
         * 
         * - mouseClicked(MouseEvent e): Se invoca cuando se realiza un clic con el
         * botón del ratón.
         * 
         * - mousePressed(MouseEvent e): Se invoca cuando se presiona un botón del
         * ratón.
         * - mouseReleased(MouseEvent e): Se invoca cuando se libera un botón del ratón.
         * 
         * - mouseEntered(MouseEvent e): Se invoca cuando el puntero del ratón entra en
         * el área del componente.
         * 
         * - mouseExited(MouseEvent e): Se invoca cuando el puntero del ratón sale del
         * área del componente.
         */

        etiqueta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Se ejecuta cuando el ratón entra en la etiqueta
                etiqueta.setBounds(100, 20, 70, 35); // agrandar
                // centrar
                etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
                etiqueta.setVerticalAlignment(SwingConstants.CENTER);
                etiqueta.setBackground(Color.RED); // cambiar el color
                etiqueta.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Se ejecuta cuando el ratón sale de la etiqueta
                // Restablece el borde a null o realiza otras acciones
                etiqueta.setBackground(Color.LIGHT_GRAY);
                etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
                etiqueta.setVerticalAlignment(SwingConstants.CENTER);
                etiqueta.setBounds(100, 20, 60, 30);
                etiqueta.setForeground(Color.BLACK);
            }
        });

        ventana.getContentPane().add(etiqueta);
        ventana.setVisible(true);
    }
}
