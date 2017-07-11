package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.impl.ColaImpl;

//Determinar si el final de la Cola C1 coincide o no con la Cola C2.
public class Ejercicio4D {

    public static void main(String[] args) {
        Cola cola = new ColaImpl();
        cola.inicializar();
        Cola cola1 = new ColaImpl();
        cola.inicializar();
        Utils.fillQueue(cola, 6);
        Utils.fillQueue(cola1, 8);
        System.out.println("Los valores de una cola son: ");
        Utils.printStaticQueue(cola);
        System.out.println("\n\nLos valores de la otra cola son: ");
        Utils.printStaticQueue(cola);
        compareLastElements(cola, cola1);
    }

    private static void compareLastElements(Cola cola, Cola cola1) {
        int queueLastElement = 0, queue1LastElement = 0;
        while (!cola.colaVacia()){
            queueLastElement = cola.primero();
            cola.desacolar();
        }
        while (!cola1.colaVacia()){
            queue1LastElement = cola1.primero();
            cola1.desacolar();
        }
        if(queue1LastElement == queueLastElement){
            System.out.println("\n\nLos valores del final de las dos colas coinciden");
        }else {
            System.out.println("\n\nLos valores del final no coinciden");
        }
    }
}
