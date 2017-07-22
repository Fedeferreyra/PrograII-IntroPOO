package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Pila;
import Programacion2.impl.PilaEstatica;

//Sumar los elementos de una Pila
public class Ejercicio2E {

    public static void main(String[] args) {
        Pila pila = new PilaEstatica();
        pila.inicializar();
        Utils.fillStack(pila, 5);

        System.out.println("Los valores de la pila son:");
        int suma = sumar(pila);
        System.out.println("\nLos valores sumados de la pila son: " + suma);

    }

    public static int sumar(Pila pila) {
        if (!pila.pilaVacia()) {
            int tope = pila.tope();
            pila.desapilar();
            return sumar(pila) + tope;
        } else {
            return 0;
        }
    }
}
