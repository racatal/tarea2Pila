/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trastesconobjetos;

/**
 *
 * @author Anifer
 */
public class Cola {
    private Nodo1 frente;
    private Nodo1 ultimo;
    private int largo;
    
    public Cola(){
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }
 // public void imprimir () {
 // System.out.println("El tercero de la fila es:" +frente.getAtras().getAtras().getDato().getNombre());
 // }
  
  public void encola (Nodo1 nuevoNodo){
      if (frente == null){
          frente = nuevoNodo;
          ultimo = nuevoNodo;
      }else if (nuevoNodo.getDato().isDiscapacidad()){
          nuevoNodo.setAtras(frente);
          frente = nuevoNodo;
      }
      else{
          ultimo.setAtras(nuevoNodo);
          ultimo=nuevoNodo;
      }
      largo++;
  }
  public void imprimir (){
      Nodo1 aux = frente;
      while(aux != null){ 
          System.out.println("El usuario llamado "+aux.getDato().getNombre()+" "
                  + " de cedula"+aux.getDato().getCedula()+" "+aux.getDato().isDiscapacidad());
          aux = aux.getAtras();         
      }    
  }
  
  public Nodo1 atiende (){
      Nodo1 aux = frente;
      if(frente!=null){
          frente=frente.getAtras();
          aux.setAtras(null);
          largo--;
      }
      return aux;
  }
    
}
