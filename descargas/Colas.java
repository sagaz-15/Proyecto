package descargas;

import java.util.Arrays;

public class Colas {
    private int numElememtos;
    private int inicio;
    private int end;
    private String[] cola;

    // Constructor
    public Colas(int tam) {
        cola = new String[tam];
        this.numElememtos = 0;
        this.inicio = 0;
        this.end = -1;
    }

    public boolean vacia() {
        return numElememtos == 0;
    }

    public boolean insertar(String elemento) {
        if (numElememtos < cola.length) {
            end = (end + 1) % cola.length;
            cola[end] = elemento;
            numElememtos++;
            return true;
        }
        return false;
    }

    public String remover() {
        if (vacia()) {
            return null;
        }
        String eliminado = cola[inicio];
        cola[inicio] = null;
        inicio = (inicio + 1) % cola.length;
        numElememtos--;
        return eliminado;
    }

    @Override
    public String toString() {
        return Arrays.toString(cola);
    }

}
