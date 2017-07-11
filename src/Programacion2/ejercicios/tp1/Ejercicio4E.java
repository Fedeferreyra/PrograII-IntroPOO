package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.impl.ColaImpl;

//Determinar si una Cola es capicúa o no.
public class Ejercicio4E {

    public static void main(String[] args) {
        Cola cola = new ColaImpl();
        cola.initialize();
        //Utils.fillQueue(cola, 9);
        cola.add(1);
        cola.add(2);
        //cola.add(3);
        cola.add(2);
        cola.add(1);
        System.out.println("Los valores de la cola son:");
        Utils.printStaticQueue(cola);

        isCapicua(cola);
    }

    private static void isCapicua(Cola cola) {
        /*Pila stack = new PilaEstatica();
        stack.inicializar();
        boolean flag = false;
        if(cola.size() % 2 != 0){
            flag = true;
        }
        for (int i = 0; i <= cola.size()/2; i++) {
            stack.apilar(cola.tope());
            cola.poll();
        }
        if(flag){
            cola.poll();
        }
        boolean isCapicua = true;
        for (int i = 0; i < stack.size(); i++) {
            if(stack.tope() != cola.tope()){
                isCapicua = false;
                System.out.println("\n\nNo es capicua");
                break;
            }
        }
        if (isCapicua){
            System.out.println("\n\nLa cola es capicua");
        }*/
    }
}
