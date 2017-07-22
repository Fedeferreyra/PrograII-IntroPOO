package Programacion2.ejercicios.tp3;

import Programacion2.api.ColaPrioridad;
import Programacion2.api.DiccionarioMultiple;
import Programacion2.impl.DiccionarioMulti;

/**
 * Created by mariano on 21/07/17.
 */
public class EJ4 {

    public DiccionarioMultiple diccionarioDePrioridades(ColaPrioridad c) {
        DiccionarioMultiple diccionario = new DiccionarioMulti();
        diccionario.inicializarDiccionario();
        while (!c.colaVacia()) {
            diccionario.agregar(c.prioridad(), c.primero());
            c.desacolar();
        }
        return diccionario;
    }

}
