package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Pila;
import Programacion2.impl.PilaEstatica;

//Pasar una Pila a otra (dejándola en orden inverso)
public class Ejercicio2A {

    public static void main(String[] args) {
        Pila sourcePila = new PilaEstatica();
        sourcePila.inicializar();
        Pila destinyPila = new PilaEstatica();
        destinyPila.inicializar();
        Utils.fillStack(sourcePila, 5);
        fromStackToStack(sourcePila, destinyPila);
        int x = 0;
    }

    private static void fromStackToStack(Pila sourcePila, Pila destinyPila) {
        while (!sourcePila.pilaVacia()) {
            destinyPila.apilar(sourcePila.tope());
            sourcePila.desapilar();
        }
    }
}
