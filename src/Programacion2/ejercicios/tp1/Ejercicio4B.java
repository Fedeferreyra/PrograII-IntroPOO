package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.api.Pila;
import Programacion2.impl.ColaEstatica;
import Programacion2.impl.PilaEstatica;

//Invertir el contenido de una Cola (pueden usarse Pilas auxiliares)
public class Ejercicio4B {

    public static void main(String[] args) {
        Cola sourceCola = new ColaEstatica();
        sourceCola.inicializar();
        Pila pila = new PilaEstatica();
        pila.inicializar();
        Cola destinyCola = new ColaEstatica();
        destinyCola.inicializar();
        Utils.fillQueue(sourceCola, 5);
        invertQueue(sourceCola, pila, destinyCola);
        int i = 0;
    }

    private static void invertQueue(Cola sourceCola, Pila pila, Cola destinyCola){
        while (!sourceCola.colaVacia()) {
            pila.apilar(sourceCola.primero());
            sourceCola.desacolar();
        }
        while(!pila.pilaVacia()) {
            destinyCola.acolar(pila.tope());
            pila.desapilar();
        }
    }
}