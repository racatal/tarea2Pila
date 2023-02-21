/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trastesconobjetos;

/**
 *
 * @author jcga5
 */
public class Plato {
    
    private Cubiertos cubiertos;
    private int Id;

    public Plato(Cubiertos cubiertos, int Id) {
        this.cubiertos = cubiertos;
        this.Id = Id;
    }

    public Cubiertos getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(Cubiertos cubiertos) {
        this.cubiertos = cubiertos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
}
