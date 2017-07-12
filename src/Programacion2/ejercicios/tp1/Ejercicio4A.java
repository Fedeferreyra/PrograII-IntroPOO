package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.impl.ColaEstatica;

//Pasar una Cola a otra
public class Ejercicio4A {

    public static void main(String[] args) {
        Cola sourceCola = new ColaEstatica();
        sourceCola.inicializar();
        Cola destinyCola = new ColaEstatica();
        destinyCola.inicializar();
        Utils.fillQueue(sourceCola, 5);
        queueToQueue(sourceCola, destinyCola);
        int i = 0;
    }

    private static void queueToQueue(Cola sourceCola, Cola destinyCola) {
        while(!sourceCola.colaVacia()) {
            destinyCola.acolar(sourceCola.primero());
            sourceCola.desacolar();
        }
    }
}
