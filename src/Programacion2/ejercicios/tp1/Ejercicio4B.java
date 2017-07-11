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
        Pila pila = new PilaEstatica();
        pila.inicializar();
        Cola destinyCola = new ColaEstatica();
        destinyCola.inicializar();
        Utils.fillQueue(sourceCola, 5);

        System.out.println("Los valores de la cola al principio del proceso son: ");
        Utils.printStaticQueue(sourceCola);

        invertQueue(sourceCola, pila, destinyCola);

        System.out.println("\n\nLos valores de la cola al final del proceso son: ");
        Utils.printStaticQueue(destinyCola);
    }

    private static void invertQueue(Cola sourceCola, Pila pila, Cola destinyCola){
        if (!sourceCola.colaVacia()){
            pila.apilar(sourceCola.primero());
            sourceCola.desacolar();
            invertQueue(sourceCola, pila, destinyCola);
        }else if(!pila.pilaVacia()){
            destinyCola.acolar(pila.tope());
            pila.desapilar();
            invertQueue(sourceCola, pila, destinyCola);
        }
    }
}