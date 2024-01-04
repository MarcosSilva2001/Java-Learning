package Capas_App.IGU;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * ------------------------------------------ JFrame -----------------------------------------------------------
 * Es una clase que representa una ventana en una aplicación de GUI.
 *  Es la ventana principal que contiene todos los componentes gráficos, como botones, 
 * etiquetas, paneles, etc. Adeamas,tiene métodos para configurar y gestionar la apariencia de la ventana,
 * como el título, tamaño, operación de cierre, diseño, etc.
 * 
 * ------------------------------------------ JPanel -----------------------------------------------------------
 * Se utiliza para crear áreas dentro de una interfaz gráfica de usuario (GUI) donde puedes organizar
 * y colocar otros componentes gráficos, como botones, etiquetas, cuadros. de texto, etc.
 * 
 * ------------------------------------------ JLabel -----------------------------------------------------------
 * Proporciona un componente de interfaz gráfica (etiqueta) para mostrar texto o imágenes en una ventana de la aplicación. 
 * Se utiliza comúnmente para presentar información estática o gráfica en aplicaciones de usuario.
 * 
 * ------------------------------------------ JButton -----------------------------------------------------------
 * Es un componente de botón que se utiliza para realizar acciones cuando se hace clic en él. Puedes crear un botón, 
 * establecer su etiqueta (el texto que se muestra en el botón) y asociarle un "escuchador" de eventos que se activará 
 * cuando el botón sea clicado.
 * 
 * ------------------------------------------ JRadioButton -----------------------------------------------------------
 * Representa un botón de opción. Los botones de opción se utilizan comúnmente en interfaces de usuario para permitir 
 * que los usuarios seleccionen una opción de un conjunto de opciones mutuamente excluyentes. Cuando se utiliza un 
 * grupo de botones de opción, solo un botón dentro del grupo puede estar seleccionado a la vez.
 * 
 * ------------------------------------------- JCheckBox --------------------------------------------------------------
 * Representa una casilla de verificación. Las casillas de verificación se utilizan para permitir a los usuarios 
 * seleccionar opciones independientes entre sí, es decir, los usuarios pueden marcar o desmarcar cada casilla 
 * de verificación individualmente.
 * 
 * ------------------------------------------- JTextField -------------------------------------------------------------
 * Proporciona un campo de texto de una sola línea, donde los usuarios pueden ingresar y editar texto
 * 
 * ------------------------------------------- JTextArea -------------------------------------------------------------
 * Proporciona un área de texto de varias líneas donde los usuarios pueden ingresar, editar y ver texto. A diferencia 
 * de JTextField, que es un campo de texto de una sola línea, JTextArea está diseñado para manejar bloques de texto más
 * grandes y permite la entrada y visualización de texto en varias líneas.
 * 
 * ------------------------------------------- JpasswordField -------------------------------------------------------------
 * Está diseñada específicamente para la entrada de contraseñas o información confidencial, ya que oculta el texto ingresado.
 * 
 * ------------------------------------------- JComboBox -------------------------------------------------------------
 * Un cuadro combinado es un widget que permite al usuario seleccionar un elemento de una lista desplegable. Puedes pensar en
 * ello como una caja que muestra una lista de opciones y te permite elegir una de esas opciones.
 */
public class Ventana extends JFrame {

    public JPanel panel = new JPanel(); // creamos un panel publico

    // creamos nuestro Constructor de la ventana
    public Ventana() {
        // ------------ Configuración básica de la ventana ---------------

        setTitle("Bienvenidos"); // define un titulo en la ventana
        setSize(600, 500); // define el tamaño de la ventana
        setLocationRelativeTo(null); // posicionar la ventana en el centro

        // ---------------------------------------------------------------
        // define la dimencion minima de la ventana
        setMinimumSize(new Dimension(200, 200));

        // finalizar la ejecucion de la ventana al presional la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // color de fondo
        this.getContentPane().setBackground(Color.darkGray);

        // ALGUNOS METODOS QUE PODEMOS USAR
        /*
         * mover la posicion de la ventana -------> ventanasetLocation(x, y);
         * 
         * tamaño y la posicion de la ventana ----> setBounds(X,Y,WIDTH,HEIGHT);
         * 
         * titulo para la ventana -----> setTitle("Titulo");
         * 
         * tamaño de la ventana -----> setSize(600, 500);
         * 
         * finalizar la ejecucion de la ventana --->
         * setDefaultCloseOperation(EXIT_ON_CLOSE);
         * 
         * centrar ventana ----> setLocationRelativeTo(null);
         * 
         * color ventana ---> this.getContentPane().setBackground(Color);
         */

        // desde la ventana llamamos a los paneles

        iniciarComponentes();

    }

    private void iniciarComponentes() {

        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarRadioBotones();
        colocarCheckBox();
        colocarCajasTexto();
        colocarAreaTexto();
        colocarCampoContraseña();
        colocarComboBox();

    }

    private void colocarPaneles() {
        // ---------------------- PANELES -------------------------
        panel = new JPanel(); // creamos un panel

        this.getContentPane().add(panel); // obtenemos el contenido y agregamos el panel a la ventana

        panel.setLayout(null); // desactiva el diseño por defecto
        panel.setBackground(Color.CYAN); // definimo un color para el panel
        panel.setBorder(BorderFactory.createLineBorder(Color.red)); // borde para el panel y elegimos el color
        panel.setVisible(true); // hacemos visible el panel
        panel.repaint(); // Vuelve a pintar el panel cuando se realizan cambios que afectan la apariencia
        panel.setOpaque(true); // define si el panel es opaco o no , false para mostrar el fondo
    }

    private void colocarEtiquetas() {
        // ---------------------- ETIQUETAS -------------------------
        JLabel etiqueta = new JLabel(); // creamos una etiqueta

        // ------------ ETIQUETA TIPO TEXTO ------------
        // texto y tipografia
        etiqueta.setText("HOLA"); // establecemos el texto de la etiqueta
        Font customFont = new Font("chiller", Font.ITALIC, 16); // definimos una tipografia
        etiqueta.setFont(customFont);

        // posiciones
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // alineacion horizontal
        etiqueta.setVerticalAlignment(SwingConstants.BOTTOM); // alineacion vertical
        etiqueta.setBounds(10, 10, 60, 20); // posicion de la etiqueta y tamaño

        // colores
        etiqueta.setOpaque(true); // damos permiso para poder pintar el fondo
        etiqueta.setForeground(Color.MAGENTA); // establecer color de letra
        etiqueta.setBackground(Color.WHITE); // establecer color del fondo de la etiqueta

        // imagenes e iconos

        panel.add(etiqueta); // agregamos la etiqueta al panel

        // ------------ ETIQUETA TIPO IMAGEN ------------
        JLabel etiqueta2 = new JLabel();

        etiqueta2.setBounds(10, 80, 400, 350); // tamaño del contenedor de la etiqueta

        ImageIcon icon = new ImageIcon("Imagenes\\minecraft.png");

        etiqueta2.setIcon(icon); // establecemos un imagen/icono

        /*
         * Puedes escalar imágenes utilizando métodos como
         * ImageIcon(#getImage().getScaledInstance()).
         * Esto es útil para ajustar el tamaño de la imagen según tus necesidades.
         * 
         * etiqueta2.setIcon(new ImageIcon(icon.getImage().getScaledInstance(150, 150,
         * Image.SCALE_SMOOTH)));
         */

        panel.add(etiqueta2); // agregamos la etiqueta2 al panel
    }

    private void colocarBotones() {
        // -------------------- BOTONES -------------------------
        JButton boton1 = new JButton();

        boton1.setBounds(300, 90, 100, 40); // tamaño del boton
        boton1.setText("click"); // texto dentro del boton
        boton1.setFont(new Font("consolas", Font.PLAIN, 14)); // tipografia del texto
        boton1.setEnabled(true); // habilitar o deshabilitar el boton
        boton1.setMnemonic('a'); // establecemos alt + letra ,tecla de acceso rápido para el botón.
        boton1.setBorder(BorderFactory.createLineBorder(Color.red)); // borde del boton de color

        /*
         * ActionListener es una interfaz que proporciona un método llamado
         * actionPerformed,
         * que se ejecuta cuando ocurre un evento de acción, como hacer clic en un
         * botón.
         */
        boton1.addActionListener(e -> {
            // Mostrar un mensaje cuando se hace clic en el botón
            JOptionPane.showMessageDialog(null, "¡Botón clicado!");
        });

        panel.add(boton1);

    }

    private void colocarRadioBotones() {
        // ------------------ RADIO BOTONES -----------------------
        JRadioButton radio1 = new JRadioButton();
        radio1.setBounds(50, 50, 90, 20); // posicion y tamaño
        radio1.setText("Opcion 1"); // texto del radio boton
        radio1.setSelected(true); // Selecciona el botón en su estado por defecto
        radio1.setEnabled(true); // habilitar o deshabilitar el boton
        panel.add(radio1);

        JRadioButton radio2 = new JRadioButton();
        radio2.setBounds(50, 70, 90, 20);
        radio2.setText("Opcion 2");
        panel.add(radio2);

        JRadioButton radio3 = new JRadioButton();
        radio3.setBounds(50, 90, 90, 20);
        radio3.setText("Opcion 3");
        panel.add(radio3);

        /*
         * podemos notar que son radio botones individuales y que todos se pueden
         * seleccionar para ello creamos un grupo de radio botones para que se pueda
         * seleccionar uno solo
         */
        ButtonGroup grupito = new ButtonGroup();
        grupito.add(radio1);
        grupito.add(radio2);
        grupito.add(radio3);

    }

    private void colocarCheckBox() {
        JCheckBox checkBox = new JCheckBox();

        checkBox.setText("Acepta los terminos!");
        checkBox.setBounds(200, 80, 100, 30);
        checkBox.setSelected(true); // Marca la casilla
        checkBox.setEnabled(true); // habilita la casilla

        panel.add(checkBox);
    }

    private void colocarCajasTexto() {
        // --------------- CAJAS DE TEXTO ------------------
        JTextField caja = new JTextField();

        caja.setBounds(200, 10, 100, 30);
        caja.setText("Escribe...");
        caja.getText(); // obtener lo que hay en la caja de texto
        caja.setEditable(true); // Deshabilita la edición del campo de texto
        caja.setColumns(10); // Establece el ancho del campo de texto a n columnas
        caja.selectAll(); // Selecciona todo el texto en el campo
        caja.setCaretPosition(0); // Establece el cursor al principio del texto

        /*
         * ---------------------- addFocusListener -------------------------
         * Es una interfaz en Java que pertenece al paquete java.awt.event. Esta
         * interfaz define dos métodos que permiten
         * a una clase escuchar eventos de foco en componentes, como campos de texto,
         * botones u otros elementos gráficos
         * en una interfaz de usuario. Los dos métodos definidos por la interfaz
         * FocusListener son:
         * 
         * - focusGained(FocusEvent e): Este método se invoca cuando el componente
         * obtiene el foco, es decir,
         * cuando se vuelve activo o seleccionado para recibir eventos de entrada.
         * 
         * - focusLost(FocusEvent e): Este método se invoca cuando el componente pierde
         * el foco, es decir, cuando otro componente se vuelve activo.
         * 
         */
        caja.addFocusListener(new FocusListener() {

            @Override

            public void focusGained(FocusEvent e) {
                // Cuando la caja de texto obtiene el enfoque, borra el texto
                if (caja.getText().equals("Escribe...")) {
                    caja.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Cuando la caja de texto pierde el enfoque y está vacía, muestra el texto
                if (caja.getText().equals("")) {
                    caja.setText("Escribe...");
                }
            }
        });

        panel.add(caja);
    }

    private void colocarAreaTexto() {
        // --------------- AREA DE TEXTO ------------------
        JTextArea area = new JTextArea();

        area.setBounds(350, 10, 150, 80);
        area.setText("Escriba un texto ");
        area.setEditable(true); // Deshabilita la edición del área de texto
        area.setLineWrap(true); // Habilita la envoltura automática del texto
        area.insert("\nTexto insertado", 17); // Inserta en la posición 10
        area.setCaretPosition(0); // Establece el cursor al principio del texto
        area.append("Texto adicional"); // anade texto al final del área de texto
        panel.add(area);
    }

    private void colocarCampoContraseña() {
        // ------------------- CAMPO CONTRASEÑA -----------------
        JPasswordField contra = new JPasswordField();

        char[] password = contra.getPassword(); // Obtiene la contraseña como un array de caracteres
        contra.setEchoChar('*'); // Puedes cambiar el carácter de ingreso (*) por defecto
        contra.selectAll(); // Selecciona todo el texto en el campo de contraseña

    }

    private void colocarComboBox() {
        // ---------------- LISTA DESPLEGABLE ---------------
        String paises[] = { "Peru", "Argentina", "Brasil", "Paraguay", "Chile" };// declaro un array de paises

        JComboBox<String> listaDesplegable = new JComboBox<>(paises);

        listaDesplegable.setBounds(400, 100, 100, 50);
        listaDesplegable.addItem("Ecuador"); // agregootro item a la lista desplegable
        listaDesplegable.removeItem("Chile"); // elimina el item con la primera ocurrencia
        listaDesplegable.setSelectedItem("Brasil"); // selecciona el primer elemento que se muestra
        listaDesplegable.setMaximumRowCount(3); // establece el numero maximo de filas visibles
        listaDesplegable.getMaximumRowCount(); // devuelve la cantidad maxima de filas visibles

        panel.add(listaDesplegable);
    }
}