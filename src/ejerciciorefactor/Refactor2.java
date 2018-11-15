/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorefactor;

/**
 *
 * @author slorenzorodriguez
 */
//Codigo Formateado
public class Refactor2 {

    public static void main(String[] args) {

        int primerOperando; //nombre variable cambiado de 'j' a 'primerOperando'
        int segundoOperando; //nombre variable cambiado de 'f' a 'segundoOperando'

        primerOperando = 8;

        int tercerOperando; //nombre variable cambiado de 'i' a 'tercerOperando'
        if (primerOperando == 0) {
            segundoOperando = 1;
        } else {
            segundoOperando = 1;
            for (tercerOperando = primerOperando; tercerOperando >= 1; tercerOperando--) {
                segundoOperando = segundoOperando * tercerOperando;
            }
        }

        System.out.println(segundoOperando);

    }

}
