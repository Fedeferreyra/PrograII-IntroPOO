package Programacion2.ejercicios.tp1;


import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.impl.QueueImpl;

public class Ejercicio4C {

    public static void main(String[] args) {
        Queue queue = new QueueImpl();

        Utils.fillQueue(queue, 5);

        invertQueue(queue);
    }

    private static void invertQueue(Queue queue){

        int value = queue.poll();
        if (!queue.isEmpty()){
            invertQueue(queue);
        }
        queue.add(value);
    }
}
