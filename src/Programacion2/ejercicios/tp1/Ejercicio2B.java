package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Stack;
import Programacion2.impl.StackImpl;

/**
 * Created by Federico on 21/03/2017.
 */
public class Ejercicio2B {

    public static void main(String[] args) {
        StackImpl sourceStack = new StackImpl();
        StackImpl destinyStack = new StackImpl();

        Utils.fillStack(sourceStack, 5);

        copyStack(sourceStack, destinyStack);
    }

    private static void copyStack(Stack sourceStack, Stack destinyStack){
        if (!sourceStack.isEmpty()){
            destinyStack.push(sourceStack.pop());
            copyStack(sourceStack, destinyStack);
        }
    }
}
