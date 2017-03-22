package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

public class Ejercicio2E {

    public static void main(String[] args) {
        Stack stack = new StackImpl();
        Utils.fillStack(stack, 5);
        sumar(stack, 0);
    }

    public static void sumar(Stack stack, int suma) {
        if (!stack.isEmpty()) {
            suma += stack.pop();
            sumar(stack, suma);
        }else {
            System.out.println(suma);
        }
    }
}
