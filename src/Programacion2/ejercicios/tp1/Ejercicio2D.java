package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Pila;
import Programacion2.impl.PilaEstatica;

//Contar los elementos de una Pila
public class Ejercicio2D {

    public static void main(String[] args) {
        PilaEstatica stack = new PilaEstatica();
        stack.inicializar();
        Utils.fillStack(stack, 5);
    }

    private static int count(Pila pila) {
        int count = 0;
        while (!pila.pilaVacia()){
             pila.desapilar();
            count ++;
        }
        return count;
    }
}
