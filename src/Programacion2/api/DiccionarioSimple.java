package Programacion2.api;


public interface DiccionarioSimple {
        void inicializarDiccionario ();
        void agregar(int clave , int valor);
        void eliminar(int clave);
        int recuperar(int clave);
        Conjunto claves();
}