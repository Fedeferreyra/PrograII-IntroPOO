package Programacion2;

import Programacion2.api.Queue;
import Programacion2.api.Stack;

public class Utils {

    public static void fillStack(Stack stack, int qty) {
        for (int i = 0; i < qty; i++) {
            stack.push(i + 1);
        }
    }

    public static void fillQueue(Queue queue, int qty){
        for (int i = 0; i < qty; i++) {
            queue.add(i+1);
        }
    }
}
