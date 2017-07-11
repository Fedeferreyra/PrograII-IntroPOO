package Programacion2.ejercicios.tp1;


import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.impl.ColaEstatica;

//Invertir el contenido de una Cola (NO pueden usarse Pilas auxiliares)
public class Ejercicio4C {

    public static void main(String[] args) {
        Cola cola = new ColaEstatica();
        cola.inicializar();
        Utils.fillQueue(cola, 5);
        System.out.println("Los valores de la cola al principio del proceso son: ");
        Utils.printStaticQueue(cola);

        invertQueue(cola);

        System.out.println("\n\nLos valores de la cola al final del proceso son: ");
        Utils.printStaticQueue(cola);
    }

    private static void invertQueue(Cola cola){
        int value = cola.primero();
        cola.desacolar();
        if (!cola.colaVacia()){
            invertQueue(cola);
        }
        cola.acolar(value);
    }
}
