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

    private static ColaPrioridadEstatica combinarColas(ColaPrioridadEstatica cola1, ColaPrioridadEstatica cola2) {
        ColaPrioridadEstatica colaCombinada = new ColaPrioridadEstatica();
        colaCombinada.inicializar();
        while (!cola1.colaVacia()) {
            colaCombinada.acolarPrioridad(cola1.primero(), cola1.prioridad());
            cola1.desacolar();
        }
        while(!cola2.colaVacia()){
            colaCombinada.acolarPrioridad(cola2.primero(), cola2.prioridad());
            cola2.desacolar();
        }
        return colaCombinada;
    }
}
