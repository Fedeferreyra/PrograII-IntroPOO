package Programacion2.ejercicios.tp2;


import Programacion2.impl.DynamicStack;
import Programacion2.Utils;


public class testDynamic {

        public static void main(String[] args) {
            DynamicStack stack = new DynamicStack();
            stack.initialize();
            Utils.fillStack(stack, 10);
            stack.print();
            System.out.println("size: " + stack.size());
        }

}
