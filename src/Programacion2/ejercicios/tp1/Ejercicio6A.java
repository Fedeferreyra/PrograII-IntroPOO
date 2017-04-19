package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.impl.PrioritizedQueueImpl;

/**
 * Combinar dos colas con prioridades CP1 y CP2, generando una nueva
 * cola con prioridades. Considerar que a igual prioridad, los elementos de la CP1
 * son más prioritarios que los de la CP2.
 */
public class Ejercicio6A {

    public static void main(String[] args) {
        PrioritizedQueueImpl prioritizedQueue1 = Utils.createPrioritizedQueue(9);
        PrioritizedQueueImpl prioritizedQueue2 = Utils.createPrioritizedQueue(9);

        System.out.println("Cola priorizada 1:");
        prioritizedQueue1.print();
        System.out.println("Cola priorizada 2:");
        prioritizedQueue2.print();

        System.out.println("Resultado");
        combinarColas(prioritizedQueue1, prioritizedQueue2).print();

    }

    private static PrioritizedQueueImpl combinarColas(PrioritizedQueueImpl prioritizedQueue1, PrioritizedQueueImpl prioritizedQueue2) {
        PrioritizedQueueImpl prioritizedQueue = new PrioritizedQueueImpl();

        int qty = prioritizedQueue1.size() + prioritizedQueue2.size();
        for (int i = 0; i < qty; i++) {
            if (prioritizedQueue1.size() > 0 ){
                prioritizedQueue.add(prioritizedQueue1.peek(),prioritizedQueue1.peekPriority());
                prioritizedQueue1.poll();
            } else if (prioritizedQueue2.size() > 0 ){
                prioritizedQueue.add(prioritizedQueue2.peek(), prioritizedQueue2.peekPriority());
                prioritizedQueue2.poll();
            }
        }
        return prioritizedQueue;
    }
}
