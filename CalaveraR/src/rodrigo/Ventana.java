/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrigo;

import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author jovanadiaz
 */
public class Ventana extends JFrame {

    public Ventana() {
        this.setSize(600, 600);//Tamaño de la vantalla 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("<---Inicio--->");//Titulo de nuestra ventana
        setLocationRelativeTo(null);//Posicion de la ventana
        setMinimumSize(new Dimension(200, 200));//Primer numero ancho, segundo alto

        ComponentesInicio();
    }

    private void ComponentesInicio() {
        Paneles();
        Etiquetas();
        Boton();
    }

    private JPanel panel;

    private void Paneles() {
        panel = new JPanel();//Creamos de un panel
        panel.setLayout(null);//Desactivamos el Layout que implica el diseño
        this.getContentPane().add(panel);//Agregamos un panel a nuestra ventana
    }

    private void Etiquetas() {

        //Etiqueta 1 texto
        JLabel etiqueta = new JLabel("Calaverita Literaria");//texto etiqueta
        panel.add(etiqueta);//agregamos etiqueta 1 al panel
        etiqueta.setBounds(165, 0, 300, 80);//dimension de la etiqueta x,y,ancho,alto
        etiqueta.setForeground(Color.darkGray);//color del texto
        etiqueta.setFont(new Font("Baskerville", Font.ITALIC, 40));//tipo de fuente y tamaño de la letra

        //Insertar imagen
        //Etiqueta 2 imagen
        JLabel etiqueta2 = new JLabel();
        ImageIcon imagen = new ImageIcon("Literaria.png");

        panel.add(etiqueta2);//agregamos etiqueta dos al panel 
        etiqueta2.setBounds(75, 65, 450, 450);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

    }

    private void Boton() {
        JButton boton = new JButton("Mostrar");
        boton.setBounds(230, 520, 150, 40);
        boton.setForeground(Color.darkGray);//color del texto
        boton.setFont(new Font("Baskerville", Font.CENTER_BASELINE, 15));//tipo de fuente y tamaño de la letra
        boton.setEnabled(true);
        boton.setMnemonic('a'); //Establecemos alt + letra
        panel.add(boton);//agregamos un boton al panel 
        
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {


               Ventana2 texto = new Ventana2();
                texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                texto.setVisible(true);

               setVisible(false);

           }
        });
    
    }

    

}
