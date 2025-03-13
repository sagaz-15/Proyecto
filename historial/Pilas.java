package historial;
import pestanas.ListasDobles;

import java.util.Objects;

public class Pilas<T> extends ListaDoble<T> {

    public Pilas(){
        super();
    }

    // Empty
    public boolean empty(){
        return cantidadNodos == 0;
    }
    public T peek(){
        return head.getSig().getDato();
    }
    public T pop(){
        return super.remove();
    }

    public  T push(T dato){
        super.remove();
        return dato;
    }

    public int search(T dato){
        Nodo<T> nodo = head;
        for (int i = 0; i <cantidadNodos ; i++) {
            nodo= nodo.getSig();
            if (Objects.equals(nodo.getDato(),dato)){
                return i+1;
            }
        }
        return -1;
    }
}