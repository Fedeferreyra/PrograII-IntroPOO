package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.api.Pila;
import Programacion2.impl.ColaImpl;
import Programacion2.impl.PilaEstatica;

//Invertir el contenido de una Cola (pueden usarse Pilas auxiliares)
public class Ejercicio4B {

    public static void main(String[] args) {
        Cola sourceCola = new ColaImpl();
        Pila pila = new PilaEstatica();
        pila.inicializar();
        Cola destinyCola = new ColaImpl();
        destinyCola.initialize();
        Utils.fillQueue(sourceCola, 5);

        System.out.println("Los valores de la cola al principio del proceso son: ");
        Utils.printStaticQueue(sourceCola);

        invertQueue(sourceCola, pila, destinyCola);

        System.out.println("\n\nLos valores de la cola al final del proceso son: ");
        Utils.printStaticQueue(destinyCola);
    }

    private static void invertQueue(Cola sourceCola, Pila pila, Cola destinyCola){
        if (!sourceCola.isEmpty()){
            pila.apilar(sourceCola.peek());
            sourceCola.poll();
            invertQueue(sourceCola, pila, destinyCola);
        }else if(!pila.pilaVacia()){
            destinyCola.add(pila.tope());
            pila.desapilar();
            invertQueue(sourceCola, pila, destinyCola);
        }
    }
}