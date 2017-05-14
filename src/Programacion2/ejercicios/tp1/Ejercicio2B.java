package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

//Copiar una Pila en otra (dejándola en el mismo orden que la original)
public class Ejercicio2B {

    public static void main(String[] args) {
        StackImpl sourceStack = new StackImpl();
        StackImpl destinyStack = new StackImpl();
        sourceStack.initialize();
        destinyStack.initialize();
        Utils.fillStack(sourceStack, 5);

        System.out.println("Los valores de la pila al principio del proceso son: ");
        sourceStack.print();

        copyStack(sourceStack, destinyStack);

        System.out.println("\n\nLos valores de la pila al final del proceson son:");
        destinyStack.print();

    }

    private static void copyStack(Stack sourceStack, Stack destinyStack) {
        // recursividad para llenar la pila en orden sin tener que usar una pila aux.
        if (!sourceStack.isEmpty()) {
            int pop = sourceStack.pop();
            copyStack(sourceStack, destinyStack);
            destinyStack.push(pop);
        }
    }
}
