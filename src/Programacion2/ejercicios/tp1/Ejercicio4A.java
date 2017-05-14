package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.impl.QueueImpl;

//Pasar una Cola a otra
public class Ejercicio4A {

    public static void main(String[] args) {
        Queue sourceQueue = new QueueImpl();
        sourceQueue.initialize();
        Queue destinyQueue = new QueueImpl();
        destinyQueue.initialize();
        Utils.fillQueue(sourceQueue, 5);

        System.out.println("Los valores de la cola al principio del proceso son: ");
        sourceQueue.print();

        queueToQueue(sourceQueue, destinyQueue);

        System.out.println("\n\nLos valores de la cola al final del proceso son: ");
        destinyQueue.print();
    }

    private static void queueToQueue(Queue sourceQueue, Queue destinyQueue) {
        if (!sourceQueue.isEmpty()) {
            destinyQueue.add(sourceQueue.poll());
            queueToQueue(sourceQueue, destinyQueue);
        }
    }
}
