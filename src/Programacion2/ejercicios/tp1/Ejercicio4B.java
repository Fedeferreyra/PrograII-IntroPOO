package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.api.Stack;
import Programacion2.impl.QueueImpl;
import Programacion2.impl.StackImpl;

//Invertir el contenido de una Cola (pueden usarse Pilas auxiliares)
public class Ejercicio4B {

    public static void main(String[] args) {
        Queue sourceQueue = new QueueImpl();
        Stack stack = new StackImpl();
        stack.initialize();
        Queue destinyQueue = new QueueImpl();
        destinyQueue.initialize();
        Utils.fillQueue(sourceQueue, 5);

        System.out.println("Los valores de la cola al principio del proceso son: ");
        sourceQueue.print();

        invertQueue(sourceQueue, stack, destinyQueue);

        System.out.println("\n\nLos valores de la cola al final del proceso son: ");
        destinyQueue.print();
    }

    private static void invertQueue(Queue sourceQueue, Stack stack, Queue destinyQueue){
        if (!sourceQueue.isEmpty()){
            stack.push(sourceQueue.poll());
            invertQueue(sourceQueue, stack, destinyQueue);
        }else if(!stack.isEmpty()){
            destinyQueue.add(stack.pop());
            invertQueue(sourceQueue, stack, destinyQueue);
        }
    }
}