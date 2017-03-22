package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

public class Ejercicio2A {

    public static void main(String[] args) {
        Stack sourceStack = new StackImpl();
        Stack destinyStack = new StackImpl();
        Utils.fillStack(sourceStack, 5);
        pasarAOtraPila(sourceStack, destinyStack);
    }

    private static void pasarAOtraPila(Stack sourceStack, Stack destinyStack) {
        if (!sourceStack.isEmpty()) {
            destinyStack.push(sourceStack.pop());
            pasarAOtraPila(sourceStack, destinyStack);
        }
    }

    private static void deStack(Stack stack) {
        System.out.println(stack.pop());
        if (!stack.isEmpty()) {
            deStack(stack);
        }
    }
}