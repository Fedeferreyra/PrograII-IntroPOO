package Programacion2.ejercicios.tp4;

import Programacion2.api.ABBTDA;
import Programacion2.api.Conjunto;
import Programacion2.impl.ABB;
import Programacion2.impl.ConjuntoDinamico;

public class tp4 {

    static boolean rta = true;

    public static void main(String[] args) {

        ABBTDA arbol = new ABB();
        arbol.inicializarAbb();

        arbol.agregarElem(8);
        arbol.agregarElem(6);
        arbol.agregarElem(10);
        arbol.agregarElem(9);
        arbol.agregarElem(12);
        arbol.agregarElem(2);

        ABBTDA arbol2 = new ABB();
        arbol2.inicializarAbb();

        arbol2.agregarElem(8);
        arbol2.agregarElem(6);
        arbol2.agregarElem(10);
        arbol2.agregarElem(9);
        arbol2.agregarElem(12);
        arbol2.agregarElem(2);

        //Ejercicio 3A:
        System.out.println("Respuesta 3) a): " + estaElemento(5, arbol));

        //Ejercicio 3B
        System.out.println("Respuesta 3) b): " + esHoja(8, arbol));

        //Ejercicio 3C
        System.out.println("Respuesta 3) c): " + calcularProfundidad(9, arbol));

        //Ejercicio 3D
        System.out.println("Respuesta 3) d): " + menorElemento(arbol));

        //Ejercicio 3E
        System.out.println("Respuesta 3) e): " + cantidadElementos(arbol));

        //Ejercicio 3F
        System.out.println("Respuesta 3) f): " + sumaElementos(arbol));

        //Ejercicio 3G
        System.out.println("Respuesta 3) g): " + cantidadHojas(arbol));

        //Ejercicio 3H
        System.out.println("Respuesta 3) h): " + alturaArbol(arbol));

        //Ejercicio 3I
        System.out.print("Respuesta 3) i): ");
        arbolesMismaForma(arbol, arbol2);
        System.out.println(rta);

        //Ejercicio 3J
        System.out.print("Respuesta 3) j): ");
        arbolesIguales(arbol, arbol2);
        System.out.println(rta);

        //Ejercicio 3K
        System.out.println("Respuesta 3) k): " + contarEnNivel(arbol, 0, 2));

        //Ejercicio 3L
        System.out.println("Respuesta 3) l): ");
        mostrarElementos(arbol);

        //Ejercicio 3M
        System.out.println("Respuesta 3) m): ");
        Conjunto c = new ConjuntoDinamico();
        c.inicializarConjunto();
        c = conjuntoMayores(7, arbol);

        while(!c.conjuntoVacio())
        {
            int x = c.elegir();
            System.out.println("  " + x);
            c.sacar(x);
        }

        //Ejercicio 3N
        System.out.println("Respuesta 3) n): " + anterior(12, 0, arbol));

    }

    public static boolean estaElemento(int x, ABBTDA arbol)  {
    /* a) Dado un elemento, determinar si está o no en un ABB.  */
        if (arbol.arbolVacio())  {
            return false;
        }
        else if (arbol.raiz()==x)  {
            return true;
        }
        else if (arbol.raiz() < x)  {
            return estaElemento(x, arbol.hijoDer());
        }
        else  {
            return estaElemento(x, arbol.hijoIzq());
        }
    }

    public static boolean esHoja (int x, ABBTDA arbol)  {
         if (arbol.arbolVacio())  {
            return false;
        }  else if (arbol.raiz() == x && arbol.hijoDer().arbolVacio() && arbol.hijoIzq().arbolVacio()) {
            return true;
        }  else if (arbol.raiz() > x)  {
            return esHoja(x, arbol.hijoIzq());
        }  else  {
            return esHoja(x, arbol.hijoDer());
        }
    }

    public static int calcularProfundidad (int x, ABBTDA arbol)  {
    /*c) Dado un elemento, calcular su profundidad en el ABB. */
        if (arbol.arbolVacio())  {
            return 0;
        }
        else if(arbol.raiz() == x)  {
            return 0;
        }
        else if (arbol.raiz() > x)  {
            return 1 + calcularProfundidad(x, arbol.hijoIzq());
        } else {
            return 1 + calcularProfundidad(x, arbol.hijoDer());
        }
    }

    public static int menorElemento(ABBTDA arbol)  {
    /*d) Obtener el valor del menor elemento de un ABB. */
        if (arbol.arbolVacio())  {
            return 0;
        }
        else if(arbol.hijoIzq().arbolVacio())  {
            return arbol.raiz();
        }
        else  {
            return menorElemento(arbol.hijoIzq());
        }
    }

    public static int cantidadElementos (ABBTDA arbol)  {
    /*e) Calcular la cantidad de elementos que contiene un ABB. */
        if (arbol.arbolVacio())  {
            return 0;
        }
        else {
            return 1 + cantidadElementos(arbol.hijoIzq()) + cantidadElementos(arbol.hijoDer());
        }

    }

    public static int sumaElementos (ABBTDA arbol)  {
        if (arbol.arbolVacio())  {
            return 0;
        } else  {
            return arbol.raiz() + sumaElementos(arbol.hijoIzq()) + sumaElementos(arbol.hijoDer());
        }
    }

    public static int cantidadHojas (ABBTDA arbol)  {
        if (!arbol.arbolVacio())  {
            int esHoja = 0;
            if (arbol.hijoDer().arbolVacio() && arbol.hijoIzq().arbolVacio())
                esHoja = 1;
            return esHoja + cantidadHojas(arbol.hijoIzq()) + cantidadHojas(arbol.hijoDer());
        }
        return 0;
    }

    public static int alturaHijoIzq(ABBTDA a)  {
        if (a.arbolVacio())  {
            return 0;
        } else {
            return (1 + alturaHijoIzq(a.hijoIzq()));
        }
    }

    public static int alturaHijoDer(ABBTDA a)  {
        if (a.arbolVacio())  {
            return 0;
        }  else  {
            return (1 + alturaHijoDer(a.hijoDer()));
        }
    }

    public static int alturaArbol(ABBTDA a)  {
        if (!a.arbolVacio())  {
            int i = alturaHijoIzq(a.hijoIzq());
            int d = alturaHijoDer(a.hijoDer());
            if(i > d)
                return i;
            else
                return d;
        }
        return 0;
    }

    public static void arbolesMismaForma (ABBTDA a1, ABBTDA a2)  {
    /* i) Comprobar si dos ABBs tienen la misma forma. */
        if (!a1.arbolVacio() && !a2.arbolVacio())  {
            arbolesMismaForma(a1.hijoIzq(), a2.hijoIzq());
            arbolesMismaForma(a1.hijoDer(), a2.hijoDer());
        } else if ( (a1.arbolVacio() && !a2.arbolVacio()) || (!a1.arbolVacio() && a2.arbolVacio())) {
            rta = false;
        }
    }

    public static void arbolesIguales (ABBTDA a1, ABBTDA a2)  {
        if (!a1.arbolVacio() && !a2.arbolVacio())  {
            arbolesIguales(a1.hijoIzq(), a2.hijoIzq());
            arbolesIguales(a1.hijoDer(), a2.hijoDer());
            if (a1.raiz() != a2.raiz())
                rta = false;
        }
    }

    public static int contarEnNivel (ABBTDA arbol, int n, int nivel) {
        if (arbol.arbolVacio())  {
            return 0;
        } if (n == nivel)  {
            n = n +1;
            System.out.println("n: " + n);
            return 1 + contarEnNivel(arbol.hijoIzq(), n, nivel) + contarEnNivel(arbol.hijoDer(), n, nivel);
        }  else  {
            n = n +1;
            System.out.println("n: " + n);
            return 0 + contarEnNivel(arbol.hijoIzq(), n, nivel) + contarEnNivel(arbol.hijoDer(), n, nivel);
        }
    }

    public static void mostrarElementos (ABBTDA arbol) {
        System.out.println("i. In-orden:");
        inOrden(arbol);

        System.out.println("ii. Pre-orden:");
        preOrden(arbol);

        System.out.println("iii. Post-orden:");
        postOrden(arbol);
    }

    public static void inOrden (ABBTDA arbol)  {
        if(!arbol.arbolVacio())  {
            preOrden(arbol.hijoIzq());
            System.out.println(arbol.raiz());
            preOrden(arbol.hijoDer());
        }
    }

    public static void preOrden (ABBTDA arbol)  {
        if(!arbol.arbolVacio())  {
            System.out.println(arbol.raiz());
            preOrden(arbol.hijoIzq());
            preOrden(arbol.hijoDer());
        }
    }

    public static void postOrden (ABBTDA arbol)  {
        if(!arbol.arbolVacio())  {
            postOrden(arbol.hijoIzq());
            postOrden(arbol.hijoDer());
            System.out.println(arbol.raiz());
        }
    }

    public static Conjunto conjuntoMayores (int k, ABBTDA arbol)  {
        Conjunto c = new ConjuntoDinamico();
        c.inicializarConjunto();

        if(!arbol.arbolVacio())  {
            if(arbol.raiz() > k)
                c.agregar(arbol.raiz());
            Conjunto cI = conjuntoMayores(k, arbol.hijoIzq());
            Conjunto cD = conjuntoMayores(k, arbol.hijoDer());
            while(!cI.conjuntoVacio())  {
                int x = cI.elegir();
                c.agregar(x);
                cI.sacar(x);
            }
            while(!cD.conjuntoVacio())  {
                int x = cD.elegir();
                c.agregar(x);
                cD.sacar(x);
            }
        }
        return c;
    }

    public static int anterior (int v, int a, ABBTDA arbol)  {
        if (arbol.arbolVacio())  {
            return 0;
        }  else if(arbol.raiz() == v && !arbol.hijoIzq().arbolVacio())  {
            return arbol.hijoIzq().raiz();
        }  else if (arbol.raiz() == v && arbol.hijoIzq().arbolVacio()) {
            return a;
        } else if (arbol.raiz() > v) {
            return anterior(v, a, arbol.hijoIzq());
        } else {
            return anterior(v, arbol.raiz(), arbol.hijoDer());
        }
    }

}
