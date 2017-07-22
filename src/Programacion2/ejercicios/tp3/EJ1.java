package Programacion2.ejercicios.tp3;

import Programacion2.api.Cola;
import Programacion2.api.Conjunto;
import Programacion2.api.Pila;
import Programacion2.impl.ColaDinamica;
import Programacion2.impl.ConjuntoDinamico;
import Programacion2.impl.PilaDinamica;
import com.sun.corba.se.impl.interceptors.PICurrent;

import java.util.WeakHashMap;

/**
 * Comprobar si una Pila P es capicúa
 */
public class EJ1 {

    private static boolean capicua(Pila p) {
        Pila pilaAux = new PilaDinamica();
        pilaAux.inicializar();
        Cola colaAux = new ColaDinamica();
        colaAux.inicializar();

        while (!p.pilaVacia()) {
            pilaAux.apilar(p.tope());
            colaAux.acolar(p.tope());
            p.desapilar();
        }
        while ((!pilaAux.pilaVacia() && !colaAux.colaVacia()) &&
                (pilaAux.tope() == colaAux.primero())) {
            pilaAux.desapilar();
            colaAux.desacolar();
        }
        return pilaAux.pilaVacia() && colaAux.colaVacia();
    }

    public Pila eliminarRepetidos(Pila p) {
        Pila pilaAux = new PilaDinamica();
        pilaAux.inicializar();
        Conjunto conjuntoAux = new ConjuntoDinamico();
        conjuntoAux.inicializarConjunto();
        while (!p.pilaVacia()) {
            if (!conjuntoAux.pertenece(p.tope())) {
                pilaAux.apilar(p.tope());
                conjuntoAux.agregar(p.tope());
            }
            p.desapilar();
        }
        while (!pilaAux.pilaVacia()) {
            p.apilar(pilaAux.tope());
            pilaAux.desapilar();
        }
        return p;
    }

    public Conjunto conjuntoDeRepetidos(Pila p) {
        Conjunto conjuntoRepetidos = new ConjuntoDinamico();
        Conjunto conjuntoUnicos = new ConjuntoDinamico();
        conjuntoRepetidos.inicializarConjunto();
        conjuntoUnicos.inicializarConjunto();
        while(!p.pilaVacia()) {
            if (conjuntoUnicos.pertenece(p.tope())) {
                conjuntoRepetidos.agregar(p.tope());
            } else {
                conjuntoUnicos.agregar(p.tope());
            }
            p.desapilar();
        }
        return conjuntoRepetidos;
    }

    public void splitPila(Pila p) {
        Cola colaAux = new ColaDinamica();
        Pila m1 = new PilaDinamica();
        Pila m2 = new PilaDinamica();
        m1.inicializar();
        m2.inicializar();
        colaAux.inicializar();

        int contador = 0;
        while(!p.pilaVacia()) {
            colaAux.acolar(p.tope());
            contador++;
            p.desapilar();
        }
        for(int i = 0; i < contador; i++) {
            if(i < contador/2) {
                m1.apilar(colaAux.primero());
            } else {
                m2.apilar(colaAux.primero());
            }
            colaAux.desacolar();
        }
    }

}
