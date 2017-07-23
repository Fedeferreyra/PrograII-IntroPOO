package Programacion2.impl;

import Programacion2.api.Conjunto;
import Programacion2.api.DiccionarioSimple;

class DiccionarioSimpleEstatico implements DiccionarioSimple {
    class Elemento {
        int clave;
        int valor;
    }

    Elemento[] elementos;
    int cant;
    public void inicializarDiccionario() {
        elementos = new Elemento[100];
        cant = 0;
    }
    public void agregar(int clave, int valor) {
        int pos = clave2Indice(clave);
        if (pos == -1) {
            pos = cant;
            elementos[pos] = new Elemento();
            elementos[pos].clave = clave;
            cant++;
        }
        elementos[pos].valor = valor;
    }
    private int clave2Indice(int clave) {
        int i;
        for(i = cant - 1 ; i >= 0 && elementos[i].clave != clave ; i--);
        return i;
    }
    public void eliminar(int clave) {
        int pos = clave2Indice(clave);
        if(pos != -1) {elementos[pos] = elementos[cant - 1];
            cant--;
        }
    }

    public int recuperar(int clave) {
        int pos = clave2Indice(clave);
        return elementos[pos].valor;
    }

    public Conjunto claves() {
        Conjunto c = new ConjuntoEstatico();
        c.inicializarConjunto();
        for (int i = 0 ; i < cant ; i++)
            c.agregar(elementos[i].clave);
        return c;
    }
}