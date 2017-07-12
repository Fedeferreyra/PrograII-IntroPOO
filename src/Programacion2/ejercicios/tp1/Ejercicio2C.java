package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Pila;
import Programacion2.impl.PilaEstatica;

//Invertir el contenido de una Pila.
public class Ejercicio2C {

    public static void main(String[] args) {
        Pila pila = new PilaEstatica();
        pila.inicializar();
        Utils.fillStack(pila, 5);

        System.out.println("Los valores de la pila al principio del proceso son:");
        Utils.printStaticStack(pila);

         invertStack(pila);

        System.out.println("\n\nLos valores de la pila al final del proceson son:");
        Utils.printStaticStack(pila);
    }

    private static void invertStack(Pila pila) {
        int[] elementos =  new int[100];
        int index = 0;
        while (!pila.pilaVacia()) {
            elementos[index] = pila.tope();
            pila.desapilar();
            index++;
        }
        for (int j=0 ; j < index ; j++) {
            pila.apilar(elementos[j]);
        }
    }
}
