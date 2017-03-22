package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

public class Ejercicio2F {

    public static void main(String[] args) {
        Stack stack = new StackImpl();
        Utils.fillStack(stack, 5);
        avg(stack);

    }

    private static void avg(Stack stack){
        float suma = 0;
        float size = stack.size();
        while (!stack.isEmpty()){
            suma += stack.pop();
        }
        float avg = suma/size;
        System.out.println("El promedio es. " + avg);
    }
}
