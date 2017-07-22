package Programacion2.ejercicios.tp3;

import Programacion2.api.Conjunto;
import Programacion2.api.DiccionarioMultiple;
import Programacion2.api.DiccionarioSimple;
import Programacion2.impl.DiccionarioMulti;

public class EJ5 {

    public DiccionarioMultiple clavesYElementos(DiccionarioMultiple d1, DiccionarioMultiple d2) {
        DiccionarioMultiple resultado = new DiccionarioMulti();
        resultado.inicializarDiccionario();
        Conjunto clavesD1 = d1.claves();
        while(!clavesD1.conjuntoVacio()) {
            int clave = clavesD1.elegir();
            Conjunto valores = d1.recuperar(clave);
            while(!valores.conjuntoVacio()) {
                int valor = valores.elegir();
                resultado.agregar(clave, valor);
                valores.sacar(valor);
            }
            clavesD1.sacar(clave);
        }
        Conjunto clavesD2 = d1.claves();
        while(!clavesD2.conjuntoVacio()) {
            int clave = clavesD2.elegir();
            Conjunto valores2 = d1.recuperar(clave);
            while(!valores2.conjuntoVacio()) {
                int valor = valores2.elegir();
                Conjunto valoresResultado = resultado.recuperar(clave);
                // Los valores no se pueden repetir en Dicc multiple.
                if(valoresResultado.conjuntoVacio() ||!valoresResultado.pertenece(valor)) {
                    resultado.agregar(clave, valor);
                }
                valores2.sacar(valor);
            }
            clavesD2.sacar(clave);
        }
        return resultado;
    }


    public DiccionarioMultiple clavesYElementosQueCoinciden(DiccionarioMultiple d1, DiccionarioMultiple d2) {
        DiccionarioMultiple resultado = new DiccionarioMulti();
        resultado.inicializarDiccionario();
        Conjunto clavesD1 = d1.claves();
        Conjunto clavesD2 = d2.claves();
        while (!clavesD1.conjuntoVacio()) {
            int clave = clavesD1.elegir();
            if (clavesD2.pertenece(clave)) {
                Conjunto valoresD1Clave = d1.recuperar(clave);
                Conjunto valoresD2Clave = d2.recuperar(clave);
                while (!valoresD1Clave.conjuntoVacio()) {
                    int valor = valoresD1Clave.elegir();
                    if (valoresD2Clave.pertenece(valor)) {
                        resultado.agregar(clave, valor);
                    }
                    valoresD1Clave.sacar(valor);
                }
            }
            clavesD1.sacar(clave);
        }
        return resultado;
    }


    public DiccionarioMultiple clavesQueCoinciden(DiccionarioMultiple d1, DiccionarioMultiple d2) {
        DiccionarioMultiple resultado = new DiccionarioMulti();
        resultado.inicializarDiccionario();
        Conjunto clavesD1 = d1.claves();
        Conjunto clavesD2 = d2.claves();
        while (!clavesD1.conjuntoVacio()) {
            int clave = clavesD1.elegir();
            if (clavesD2.pertenece(clave)) {
                Conjunto valoresD1Clave = d1.recuperar(clave);
                Conjunto valoresD2Clave = d2.recuperar(clave);
                // Agregar los valores con las claves que son iguales
                agregarClaveValor(resultado, valoresD1Clave, clave);
                agregarClaveValor(resultado, valoresD2Clave, clave);
            }
            clavesD1.sacar(clave);
        }
        return resultado;
    }


    private void agregarClaveValor(DiccionarioMultiple resultado, Conjunto valoresOrigen, int clave) {
        while (!valoresOrigen.conjuntoVacio()) {
            int valor = valoresOrigen.elegir();
            Conjunto clavesResultado = resultado.claves();
            // Los valores en las claves no se pueden repetir en DiccMultiple
            if (clavesResultado.conjuntoVacio() || !clavesResultado.pertenece(clave)) {
                resultado.agregar(clave, valor);
            } else {
                // Si la clave ya existe, hay que ver si el valor existe para ver si el valor es repetido.
                Conjunto elementosDeClaveEnFinal = resultado.recuperar(clave);
                if (elementosDeClaveEnFinal.conjuntoVacio() || !elementosDeClaveEnFinal.pertenece(valor)) {
                    resultado.agregar(clave, valor);
                }
            }
            valoresOrigen.sacar(valor);
        }
    }


    public DiccionarioMultiple clavesQueCoincidenYValoresQueCoinciden(DiccionarioMultiple d1, DiccionarioMultiple d2) {
        DiccionarioMultiple resultado = new DiccionarioMulti();
        resultado.inicializarDiccionario();
        Conjunto clavesD1 = d1.claves();
        Conjunto clavesD2 = d2.claves();
        while (!clavesD1.conjuntoVacio()) {
            int clave = clavesD1.elegir();
            if (clavesD2.pertenece(clave)) {
                Conjunto valoresD1Clave = d1.recuperar(clave);
                Conjunto valoresD2Clave = d2.recuperar(clave);
                while (!valoresD1Clave.conjuntoVacio()) {
                    int valor = valoresD1Clave.elegir();
                    if(valoresD2Clave.pertenece(valor)) {
                        resultado.agregar(clave, valor);
                    }
                    valoresD1Clave.sacar(valor);
                }
            }
            clavesD1.sacar(clave);
        }
        return resultado;
    }

    public DiccionarioMultiple diccionarioSinonimos (DiccionarioSimple diccionarioSimple) {
        DiccionarioMultiple diccionarioMultiple = new DiccionarioMulti();
        diccionarioMultiple.inicializarDiccionario();
        Conjunto palabras = diccionarioSimple.claves();
        while(!palabras.conjuntoVacio()) {
            int palabra = palabras.elegir();
            diccionarioMultiple.agregar(diccionarioSimple.recuperar(palabra), palabra);
            palabras.sacar(palabra);
        }
        return diccionarioMultiple;
    }
}

