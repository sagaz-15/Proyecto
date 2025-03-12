package pestanas;

public class ListasDobles {
    Nodo cabeza;
    Nodo cola;


    ListasDobles() {
        cabeza = new Nodo();
        cola = new Nodo();
        cabeza.inf = null;
        cola.inf = null;
        cabeza.siguiente = cola;
        cola.anterior = cabeza;
    }

    public void insertarPrimero(String inf) {
        Nodo nodo = new Nodo();
        nodo.inf = inf;
        Nodo siguiente = cabeza.siguiente;
        Nodo anterior = cabeza;
        nodo.anterior = anterior;
        nodo.siguiente = siguiente;
        anterior.siguiente = nodo;
        siguiente.anterior = nodo;
    }

    public void insertarUltimo(String inf) {
        Nodo nuevo = new Nodo();
        nuevo.inf = inf;
        Nodo anterior = cola.anterior;
        Nodo siguiente = cola;
        nuevo.anterior = anterior;
        nuevo.siguiente = siguiente;
        anterior.siguiente = nuevo;
        siguiente.anterior = nuevo;
    }


    public void eliminarPrimero() {
        if (cabeza.siguiente != cola) {
            Nodo nodoAEliminar = cabeza.siguiente;
            Nodo siguiente = nodoAEliminar.siguiente;
            cabeza.siguiente = siguiente;
            siguiente.anterior = cabeza;
            nodoAEliminar.siguiente = null;
            nodoAEliminar.anterior = null;
        }
    }


    public void eliminarUltimo() {
        if (cola.anterior != cabeza) {
            Nodo nodoAEliminar = cola.anterior;
            Nodo anterior = nodoAEliminar.anterior;
            cola.anterior = anterior;
            anterior.siguiente = cola;
            nodoAEliminar.siguiente = null;
            nodoAEliminar.anterior = null;
        }
    }
    public void eliminarNodo(String inf) {
        Nodo actual = cabeza.siguiente;
        while (actual != cola) {
            if (actual.inf.equals(inf)) {
                Nodo anterior = actual.anterior;
                Nodo siguiente = actual.siguiente;
                anterior.siguiente = siguiente;
                siguiente.anterior = anterior;
                actual.siguiente = null;
                actual.anterior = null;
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Nodo con valor " + inf + " no encontrado.");
    }


    public void mostrarLista() {
        Nodo actual = cabeza.siguiente;
        while (actual != cola) {
            System.out.println(actual.inf);
            actual = actual.siguiente;
        }
    }
}
