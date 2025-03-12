package historial;
import pestanas.ListasDobles;
import pestanas.Nodo;

public class Pilas {
    public Pilas() {
        super();
    }
    public void push(String dato){
        super.insertarPrimero(dato);
    }
    public Nodo pop(){
        Nodo actual = cola.anterior;
        Nodo anterior = actual.anterior;
        Nodo siguiente = cola;
        anterior.siguiente = cola;
        siguiente.anterior = anterior;
        actual.siguiente = null;
        actual.anterior = null;
        return actual;
    }
    public void mostrar(){
        super.mostrarLista();
    }

    public static void main(String[] args) {
        Pila p = new Pila();
        p.push("coco");
        p.push("yuca");
        p.push("arepa");
        System.out.println("principio de pila");
        p.mostrar();
        Nodo eliminado =p.pop();
        System.out.println("Nodo eliminado ="+eliminado.inf);
        System.out.println("Pila despues de eliminar");
        p.mostrar();
    }

}
