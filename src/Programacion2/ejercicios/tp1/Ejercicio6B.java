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

    private static boolean areEquals(ColaPrioridadEstatica cola1, ColaPrioridadEstatica cola2) {
        while ((!cola1.colaVacia() && cola2.colaVacia()) &&
                (cola1.primero() == cola2.primero()) &&
                (cola1.prioridad() == cola2.prioridad())
                ) {
            cola1.desacolar();
            cola2.desacolar();
        }
        return cola2.colaVacia() && cola1.colaVacia();
    }

}