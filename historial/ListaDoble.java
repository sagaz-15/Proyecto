package historial;

import java.util.Objects;

public class ListaDoble<T> {
    protected Nodo<T> head;
    protected Nodo<T> tail;
    protected int cantidadNodos;

    public ListaDoble() {
        this.head = new Nodo<>();
        this.tail = new Nodo<>();
        head.setSig(tail);
        tail.setAnt(head);
    }

    //Add(T)
    public void add(T dato) {
        Nodo<T> nodo = new Nodo();
        Nodo<T> siguiente = head.getSig();
        nodo.setDato(dato);
        nodo.setSig(head.getSig());
        head.setSig(nodo);
        siguiente.setAnt(nodo);
        nodo.setAnt(head);
        cantidadNodos++;
    }
    // add (Int, E)

    public void addIndex(int indice, T dato) {
        Nodo<T> nodo = new Nodo();
        nodo.setDato(dato);
        Nodo<T> actual = head;
        Nodo<T> siguiente;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSig();
        }
        siguiente = actual.getSig();
        siguiente.setAnt(nodo);
        actual.setSig(nodo);
        nodo.setSig(siguiente);
        nodo.setAnt(actual);
        cantidadNodos++;
    }

    // addFirst
    public void addFirst(T dato) {
        Nodo<T> nodo = new Nodo();
        nodo.setDato(dato);
        Nodo<T> siguiete = head.getSig();
        Nodo<T> anterior = head;
        nodo.setSig(siguiete);
        nodo.setAnt(anterior);
        head.setSig(nodo);
        anterior.setAnt(nodo);
        cantidadNodos++;
    }

    // addlast
    public void addLast(T dato) {
        Nodo<T> nodo = new Nodo();
        nodo.setDato(dato);
        Nodo<T> siguiete = tail.getAnt();
        Nodo<T> anterior = tail;
        nodo.setAnt(siguiete);
        nodo.setSig(anterior);
        tail.setAnt(nodo);
        anterior.setSig(nodo);
        cantidadNodos++;
    }
    // Clear

    public void clear(T dato) {
        Nodo<T> nodo = tail;
        Nodo<T> aux = nodo.getAnt();
        for (int i = 0; i < cantidadNodos; i++) {
            nodo.setSig(null);
            nodo.setAnt(null);
            nodo.setDato(null);
            nodo = null;
            nodo = aux;
            aux = nodo.getAnt();
        }
        tail.setAnt(head);
        head.setSig(tail);
        cantidadNodos = 0;
    }

    //contains
    public boolean contains(T dato) {
        Nodo<T> nodo = head;
        for (int i = 0; i < cantidadNodos; i++) {
            nodo = nodo.getSig();
            if (Objects.equals(nodo.getDato(), dato)) {
                return true;
            }
        }
        return false;
    }

    // Element

    public T element() {
        return head.getSig().getDato();
    }

    // Get Int
    public T get(int index) {
        if (index < 0 || index >= cantidadNodos) {
            return null;
        }
        Nodo<T> nodo = head;
        for (int i = 0; i < cantidadNodos; i++) {
            nodo = nodo.getSig();
            if (index == i) {
                break;
            }
        }
        return nodo.getDato();
    }

    // GetFirst
    public T getFirst() {
        return head.getSig().getDato();
    }

    // GetLast
    public T getLast() {
        return tail.getAnt().getDato();
    }

    // IndexOff
    public int indexOf(T dato){
        Nodo<T> nodo = head;
        int aux= -1;
        for (int i = 0; i <cantidadNodos; i++) {
            nodo= nodo.getSig();
            if(Objects.equals(nodo.getDato(), dato)){
                aux = i;
                break;
            }

        }
        if (aux==-1){
            return -1;
        }
        return aux;
    }
    public T remove(){
        T aux= head.getSig().getDato();
        Nodo<T> nodo= head.getSig();
        Nodo<T> actual= nodo.getSig();
        head.setSig(actual);
        actual.setAnt(head);
        nodo.setAnt(null);
        nodo.setSig(null);
        nodo.setDato(null);
        nodo= null;
        cantidadNodos--;
        return aux;

    }

}
