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
        Utils.printStaticStack(pila);
        int suma = sumar(pila, 0);
        System.out.println("Los valores sumados de la pila son: " + suma);

    }

    public static int sumar(Pila pila, int suma) {
        suma = suma + pila.tope();
        pila.desapilar();
        return pila.pilaVacia() ?  suma : sumar(pila, suma);
    }
}
