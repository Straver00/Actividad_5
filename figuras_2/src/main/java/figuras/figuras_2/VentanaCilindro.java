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
public class VentanaCilindro extends JFrame implements ActionListener {
private Container contenedor;
private JLabel radio, altura, volumen, superficie;
private JTextField campoRadio, campoAltura;

private JButton calcular;
public VentanaCilindro() {
inicio();
setTitle("Cilindro");
setSize(310,210); 
setLocationRelativeTo(null); 
setResizable(false);
}
private void inicio() {
contenedor = getContentPane(); 
contenedor.setLayout(null); 
radio = new JLabel();
radio.setText("Radio:");
radio.setBounds(20, 20, 135, 23); 
campoRadio = new JTextField();
campoRadio.setBounds(100, 20, 135, 23);

altura = new JLabel();
altura.setText("Altura:");
altura.setBounds(20, 50, 135, 23); 
campoAltura = new JTextField();
campoAltura.setBounds(100, 50, 135, 23);

calcular = new JButton();
calcular.setText("Calcular");
calcular.setBounds(100, 80, 135 , 23); 
calcular.addActionListener(this);

volumen = new JLabel();
volumen.setText("Volumen:");
volumen.setBounds(20, 110, 300, 23);

superficie = new JLabel();
superficie.setText("Superficie:");
superficie.setBounds(20, 140, 300, 23);
contenedor.add(radio);
contenedor.add(campoRadio);
contenedor.add(altura);
contenedor.add(campoAltura);
contenedor.add(calcular);
contenedor.add(volumen);
contenedor.add(superficie);
}
@Override
public void actionPerformed(ActionEvent event) {
boolean error = false; 
double radio = 0;
double altura = 0;
try {
radio = Double.parseDouble(campoRadio.getText());
altura = Double.parseDouble(campoAltura.getText());
Cilindro cilindro = new Cilindro(radio, altura); 
volumen.setText("Volumen: " + String.format("%.4f",cilindro.calcularVolumen())+ " cm3");
superficie.setText("Superficie: " + String.format("%.4f",cilindro.calcularSuperficie())+ " cm2");
} catch (NumberFormatException e){
error = true; 
} finally {
if(error) { 
JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero","Error", JOptionPane.ERROR_MESSAGE);
}
}
}
}

