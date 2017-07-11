package Programacion2.ejercicios.tp2;


import Programacion2.impl.DynamicPila;
import Programacion2.Utils;


public class testDynamic {

        public static void main(String[] args) {
            DynamicPila stack = new DynamicPila();
            stack.inicializar();
            Utils.fillStack(stack, 10);
            stack.print();
            System.out.println("size: " + stack.size());
        }

}
