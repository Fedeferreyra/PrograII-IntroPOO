package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.impl.QueueImpl;

public class Ejercicio4A {

    public static void main(String[] args) {
        Queue sourceQueue = new QueueImpl();
        Queue destinyQueue = new QueueImpl();

        Utils.fillQueue(sourceQueue, 5);
        queueToQueue(sourceQueue, destinyQueue);
    }

    private static void queueToQueue(Queue sourceQueue, Queue destinyQueue) {
        if (!sourceQueue.isEmpty()) {
            destinyQueue.add(sourceQueue.poll());
            queueToQueue(sourceQueue, destinyQueue);
        }
    }
}
