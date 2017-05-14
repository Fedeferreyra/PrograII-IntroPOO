package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.impl.QueueImpl;

//Determinar si el final de la Cola C1 coincide o no con la Cola C2.
public class Ejercicio4D {

    public static void main(String[] args) {
        Queue queue = new QueueImpl();
        queue.initialize();
        Queue queue1 = new QueueImpl();
        queue.initialize();
        Utils.fillQueue(queue, 6);
        Utils.fillQueue(queue1, 8);
        System.out.println("Los valores de una cola son: ");
        queue.print();
        System.out.println("\n\nLos valores de la otra cola son: ");
        queue1.print();

        compareLastElements(queue, queue1);
    }

    private static void compareLastElements(Queue queue, Queue queue1) {
        int queueLastElement = 0, queue1LastElement = 0;
        while (!queue.isEmpty()){
            queueLastElement = queue.poll();
        }
        while (!queue1.isEmpty()){
            queue1LastElement = queue1.poll();
        }
        if(queue1LastElement == queueLastElement){
            System.out.println("\n\nLos valores del final de las dos colas coinciden");
        }else {
            System.out.println("\n\nLos valores del final no coinciden");
        }
    }
}
