/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trastesconobjetos;

/**
 *
 * @author Anifer
 */
public class Nodo1 {
    private Persona dato;
    private Nodo1 atras;

    public Nodo1(Persona dato) {
        this.dato = dato;
        this.atras = atras;
    }

    public Persona getDato() {
        return dato;
    }

    public Nodo1 getAtras() {
        return atras;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public void setAtras(Nodo1 atras) {
        this.atras = atras;
    }
}
