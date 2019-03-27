/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ifernandezblanco
 */
public class Eventos2  {
    //declaramos las variables
    JFrame marco;
    JPanel panel;
    JButton bVermello;
    
    public void crearVentana(){
        // creamos los objetos
        marco = new JFrame("Ventanuco de eventos");
        panel = new JPanel();
        bVermello = new JButton("vermello");
        
        marco.setSize(400, 200);
        panel.add(bVermello);
        marco.add(panel);
        
        //creacion de eventos
        //llamado a la clase executarevento
        bVermello.addActionListener(new ExecutarEvento());
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Utilizando una clase interna
//permite acceder a los metodos y atributos de esta
    public class ExecutarEvento implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setBackground(Color.red);
    }
}
}

   
    
