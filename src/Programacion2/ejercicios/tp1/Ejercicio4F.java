package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.api.Pila;
import Programacion2.impl.ColaEstatica;
import Programacion2.impl.PilaDinamica;

//Determinar si la Cola C1 es la inversa de la Cola C2.
public class Ejercicio4F {

    public static void main(String[] args) {
        Cola cola = new ColaEstatica();
        cola.inicializar();
        Cola cola1 = new ColaEstatica();
        cola.inicializar();
        Utils.fillQueue(cola, 7);
        Utils.fillQueue(cola1, 7);
        boolean inversas = inversa(cola, cola1);
    }

    public static boolean inversa(Cola cola1, Cola cola2) {
        Pila pilaAux = new PilaDinamica();
        pilaAux.inicializar();
        while(!cola1.colaVacia()) {
            pilaAux.apilar(cola1.primero());
            cola1.desacolar();
        }

        while(!pilaAux.pilaVacia() && pilaAux.tope() == cola2.primero()) {
            pilaAux.desapilar();
            cola2.desacolar();
        }
        return pilaAux.pilaVacia() && cola2.colaVacia();
    }
}
