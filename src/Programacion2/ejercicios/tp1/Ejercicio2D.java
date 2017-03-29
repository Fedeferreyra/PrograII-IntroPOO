package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

//Contar los elementos de una Pila
public class Ejercicio2D {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        Utils.fillStack(stack, 5);
        count(stack, 1);
    }

    private static void count(Stack stack, int counter) {
        if (!stack.isEmpty()){
            System.out.println(counter++);
            stack.pop();
            count(stack, counter);
        }
    }
}
