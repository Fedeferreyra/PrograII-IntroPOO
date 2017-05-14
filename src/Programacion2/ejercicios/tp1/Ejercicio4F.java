package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.impl.QueueImpl;

//Determinar si la Cola C1 es la inversa de la Cola C2.
public class Ejercicio4F {

    public static void main(String[] args) {
        Queue queue = new QueueImpl();
        queue.initialize();
        Queue queue1 = new QueueImpl();
        queue.initialize();
        Utils.fillQueue(queue, 7);
        System.out.println("Los valores de la cola C1 son: ");
        queue.print();
        System.out.println();
        Utils.fillQueue(queue1, 7);
        System.out.println("Los valores de la cola C2 son: ");
        queue1.print();
        System.out.println();


    }
}
