package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.impl.ColaPrioridadEstatica;

/**
 * Determinar si dos Colas con prioridad son idénticas.
 */
public class Ejercicio6B {

    public static void main(String[] args) {
        ColaPrioridadEstatica prioritizedQueue = Utils.createPrioritizedQueue(9);
        ColaPrioridadEstatica prioritizedQueue1 = Utils.createPrioritizedQueue(9);

        System.out.println("Cola 1:");
        prioritizedQueue.print();
        System.out.println("Cola 2:");
        prioritizedQueue1.print();

        System.out.println(areEquals(prioritizedQueue, prioritizedQueue1));

    }

    private static String areEquals(ColaPrioridadEstatica prioritizedQueue, ColaPrioridadEstatica prioritizedQueue1) {
        boolean result = true;
        if (prioritizedQueue.size() == prioritizedQueue1.size()) {
            int size = prioritizedQueue.size();
            for (int i = 0; i < size; i++) {
                if (prioritizedQueue.prioridad() != prioritizedQueue1.prioridad()
                        || prioritizedQueue.desacolar() != prioritizedQueue1.desacolar()) {
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
