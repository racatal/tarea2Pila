package practila.colas;
class Persona {

    private int cedula;
    private String nombre;
    private boolean tieneDiscapacidad;

    public Persona(int cedula, String nombre, boolean tieneDiscapacidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tieneDiscapacidad = tieneDiscapacidad;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTieneDiscapacidad() {
        return tieneDiscapacidad;
    }
}