package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

//Invertir el contenido de una Pila.
public class Ejercicio2C {

    public static void main(String[] args) {
        Stack stack = new StackImpl();
        stack.initialize();
        Utils.fillStack(stack, 5);

        System.out.println("Los valores de la pila al principio del proceso son:");
        Utils.printStaticStack(stack);

         invertStack(stack);

        System.out.println("\n\nLos valores de la pila al final del proceson son:");
        Utils.printStaticStack(stack);
    }

    private static void invertStack(Stack stack) {
        int peek = stack.peek();
        stack.pop();
        if (!stack.isEmpty()) {
            invertStack(stack);
        }
        stack.push(peek);
    }
}
