/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trastesconobjetos;

/**
 *
 * @author jcga5
 */
public class Pila {

    int cubiertos = 0;
    private Nodo cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }

    public boolean Vacia() {
        return cima == null;
    }

    public int tamanio() {
        return this.largo;
    }

    public void push(Traste valor) {
        Nodo newNode = new Nodo();
        newNode.setValor(valor);

        
        
//        if (newNode.getValor().getPlato() != null) {
//
//        cubiertos += newNode.getValor().getPlato().getCubiertos().getCantidad();
//        newNode.getValor().getPlato().getCubiertos().setCantidad(0);
//
//        } else if (newNode.getValor().getVaso() != null) {
//        cubiertos += newNode.getValor().getVaso().getCubiertos().getCantidad();
//        newNode.getValor().getVaso().getCubiertos().setCantidad(0);
//        }
        
        
        
        

        if (this.Vacia()) {
            
            if (newNode.getValor().getPlato() != null) {

        cubiertos += newNode.getValor().getPlato().getCubiertos().getCantidad();
        newNode.getValor().getPlato().getCubiertos().setCantidad(0);

        } else if (newNode.getValor().getVaso() != null) {
        cubiertos += newNode.getValor().getVaso().getCubiertos().getCantidad();
        newNode.getValor().getVaso().getCubiertos().setCantidad(0);
        }
            
            this.cima = newNode;
            
            
        } else {
            if (newNode.getValor().getPlato() != null) {

        cubiertos += newNode.getValor().getPlato().getCubiertos().getCantidad();
        newNode.getValor().getPlato().getCubiertos().setCantidad(0);

            } else if (newNode.getValor().getVaso() != null) {
        cubiertos += newNode.getValor().getVaso().getCubiertos().getCantidad();
        newNode.getValor().getVaso().getCubiertos().setCantidad(0);
            }
            newNode.setSiguiente(this.cima);
            this.cima = newNode;

            
            if (this.cima.getSiguiente().getValor().getPlato() != null) {

                this.cima.getSiguiente().getValor().getPlato()
                        .getCubiertos().setCantidad(0);

        } else if (this.cima.getSiguiente().getValor().getVaso() != null) {
                this.cima.getSiguiente().getValor()
                        .getVaso().getCubiertos().setCantidad(0);
        }
            
            
        }

        if (this.cima.getValor().getPlato() != null) {

            this.cima.getValor().getPlato().getCubiertos()
                    .setCantidad(cubiertos);

        } else if (this.cima.getValor().getVaso() != null) {

            this.cima.getValor().getVaso().getCubiertos()
                    .setCantidad(cubiertos);

        }

        /*else if(this.cima.getSiguiente().getValor().getPlato()!= null){
    this.cima.getSiguiente().getValor().getPlato().getCubiertos().setCantidad(0);
}else if(this.cima.getSiguiente().getValor().getVaso()!= null){
   this.cima.getSiguiente().getValor().getVaso().getCubiertos().setCantidad(0);
        }*/
        this.largo++;
    }

    public void pop() {
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }

    /* public boolean search(Trastes reference) {
        // Crea una copia de la pila.
        Nodo aux = cima; 
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference.getId().equals(aux.getValor().getId())) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }*/
 /*       public void popModificado(Persona reference){
        // Consulta si el value exist en la pila.
        if (search(reference)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            Nodo cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while(!(reference.getId().equals(cima.getValor().getId()))){
                // Crea un node temporal para agregarlos a la pila auxiliar.
                Nodo temp = new Nodo();
                // Ingresa el value al node temporal.
                temp.setValor(cima.getValor());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(cimapPilaAux == null){
                    // Inicializa la pila auxiliar.
                    cimapPilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else{
                    temp.setSiguiente(cimapPilaAux);
                    cimapPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                pop();
            }
            // Elimina el node que coincide con el de reference.
            pop();
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(cimapPilaAux != null){
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimapPilaAux.getValor());
                // Avansa al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimapPilaAux = null;
        }
        else{
            System.out.println("La persona indicada no existe");
        }
    } */
    public void listar() {
        // Crea una copia de la pila.
        Nodo aux = cima;

        // Node aux =  new Node();
        // aux = cima;
        // Recorre la pila hasta el ultimo node.
        while (aux != null) {

            if (aux.getValor().getPlato() == null) {
                System.out.println("|\t" + "Vaso con ID "
                        + aux.getValor().getVaso().getId() + " y tiene "
                        + aux.getValor().getVaso().getCubiertos().getCantidad()
                        + " cubiertos "
                        + "\t|");
                System.out.println("-----------------");
                aux = aux.getSiguiente();
            } else if (aux.getValor().getVaso() == null) {
                System.out.println("|\t" + "Plato con ID "
                        + aux.getValor().getPlato().getId() + " y tiene "
                        + aux.getValor().getPlato().getCubiertos().getCantidad()
                        + " cubiertos "
                        + "\t|");
                System.out.println("-----------------");
                aux = aux.getSiguiente();
            }
//            
//            System.out.println("|\t" + aux.getValor()+
//           "\t|");
//            System.out.println("-----------------");
//            aux = aux.getSiguiente();
        }
    }

}
