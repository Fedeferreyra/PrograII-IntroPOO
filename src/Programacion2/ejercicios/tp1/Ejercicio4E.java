package Programacion2.ejercicios.tp1;

import Programacion2.api.Queue;
import Programacion2.api.Stack;
import Programacion2.impl.QueueImpl;
import Programacion2.impl.StackImpl;

//Determinar si una Cola es capicúa o no.
public class Ejercicio4E {

    public static void main(String[] args) {
        Queue queue = new QueueImpl();
        queue.initialize();
        //Utils.fillQueue(queue, 9);
        queue.add(1);
        queue.add(2);
        //queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println("Los valores de la cola son:");
        queue.print();

        isCapicua(queue);
    }

    private static void isCapicua(Queue queue) {
        Stack stack = new StackImpl();
        stack.initialize();
        boolean flag = false;
        if(queue.size() % 2 != 0){
            flag = true;
        }
        for (int i = 0; i <= queue.size()/2; i++) {
            stack.push(queue.poll());
        }
        if(flag){
            queue.poll();
        }
        boolean isCapicua = true;
        for (int i = 0; i < stack.size(); i++) {
            if(stack.pop() != queue.poll()){
                isCapicua = false;
                System.out.println("\n\nNo es capicua");
                break;
            }
        }
        if (isCapicua){
            System.out.println("\n\nLa cola es capicua");
        }
    }
}
