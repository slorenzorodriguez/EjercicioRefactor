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
public class Refactor3 {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean segundoOperando = false;

    public static void main(String arg[]) {
        int numeroDigitos = 0;  //nombre variable cambiado de 'numDigitos' a 'numeroDigitos'
        int numerodigitos = 0;  //nombre variable cambiado de 'ndigitos' a 'numerodigitos'
        numeroDigitos = Integer.parseInt(arg[0]);
        if (numeroDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int primerOperando = 1; primerOperando <= 99999; primerOperando++) { ////nombre variable cambiado de 'i' a 'primerOperando'
            int divisionEntera = primerOperando;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            numerodigitos = contador;

            if (numerodigitos == numeroDigitos) {
                if (contador < 4) {
                    segundoOperando = true; ////nombre variable cambiado de 'p' a 'segundoOperando'
                } else {
                    if (contador % 2 == 0) {
                        segundoOperando = false;
                    } else {
                        int contador1 = 0;
                        int tercerOperando = 1; ////nombre variable cambiado de 'il' a 'tercerOperando'
                        int limite = (contador - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (tercerOperando <= limite) {
                            if (contador % tercerOperando == 0) {
                                contador1++;
                            }
                            tercerOperando += 2;
                            if (contador1 == 2) {
                                tercerOperando = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            Refactor3.segundoOperando = true;
                        }
                    }
                }

                if (segundoOperando == true) {
                    System.out.println(contador);
                }
            }
        }
    }

}
