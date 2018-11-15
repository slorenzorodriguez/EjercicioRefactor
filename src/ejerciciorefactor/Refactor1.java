/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorefactor;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Refactor1 {

    /*
 * Examen Refactorizacion
 * 
     */

//Código Formateado
    public static void main(String[] args) {
        String nombre; //nombre variable cambiado de 'n' a 'nombre'
        String edad; //nombre variable cambiado de 'e' a 'edad'

        int meses; //nombre variable cambiado de 'm' a 'meses'
        int dias; //nombre variable cambiado de 'd' a 'dias'
        int horas; //nombre variable cambiado de 'h' a 'horas'
        int años; //nombre variable cambiado de 'a' a 'años'

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        años = Integer.parseInt(edad);

        meses = (años * 12);
        dias = (años * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
