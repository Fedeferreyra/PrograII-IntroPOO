package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

//Pasar una Pila a otra (dejándola en orden inverso)
public class Ejercicio2A {

    public static void main(String[] args) {
        Stack sourceStack = new StackImpl();
        sourceStack.initialize();
        Stack destinyStack = new StackImpl();
        destinyStack.initialize();
        Utils.fillStack(sourceStack, 5);

        System.out.println("Los valores de la pila al principio del proceso son:");
        sourceStack.print();

        fromStackToStack(sourceStack, destinyStack);

        System.out.println("\n\nLos valores de la pila al final del proceso son:");
        destinyStack.print();
    }

    private static void fromStackToStack(Stack sourceStack, Stack destinyStack) {
        if (!sourceStack.isEmpty()) {
            destinyStack.push(sourceStack.pop());
            fromStackToStack(sourceStack, destinyStack);
        }
    }
}