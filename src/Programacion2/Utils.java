package Programacion2;

import Programacion2.api.Queue;
import Programacion2.api.Stack;
import Programacion2.impl.PrioritizedQueueImpl;
import Programacion2.impl.StackImpl;

import java.util.Random;

public class Utils {

    public static void fillStack(Stack stack, int qty) {
        for (int i = 0; i < qty; i++) {
            stack.push(new Random().nextInt(100));
        }
    }

    public static void fillQueue(Queue queue, int qty){
        for (int i = 0; i < qty; i++) {
            queue.add(new Random().nextInt(100));
        }
    }

    public static PrioritizedQueueImpl createPrioritizedQueue(int qty) {
        PrioritizedQueueImpl queue = new PrioritizedQueueImpl();
        queue.initialize();
        for (int i = 0; i < qty; i++) {
            queue.add(new Random().nextInt(100), new Random().nextInt(10));
        }
        return queue;
    }

    public static void printStaticStack(Stack stack ) {
        StackImpl sToPrint = (StackImpl) stack;
        sToPrint.print();
    }
}
