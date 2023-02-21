/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trastesconobjetos;

/**
 *
 * @author jcga5
 */
public class TrastesConObjetos {

    public static void main(String[] args) {
       // Inicio parte Jean Guzman
        
        Pila miPila = new Pila();

            miPila.push(new Traste(new Plato(new Cubiertos(1), 1), null));
            miPila.push(new Traste(new Plato(new Cubiertos(2), 2), null));
            miPila.push(new Traste(null , new Vaso (new Cubiertos(2), 3)));
            miPila.push(new Traste(null , new Vaso (new Cubiertos(3), 4) ));
            miPila.push(new Traste(new Plato(new Cubiertos(0), 5), null));
            miPila.push(new Traste(null , new Vaso (new Cubiertos(0), 6) ));
        
       System.out.println("PILA ANTES DEL POP");
       miPila.listar();
       // Fin parte Jean Guzman
       
       //Incio parte Aniffer Chacon
       Cola cola = new Cola();
        cola.encola(new Nodo1(new Persona("ani", "12345", false)));
        cola.encola(new Nodo1 (new Persona("kalet", "78564", false)));
        cola.encola(new Nodo1 (new Persona ("vale", "99874", true)));
        cola.encola(new Nodo1 (new Persona ("jean", "6764", true)));
        cola.encola(new Nodo1 (new Persona ("leo", "99874", false)));
        
        cola.imprimir();
        //Fin parte Aniffer Chacon
    }
}


