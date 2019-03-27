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
public class Evento3 {
    //CLASE ANONIMA--> No tiene nombre
     //declaramos las variables
    JFrame marco;
    JPanel panel;
    JButton bVermello, bVerde, bAmarillo;
    
    public void crearVentana(){
        // creamos los objetos
        marco = new JFrame("Ventanuco de eventos");
        panel = new JPanel();
        bVermello = new JButton("vermello");
        bVerde = new JButton("verde");
        bAmarillo = new JButton("amarillo");
        
        marco.setSize(400, 200);
        panel.add(bVermello);
        panel.add(bVerde);
        panel.add(bAmarillo);
        marco.add(panel);
        
        //creacion de eventos
       //creo  tres objetos actionListener
       //uno por cada color / boton
       bVermello.addActionListener(new ActionListener()
       
        {
        public void actionPerformed(ActionEvent e){
           
            panel.setBackground(Color.red);
        }

          });
       bVerde.addActionListener(new ActionListener()
       
        {
        public void actionPerformed(ActionEvent e){
            panel.setBackground(Color.green);
            
        }

          });
       bAmarillo.addActionListener(new ActionListener()
       
        {
        public void actionPerformed(ActionEvent e){
           
            panel.setBackground(Color.yellow);
        }

          });
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
   
}
