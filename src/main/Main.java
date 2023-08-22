package main;

import colaEjemplo.ColaEjemplo;

public class Main {
    public static void main(String[] args) {
       ColaEjemplo cola = new ColaEjemplo();

        cola.insertarElemento("Elemento1");
        cola.insertarElemento("Elemento2");
        cola.insertarElemento("Elemento3");

        cola.mostrar();

        System.out.println(cola.buscarElemento("Elemento2"));

        String elementoEliminado = cola.eliminarElemento();
        System.out.println("Elemento eliminado de la cola: " + elementoEliminado);

        cola.mostrar();
    }
}
