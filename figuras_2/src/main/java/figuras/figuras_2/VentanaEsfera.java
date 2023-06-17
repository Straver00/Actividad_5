/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.figuras_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jg702
 */
public class VentanaEsfera extends JFrame implements ActionListener {
private Container contenedor;
private JLabel radio, volumen, superficie;
private JTextField campoRadio; 
private JButton calcular; 
public VentanaEsfera() {
inicio();
setTitle("Esfera"); 
setSize(310,200); 
setLocationRelativeTo(null); 
setResizable(false); 
}
private void inicio(){
contenedor = getContentPane();
contenedor.setLayout(null); 
radio = new JLabel();
radio.setText("Radio:");
radio.setBounds(20, 20, 135, 23); 
campoRadio = new JTextField();
campoRadio.setBounds(100, 20, 135, 23);

calcular = new JButton();
calcular.setText("Calcular");
calcular.setBounds(100, 50, 135, 23); 
calcular.addActionListener(this);

volumen = new JLabel();
volumen.setText("Volumen:");
volumen.setBounds(20, 90, 300, 23);

superficie = new JLabel();
superficie.setText("Superficie:");
superficie.setBounds(20, 120, 300, 23);

contenedor.add(radio);
contenedor.add(campoRadio);
contenedor.add(calcular);
contenedor.add(volumen);
contenedor.add(superficie);
}
@Override
public void actionPerformed(ActionEvent evento) {
if (evento.getSource() == calcular) { 
boolean error = false;
try {
double radio = Double.parseDouble(campoRadio.getText());
Esfera esfera = new Esfera(radio); 
volumen.setText("Volumen: " + String.format("%.4f", esfera.calcularVolumen())+ " cm3");
superficie.setText("Superficie: " + String.format("%.4f",esfera.calcularSuperficie())+ " cm2");
} catch (NumberFormatException e) {
error = true; 
} finally {
if(error) { 
JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de número"," Error", JOptionPane.ERROR_MESSAGE);
}
}
}
}
}

