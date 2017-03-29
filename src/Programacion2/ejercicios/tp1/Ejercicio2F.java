package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

//Calcular el promedio de los elementos de una Pila
public class Ejercicio2F {

    public static void main(String[] args) {
        Stack stack = new StackImpl();
        Utils.fillStack(stack, 5);

        System.out.println("Los valores de la pila son: ");
        stack.print();
        avg(stack, 0, stack.size());


    }

    private static void avg(Stack stack, float suma, float size) {
        if (!stack.isEmpty()) {
            suma += stack.pop();
            avg(stack, suma, size);
        }else {
            float avg = suma / size;
            System.out.println("\n\nY el promedio es: " + avg);
        }
    }
}
