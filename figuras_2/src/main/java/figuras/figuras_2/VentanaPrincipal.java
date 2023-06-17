/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.figuras_2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jg702
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
private Container contenedor;
private JButton cilindro, esfera, pirámide;
public VentanaPrincipal(){
inicio();
setTitle("Figuras"); 
setSize(350,160); 
setLocationRelativeTo(null); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void inicio() {
contenedor = getContentPane();
contenedor.setLayout(null); 
cilindro = new JButton();
cilindro.setText("Cilindro");
cilindro.setBounds(20, 50, 80, 23); 
cilindro.addActionListener(this);

esfera = new JButton();
esfera.setText("Esfera");
esfera.setBounds(125, 50, 80, 23); 
esfera.addActionListener(this);

pirámide = new JButton();
pirámide.setText("Pirámide");
pirámide.setBounds(225, 50, 100, 23); 
pirámide.addActionListener(this);

contenedor.add(cilindro);
contenedor.add(esfera);
contenedor.add(pirámide);
}
/** @param evento
*/
@Override
public void actionPerformed(ActionEvent evento) {
if (evento.getSource() == esfera) { 
VentanaEsfera Esfera = new VentanaEsfera(); 
Esfera.setVisible(true); 
}
if (evento.getSource() == cilindro) { 
VentanaCilindro Cilindro = new VentanaCilindro(); 
Cilindro.setVisible(true); 
}
if (evento.getSource() == pirámide) { 
VentanaPirámide Pirámide = new VentanaPirámide(); 
Pirámide.setVisible(true); 
}
}
}
