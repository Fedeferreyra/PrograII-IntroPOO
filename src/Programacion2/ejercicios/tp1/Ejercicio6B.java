package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.impl.PrioritizedQueueImpl;

/**
 * Determinar si dos Colas con prioridad son idénticas.
 */
public class Ejercicio6B {

    public static void main(String[] args) {
        PrioritizedQueueImpl prioritizedQueue = Utils.createPrioritizedQueue(9);
        PrioritizedQueueImpl prioritizedQueue1 = Utils.createPrioritizedQueue(9);

        System.out.println("Cola 1:");
        prioritizedQueue.print();
        System.out.println("Cola 2:");
        prioritizedQueue1.print();

        System.out.println(areEquals(prioritizedQueue, prioritizedQueue1));

    }

    private static String areEquals(PrioritizedQueueImpl prioritizedQueue, PrioritizedQueueImpl prioritizedQueue1) {
        boolean result = true;
        if (prioritizedQueue.size() == prioritizedQueue1.size()) {
            int size = prioritizedQueue.size();
            for (int i = 0; i < size; i++) {
                if (prioritizedQueue.peekPriority() != prioritizedQueue1.peekPriority()
                        || prioritizedQueue.poll() != prioritizedQueue1.poll()) {
                    result = false;
                    break;
                }
            }
        }else {
            result = false;
        }
        return result ? "Son identicas" : "No son identicas";
    }
}
