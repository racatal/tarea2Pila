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
       Pila miPila = new Pila();

            miPila.push(new Traste(new Plato(new Cubiertos(1), 1), null));
            miPila.push(new Traste(new Plato(new Cubiertos(2), 2), null));
            miPila.push(new Traste(null , new Vaso (new Cubiertos(2), 3)));
            miPila.push(new Traste(null , new Vaso (new Cubiertos(3), 4) ));
            miPila.push(new Traste(new Plato(new Cubiertos(0), 5), null));
            miPila.push(new Traste(null , new Vaso (new Cubiertos(0), 6) ));
        
       System.out.println("PILA ANTES DEL POP");
       miPila.listar();
    }
}