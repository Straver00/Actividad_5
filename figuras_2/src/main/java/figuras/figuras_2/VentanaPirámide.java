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
public class VentanaPirámide extends JFrame implements ActionListener{
private Container contenedor;
private JLabel base, altura, apotema, volumen, superficie;
private JTextField campoBase, campoAltura, campoApotema;
private JButton calcular;

public VentanaPirámide() {
inicio();
setTitle("Pirámide"); 
setSize(310,240); 
setLocationRelativeTo(null); 
setResizable(false); 
}
private void inicio() {
contenedor = getContentPane(); 
contenedor.setLayout(null); 
base = new JLabel();
base.setText("Base:");
base.setBounds(20, 20, 135, 23);
campoBase = new JTextField();
campoBase.setBounds(120, 20, 135, 23);

altura = new JLabel();
altura.setText("Altura:");
altura.setBounds(20, 50, 135, 23);
campoAltura = new JTextField();
campoAltura.setBounds(120, 50, 135, 23);

apotema = new JLabel();
apotema.setText("Apotema:");
apotema.setBounds(20, 80, 135, 23);
campoApotema = new JTextField();
campoApotema.setBounds(120, 80, 135, 23);

calcular = new JButton();
calcular.setText("Calcular");
calcular.setBounds(120, 110, 150, 23); 
calcular.addActionListener(this);

volumen = new JLabel();
volumen.setText("Volumen:");
volumen.setBounds(20, 140, 300, 23);

superficie = new JLabel();
superficie.setText("Superficie:");
superficie.setBounds(20, 170, 300, 23);

contenedor.add(base);
contenedor.add(campoBase);
contenedor.add(altura);
contenedor.add(campoAltura);
contenedor.add(apotema);
contenedor.add(campoApotema);
contenedor.add(calcular);
contenedor.add(volumen);
contenedor.add(superficie);
}
/**@param event
*/ @Override
    public void actionPerformed(ActionEvent event) {
Pirámide pirámide;
boolean error = false;
double base = 0;
double altura = 0;
double apotema = 0;
try {
base = Double.parseDouble(campoBase.getText());
altura = Double.parseDouble(campoAltura.getText());
apotema = Double.parseDouble(campoApotema.getText());
pirámide = new Pirámide(base, altura, apotema);
volumen.setText("Volumen: " + String.format("%.4f",pirámide.calcularVolumen())+ " cm3");
superficie.setText("Superficie: " + String.format("%.4f",pirámide.calcularSuperficie())+ " cm2");
} catch (NumberFormatException e) {
} finally {
if (error) { 
JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número","Error",JOptionPane.ERROR_MESSAGE);
}
}
}
}
