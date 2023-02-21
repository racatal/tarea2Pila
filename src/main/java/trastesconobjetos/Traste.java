/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trastesconobjetos;

/**
 *
 * @author jcga5
 */
public class Traste {
    
    private Plato plato;
    private Vaso vaso;

    public Traste(Plato plato , Vaso vaso) {
        this.plato = plato;
        this.vaso = vaso;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Vaso getVaso() {
        return vaso;
    }

    public void setVaso(Vaso vaso) {
        this.vaso = vaso;
    }
    
    
    
}
