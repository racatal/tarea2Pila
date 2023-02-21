package practila.colas;
public class Main {
    public static void main(String[] args) {
        
         Cola<Persona> laCola = new Cola<>();

    laCola.encola(new Persona(1234567, "Juan", false));
    laCola.encola(new Persona(2345678, "Maria", true));
    laCola.encola(new Persona(3456789, "Pedro", false));
    laCola.encola(new Persona(5801615, "Jose", false));
    laCola.encola(new Persona(7065218, "Leonardo", true));
    laCola.encola(new Persona(6080402, "Carmen", false));

    try {
        while (!laCola.estaVacia()) {
            Persona persona = laCola.atiende().getDato();
            System.out.println("Atendiendo a " + persona.getNombre());
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}




