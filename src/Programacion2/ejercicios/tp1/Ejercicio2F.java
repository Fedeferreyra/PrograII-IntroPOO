package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

//Calcular el promedio de los elementos de una Pila
public class Ejercicio2F {

    public static void main(String[] args) {
        Stack stack = new StackImpl();
        stack.initialize();
        Utils.fillStack(stack, 5);

        System.out.println("Los valores de la pila son: ");
        Utils.printStaticStack(stack);
        float avg = avg(stack, 0, 0);
        System.out.println("Los valores de la pila son: " + avg);
    }

    private static float avg(Stack stack, float suma, float counter) {
        if (!stack.isEmpty()) {
            suma += stack.peek();
            stack.pop();
            return avg(stack, suma, ++counter);
        } else {
            return counter > 0 ? suma/counter : 0;
        }
    }
}
