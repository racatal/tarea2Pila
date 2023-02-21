/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trastesconobjetos;

/**
 *
 * @author Anifer
 */
public class Persona {
    private String nombre;
    private String cedula;
    private boolean discapacidad;

    public Persona(String nombre, String cedula, boolean discapacidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.discapacidad = discapacidad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }
}

