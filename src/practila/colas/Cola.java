package practila.colas;
public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> finalCola;

    public Cola() {
        frente = null;
        finalCola = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encola(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            finalCola.setSiguiente(nuevo);
        }
        finalCola = nuevo;
    }

    public Nodo<T> atiende() throws Exception {
    if (estaVacia()) {
        throw new Exception("La cola está vacía");
    }

    Nodo<T> nodoActual = frente;
    Nodo<T> nodoAnterior = null;

    // Busca el primer elemento con discapacidad
    while (nodoActual != null && !((Persona) nodoActual.getDato()).isTieneDiscapacidad()) {
        nodoAnterior = nodoActual;
        nodoActual = nodoActual.getSiguiente();
    }

    if (nodoActual == null) {
        // Si no hay elementos con discapacidad, devuelve el primer elemento en general
        nodoActual = frente;
        frente = frente.getSiguiente();
        if (frente == null) {
            finalCola = null;
        }
    } else {
        // Si hay un elemento con discapacidad, lo devuelve
        if (nodoAnterior == null) {
            frente = frente.getSiguiente();
        } else {
            nodoAnterior.setSiguiente(nodoActual.getSiguiente());
        }
        if (nodoActual == finalCola) {
            finalCola = nodoAnterior;
        }
    }

    return nodoActual;
}
}
