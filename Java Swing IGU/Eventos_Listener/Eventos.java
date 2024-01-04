package Eventos_Listener;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
    ----------------------------------- EVENTOS -----------------------------------------
 * En el contexto de las interfaces gráficas de usuario (GUI), los eventos son comúnmente asociados con la interacción 
 * del usuario, como clics de ratón, pulsaciones de teclas, cambios en el estado de un componente, etc.
 * 
 * Listener (Escuchador): Un objeto que espera y responde a eventos. Los listeners implementan interfaces específicas 
 * que definen los métodos que se invocarán cuando ocurra un evento particular.
 * 
 * Tipos de eventos:
    -ActionEvent: Ocurre cuando se realiza una acción, como hacer clic en un botón.
    -MouseEvent: Ocurre cuando hay interacciones del ratón, como clics o movimientos.
    -KeyEvent: Ocurre cuando se presiona o suelta una tecla del teclado.
    -WindowEvent: Ocurre cuando se realizan operaciones en una ventana, como abrir, 
 */
public class Eventos extends JFrame {
    // componentes publicos
    JPanel panel = new JPanel();
    JTextField caja;
    JButton boton;

    public Eventos() {

        // propiedades para la ventana
        setTitle("Eventos De Oyente");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.DARK_GRAY);

        iniciarComponentes();
    }

    private void iniciarComponentes() {

        colocarBoton();
        colocarCajaTexto();
        colocarPanel();
        colocarEtiqueta();

    }

    private void colocarPanel() {

        this.getContentPane().add(panel);
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null); // desactiva el diseño por defecto para poder organizar como queramos

    }

    private void colocarEtiqueta() {
        JLabel etiqueta1 = new JLabel();

        etiqueta1.setText("Ingrese un nombre");
        etiqueta1.setBounds(100, 10, 300, 30);
        etiqueta1.setFont(new Font("consolas", Font.BOLD, 20));
        etiqueta1.setForeground(Color.white);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta1);

    }

    private void colocarCajaTexto() {

        caja = new JTextField();
        caja.setText("Nombre");
        caja.setFont(new Font("consolas", Font.ITALIC, 18));
        caja.setForeground(Color.LIGHT_GRAY);
        caja.setBounds(100, 50, 300, 30);
        caja.setColumns(10);
        panel.add(caja);

        ListenerKey();

    }

    private void colocarBoton() {

        boton = new JButton();
        boton.setBounds(200, 90, 100, 30);
        boton.setText("Pulsa aqui!");
        boton.setForeground(Color.white);
        boton.setBackground(Color.black);

        panel.add(boton);
        ListenerMouse(boton);
        ListenerAction();
    }

    private void ListenerAction() {
        // creamos la etiqueta de saludo
        JLabel saludo = new JLabel();

        saludo.setBounds(100, 130, 300, 30);
        saludo.setFont(new Font("consolas", Font.BOLD, 20));
        saludo.setForeground(Color.lightGray);
        saludo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(saludo);

        // Añadimos la accion del boton al hacer click
        ActionListener oyente = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                saludo.setText("Hola " + caja.getText());
            }

        };

        boton.addActionListener(oyente);
    }

    private void ListenerMouse(JButton button) {

        // hacemos un hover cuando el cursor pase por encima del boton

        // creamos un oyente de mouse
        MouseListener oyenteMouse = new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setForeground(Color.black);
                boton.setBackground(new Color(152, 251, 152));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setForeground(Color.white);
                boton.setBackground(Color.black);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                boton.setForeground(Color.black);
                boton.setBackground(new Color(205, 92, 92));
            }

            // estos metodos no los usare pero son obligatorios implementarlos ya que forman
            // parte de la interface

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
            }

        };
        button.addMouseListener(oyenteMouse);
    }

    private void ListenerKey() {

        // creamos un obj de tipo KeyListener
        KeyListener oyenteTeclado = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // ocurre un evento al precionar una tecla pero que sea del tipo caracter
                // UNICODE
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // ocurre un evento al precionar una tecla cualquiera
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Debes precionar la tecla y soltarlo para que se ejecute una vez
            }

        };
        caja.addKeyListener(oyenteTeclado);
    }

    // ____________ MAIN ______________

    public static void main(String[] args) {

        Eventos ventana = new Eventos();

        ventana.setVisible(true);
    }
}
