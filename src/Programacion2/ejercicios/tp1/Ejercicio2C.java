package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Queue;
import Programacion2.api.Stack;
import Programacion2.impl.QueueImpl;
import Programacion2.impl.StackImpl;

public class Ejercicio2C {

    public static void main(String[] args) {
        Stack sourceStack = new StackImpl();
        StackImpl destinyStack = new StackImpl();
        Queue queue = new QueueImpl();

        Utils.fillStack(sourceStack, 5);

        invertStack(sourceStack, queue, destinyStack);
    }

    private static void invertStack(Stack sourceStack, Queue queue, Stack destinyStack){
        if (!sourceStack.isEmpty()){
            queue.add(sourceStack.pop());
            invertStack(sourceStack, queue, destinyStack);
        }else if(!queue.isEmpty()){
            destinyStack.push(queue.poll());
            invertStack(sourceStack, queue, destinyStack);
        }
    }
}
