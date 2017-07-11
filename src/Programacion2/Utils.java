package Programacion2;

import Programacion2.api.Pila;
import Programacion2.api.Queue;
import Programacion2.impl.PilaEstatica;
import Programacion2.impl.PrioritizedQueueImpl;

import java.util.Random;

public class Utils {

    public static void fillStack(Pila pila, int qty) {
        for (int i = 0; i < qty; i++) {
            pila.apilar(new Random().nextInt(100));
        }
    }

    public static void fillQueue(Queue queue, int qty){
        for (int i = 0; i < qty; i++) {
            queue.add(new Random().nextInt(100));
        }
    }

    public static PrioritizedQueueImpl createPrioritizedQueue(int qty) {
        PrioritizedQueueImpl queue = new PrioritizedQueueImpl();
        queue.initialize();
        for (int i = 0; i < qty; i++) {
            queue.add(new Random().nextInt(100), new Random().nextInt(10));
        }
        return queue;
    }

    public static void printStaticStack(Pila pila) {
        PilaEstatica sToPrint = (PilaEstatica) pila;
        sToPrint.print();
    }

    public static void printStaticQueue(Queue queue) {
        Queue aux = queue;
        while (!aux.isEmpty()) {
            System.out.println(aux.peek());
            aux.poll();
        }
    }
}
