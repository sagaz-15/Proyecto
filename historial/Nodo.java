package historial;

public class Nodo<T> {
    private Nodo<T> sig;
    private Nodo<T> ant;
    private  T dato;

    public Nodo (){
        this.sig = null;
        this.ant = null;
    }

    public Nodo<T> getSig() {
        return this.sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    public Nodo<T> getAnt() {
        return this.ant;
    }

    public void setAnt(Nodo<T> ant) {
        this.ant = ant;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}