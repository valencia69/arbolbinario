package ab;
public class nodo {

    private nodo izquierdo;
    private int dato;
    private nodo derecho;

    public nodo(nodo izquierdo, int dato, nodo derecho) {
        this.setIzquierdo(izquierdo);
        this.setDato(dato);
        this.setDerecho(derecho);
    }

    public nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(nodo derecho) {
        this.derecho = derecho;
    }
}
