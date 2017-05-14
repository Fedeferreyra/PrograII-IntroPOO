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
        stack.print();
        sumar(stack, 0);
    }

    public static void sumar(Stack stack, int suma) {
        if (!stack.isEmpty()) {
            suma += stack.pop();
            sumar(stack, suma);
        }else {
            System.out.println("\n\nY la suma de esos valores da:");
            System.out.println(suma);
        }
    }
}
