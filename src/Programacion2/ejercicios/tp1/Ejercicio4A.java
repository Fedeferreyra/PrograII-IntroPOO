package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.impl.ColaImpl;

//Pasar una Cola a otra
public class Ejercicio4A {

    public static void main(String[] args) {
        Cola sourceCola = new ColaImpl();
        sourceCola.inicializar();
        Cola destinyCola = new ColaImpl();
        destinyCola.inicializar();
        Utils.fillQueue(sourceCola, 5);

        System.out.println("Los valores de la cola al principio del proceso son: ");
        Utils.printStaticQueue(destinyCola);

        queueToQueue(sourceCola, destinyCola);

        System.out.println("\n\nLos valores de la cola al final del proceso son: ");
        Utils.printStaticQueue(sourceCola);
    }

    private static void queueToQueue(Cola sourceCola, Cola destinyCola) {
        if (!sourceCola.colaVacia()) {
            destinyCola.acolar(sourceCola.primero());
            sourceCola.desacolar();
            queueToQueue(sourceCola, destinyCola);
        }
    }
}
