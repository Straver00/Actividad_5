/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.figuras_2;

/**
 *
 * @author jg702
 */
public class Cilindro extends FiguraGeométrica {
private final double radio; 
private final double altura; 
public double calcularVolumen() {
double volumen = Math.PI * altura * Math.pow(radio, 2.0);
return volumen;
}
public double calcularSuperficie() {
double áreaLadoA = 2.0 * Math.PI * radio * altura;
double áreaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
return áreaLadoA + áreaLadoB;
}
public Cilindro(double radio, double altura) {
this.radio = radio;
this.altura = altura;
this.setVolumen(calcularVolumen()); 
this.setSuperficie(calcularSuperficie());
}
}

