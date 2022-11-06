/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrigo;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author jovanadiaz
 */
public class Ventana2 extends JFrame {

    private JPanel panel;

    public Ventana2() {
        setSize(500, 500); //Tamaño de la ventana
        setTitle("<---Texto--->"); //Titulo de la ventana
        setBounds(100, 200, 500, 600); //Tamaño y posición de la ventana
        setLocationRelativeTo(null); //Con esto colocamos la ventana en el centro de la pantalla
        setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no
        setMinimumSize(new Dimension(200, 200)); //Tamaño mínimo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Finalizamos el programa en cuanto cerremos la ventana

        ComponentesInicio();
    }

    private void ComponentesInicio() {
        Paneles();
        Fondo();
    }

    private void Paneles() {
        panel = new JPanel(); //Creamos de un panel
        panel.setLayout(null); //Desactivamos el Layout que implica el diseño
        this.getContentPane().add(panel); //Agregamos un panel a la ventana
    }

    private void Fondo(){
    JLabel etiqueta2 = new JLabel();
        ImageIcon imagen = new ImageIcon("Texto.png");

        panel.add(etiqueta2);//agregamos etiqueta dos al panel 
        etiqueta2.setBounds(2, 2, 495, 600);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

    }
}
    
    
