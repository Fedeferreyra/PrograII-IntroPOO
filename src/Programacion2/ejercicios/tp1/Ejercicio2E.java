package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

//Sumar los elementos de una Pila
public class Ejercicio2E {

    public static void main(String[] args) {
        Stack stack = new StackImpl();
        stack.initialize();
        Utils.fillStack(stack, 5);

        System.out.println("Los valores de la pila son:");
        Utils.printStaticStack(stack);
        int suma = sumar(stack, 0);
        System.out.println("Los valores sumados de la pila son: " + suma);

    }

    public static int sumar(Stack stack, int suma) {
        suma = suma + stack.peek();
        stack.pop();
        return stack.isEmpty() ?  suma : sumar(stack, suma);
    }
}
