package colaEjemplo;

import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {

    private Queue<String> cola;

    public ColaEjemplo() {
        cola = new LinkedList<>();
    }

    public void insertarElemento(String elemento) {
        cola.offer(elemento);
    }

    public String buscarElemento(String elemento) {
        return cola.contains(elemento) ? "El elemento está en la cola." : "El elemento no está en la cola.";
    }

    public String eliminarElemento() {
        return cola.poll();
    }

    public void mostrar() {
        System.out.println("Elementos en la cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}
