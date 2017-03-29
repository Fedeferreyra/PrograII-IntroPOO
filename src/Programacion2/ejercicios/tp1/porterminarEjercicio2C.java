package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

//Invertir el contenido de una Pila.
public class porterminarEjercicio2C {

    public static void main(String[] args) {
        Stack stack = new StackImpl();
        Utils.fillStack(stack, 5);

        System.out.println("Los valores de la pila al principio del proceso son:");
        stack.print();

        invertStack(stack, 0, stack.size());

        System.out.println("\n\nLos valores de la pila al final del proceson son:");
        stack.print();
    }

    private static void invertStack(Stack stack, int index, int stackOriginalSize){
        if (index < stackOriginalSize) {
            index++;
            int pop = stack.pop();
            invertStack(stack, index, stackOriginalSize);
            stack.push(pop);
        }

    }
}
