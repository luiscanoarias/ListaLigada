/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada1;

/**
 *
 * @author GCA
 */
public class Nodo {
    
    Persona persona;
    Nodo siguiente;
    
    public Nodo(){
    }
    
    public Nodo(Persona persona){
        this.persona = persona;
        this.siguiente = null;
    }
    
    //getPersona
    public Persona obtenerPersona(){
        return persona;
    }
    
    // setNodo
    public void enlazarSiguiente(Nodo nodo){
        siguiente = nodo;
    }
    
    // getNodo
    public Nodo obtenerSiguiente(){
        return siguiente;
    }
}
