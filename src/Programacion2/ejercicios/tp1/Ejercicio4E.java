package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.api.Pila;
import Programacion2.impl.ColaDinamica;
import Programacion2.impl.ColaEstatica;
import Programacion2.impl.PilaDinamica;

//Determinar si una Cola es capicúa o no.
public class Ejercicio4E {

    public static void main(String[] args) {
        Cola cola = new ColaEstatica();
        cola.inicializar();
        //Utils.fillQueue(cola, 9);
        cola.acolar(1);
        cola.acolar(2);
        //cola.acolar(3);
        cola.acolar(2);
        cola.acolar(1);
        System.out.println("Los valores de la cola son:");
        Utils.printStaticQueue(cola);

        isCapicua(cola);
    }

    private static boolean isCapicua(Cola origen) {
        Cola colaAux = new ColaDinamica();
        Pila pilaAux = new PilaDinamica();
        while (!origen.colaVacia()){
            colaAux.acolar(origen.primero());
            pilaAux.apilar(origen.primero());
            origen.desacolar();
        }
        while (!pilaAux.pilaVacia()
                && (pilaAux.tope() == colaAux.primero())){
            colaAux.desacolar();
            pilaAux.desapilar();
        }
        return pilaAux.pilaVacia();
    }
}
