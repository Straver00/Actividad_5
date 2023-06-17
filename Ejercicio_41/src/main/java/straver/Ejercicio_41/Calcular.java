/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package straver.Ejercicio_41;

import javax.swing.JList;

/**
 *
 * @author macui
 */
public class Calcular {
    public static boolean isNumeric(String s)
    {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    public static double NumMasGrande(JList<String> lista) {
        double[] numeros = new double[lista.getModel().getSize()];
        for (int i = 0; i < lista.getModel().getSize(); i++) {
            String s = lista.getModel().getElementAt(i);
            numeros[i] = Double.parseDouble(s);
        }
        double mayor = numeros[0];
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > mayor) {
                mayor = numeros[x];
            }
        }
        return mayor;
    }
    public static double NumMasPequeño(JList<String> lista) {
        double[] numeros = new double[lista.getModel().getSize()];
        for (int i = 0; i < lista.getModel().getSize(); i++) {
            String s = lista.getModel().getElementAt(i);
            numeros[i] = Double.parseDouble(s);
        }
        double menor = numeros[0];
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] < menor) {
                menor = numeros[x];
            }
        }
        return menor;
    }
    public static double NumPromedio(JList<String> lista) {
        double[] numeros = new double[lista.getModel().getSize()];
        for (int i = 0; i < lista.getModel().getSize(); i++) {
            String s = lista.getModel().getElementAt(i);
            numeros[i] = Double.parseDouble(s);
        }
        double suma = 0;
        for (int x = 0; x < numeros.length; x++) {
            suma+=numeros[x];
        }
        return (suma/numeros.length);
    }
    public static double Des(JList<String> lista) {
        double[] numeros = new double[lista.getModel().getSize()];
        for (int i = 0; i < lista.getModel().getSize(); i++) {
            String s = lista.getModel().getElementAt(i);
            numeros[i] = Double.parseDouble(s);
        }
        double suma = 0;
        for (int x = 0; x < numeros.length; x++) {
            suma+=numeros[x];
        }
        
        double prom = (suma/numeros.length);
        double suma2=0;
        for (int i = 0; i < numeros.length; i++) {
            suma2 += Math.pow(numeros[i] - prom, 2 );
        }
        return Math.sqrt (suma2/numeros.length );
}
}

