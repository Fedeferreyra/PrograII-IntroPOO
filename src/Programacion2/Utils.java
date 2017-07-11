package Programacion2;

import Programacion2.api.Cola;
import Programacion2.api.Pila;
import Programacion2.impl.PilaEstatica;
import Programacion2.impl.ColaPrioridadEstatica;

import java.util.Random;

public class Utils {

    public static void fillStack(Pila pila, int qty) {
        for (int i = 0; i < qty; i++) {
            pila.apilar(new Random().nextInt(100));
        }
    }

    public static void fillQueue(Cola cola, int qty){
        for (int i = 0; i < qty; i++) {
            cola.acolar(new Random().nextInt(100));
        }
    }

    public static ColaPrioridadEstatica createPrioritizedQueue(int qty) {
        ColaPrioridadEstatica queue = new ColaPrioridadEstatica();
        queue.inicializar();
        for (int i = 0; i < qty; i++) {
            queue.acolarPrioridad(new Random().nextInt(100), new Random().nextInt(10));
        }
        return queue;
    }

    public static void printStaticStack(Pila pila) {
        PilaEstatica sToPrint = (PilaEstatica) pila;
        sToPrint.print();
    }

    public static void printStaticQueue(Cola cola) {
        Cola aux = cola;
        while (!aux.colaVacia()) {
            System.out.println(aux.primero());
            aux.desacolar();
        }
    }
}
