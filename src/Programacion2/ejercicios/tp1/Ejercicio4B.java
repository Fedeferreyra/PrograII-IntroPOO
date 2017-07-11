package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Pila;
import Programacion2.api.Queue;
import Programacion2.impl.PilaEstatica;
import Programacion2.impl.QueueImpl;

//Invertir el contenido de una Cola (pueden usarse Pilas auxiliares)
public class Ejercicio4B {

    public static void main(String[] args) {
        Queue sourceQueue = new QueueImpl();
        Pila pila = new PilaEstatica();
        pila.inicializar();
        Queue destinyQueue = new QueueImpl();
        destinyQueue.initialize();
        Utils.fillQueue(sourceQueue, 5);

        System.out.println("Los valores de la cola al principio del proceso son: ");
        Utils.printStaticQueue(sourceQueue);

        invertQueue(sourceQueue, pila, destinyQueue);

        System.out.println("\n\nLos valores de la cola al final del proceso son: ");
        Utils.printStaticQueue(destinyQueue);
    }

    private static void invertQueue(Queue sourceQueue, Pila pila, Queue destinyQueue){
        if (!sourceQueue.isEmpty()){
            pila.apilar(sourceQueue.peek());
            sourceQueue.poll();
            invertQueue(sourceQueue, pila, destinyQueue);
        }else if(!pila.pilaVacia()){
            destinyQueue.add(pila.tope());
            pila.desapilar();
            invertQueue(sourceQueue, pila, destinyQueue);
        }
    }
}