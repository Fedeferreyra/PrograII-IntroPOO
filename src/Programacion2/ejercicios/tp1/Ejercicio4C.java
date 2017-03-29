package Programacion2.ejercicios.tp1;


import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.impl.QueueImpl;

//Invertir el contenido de una Cola (NO pueden usarse Pilas auxiliares)
public class Ejercicio4C {

    public static void main(String[] args) {
        Queue queue = new QueueImpl();

        Utils.fillQueue(queue, 5);
        System.out.println("Los valores de la cola al principio del proceso son: ");
        queue.print();

        invertQueue(queue);

        System.out.println("\n\nLos valores de la cola al final del proceso son: ");
        queue.print();
    }

    private static void invertQueue(Queue queue){

        int value = queue.poll();
        if (!queue.isEmpty()){
            invertQueue(queue);
        }
        queue.add(value);
    }
}
