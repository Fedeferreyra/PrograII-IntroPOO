package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Pila;
import Programacion2.impl.PilaEstatica;

//Copiar una Pila en otra (dejándola en el mismo orden que la original)
public class Ejercicio2B {

    public static void main(String[] args) {
        PilaEstatica sourceStack = new PilaEstatica();
        PilaEstatica destinyStack = new PilaEstatica();
        sourceStack.inicializar();
        destinyStack.inicializar();
        Utils.fillStack(sourceStack, 5);
        copyStack(sourceStack, destinyStack);
    }

    private static void copyStack(Pila sourcePila, Pila destinyPila) {
       if (!sourcePila.pilaVacia()) {
            int pop = sourcePila.tope();
            sourcePila.desapilar();
            copyStack(sourcePila, destinyPila);
            destinyPila.apilar(pop);
        }
    }
}
