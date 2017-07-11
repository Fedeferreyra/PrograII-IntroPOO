package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.impl.ColaPrioridadEstatica;

/**
 * Combinar dos colas con prioridades CP1 y CP2, generando una nueva
 * cola con prioridades. Considerar que a igual prioridad, los elementos de la CP1
 * son más prioritarios que los de la CP2.
 */
public class Ejercicio6A {

    public static void main(String[] args) {
        ColaPrioridadEstatica prioritizedQueue1 = Utils.createPrioritizedQueue(9);
        ColaPrioridadEstatica prioritizedQueue2 = Utils.createPrioritizedQueue(9);

        System.out.println("Cola priorizada 1:");
        prioritizedQueue1.print();
        System.out.println("Cola priorizada 2:");
        prioritizedQueue2.print();

        System.out.println("Resultado");
        combinarColas(prioritizedQueue1, prioritizedQueue2).print();

    }

    private static ColaPrioridadEstatica combinarColas(ColaPrioridadEstatica prioritizedQueue1, ColaPrioridadEstatica prioritizedQueue2) {
        ColaPrioridadEstatica prioritizedQueue = new ColaPrioridadEstatica();

        int qty = prioritizedQueue1.size() + prioritizedQueue2.size();
        for (int i = 0; i < qty; i++) {
            if (prioritizedQueue1.size() > 0 ){
                prioritizedQueue.acolarPrioridad(prioritizedQueue1.primero(),prioritizedQueue1.prioridad());
                prioritizedQueue1.desacolar();
            } else if (prioritizedQueue2.size() > 0 ){
                prioritizedQueue.acolarPrioridad(prioritizedQueue2.primero(), prioritizedQueue2.prioridad());
                prioritizedQueue2.desacolar();
            }
        }
        return prioritizedQueue;
    }
}
