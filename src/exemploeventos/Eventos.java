
package exemploeventos;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ifernandezblanco
 */
public class Eventos implements ActionListener {
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
        bVermello.addActionListener(this);
        bVerde.addActionListener(this);
        bAmarillo.addActionListener(this);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
// metodo que implementa los metods de ActionListener
    //el this indica que el elemento que escucha esta en la clase(este caso evento)
    @Override
    public void actionPerformed(ActionEvent e) {
        //aqui se produce el evento
        //este e.getsource nos devuelve quien desarolla el evento
        //conndicional que varia que codigo funciona segun la situacion
       if(e.getSource() == bVermello){
           panel.setBackground(Color.red);
       }
       else if(e.getSource() == bVerde){
           panel.setBackground(Color.green);
       }
       else{
        panel.setBackground(Color.yellow);
    }
    }
     
    
    }
    

