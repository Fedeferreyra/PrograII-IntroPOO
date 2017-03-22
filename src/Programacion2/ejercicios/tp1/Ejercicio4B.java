package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.api.Stack;
import Programacion2.impl.QueueImpl;
import Programacion2.impl.StackImpl;

/**
 * Created by Federico on 21/03/2017.
 */
public class Ejercicio4B {

    public static void main(String[] args) {
        Queue sourceQueue = new QueueImpl();
        Stack stack = new StackImpl();
        Queue destinyQueue = new QueueImpl();
        Utils.fillQueue(sourceQueue, 5);
        invertQueue(sourceQueue, stack, destinyQueue);
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