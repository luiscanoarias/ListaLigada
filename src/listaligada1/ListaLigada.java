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
public class ListaLigada {
    
    Nodo inicio, recorrerNodos, aux;
    int size;
    
    public void ListaEnlazada(){
        inicio = null;
    }

    public void agregarNodo(Persona persona){
        
        if(inicio == null){
            inicio = new Nodo(persona);
            size++;
        }else{
            recorrerNodos = inicio;
            Nodo nuevoNodo = new Nodo(persona);

            for (int i = 0; i < size; i++) {
                if(recorrerNodos.obtenerSiguiente() == null){
                    recorrerNodos.enlazarSiguiente(nuevoNodo);
                }
                recorrerNodos = recorrerNodos.obtenerSiguiente();
            }
            size++;
        }
    }
    
    
    public void insertarEnPosicion(Persona persona, int posicion){
        
        Nodo nuevoNodo = new Nodo(persona);
        recorrerNodos = inicio;
    
        for (int i = 0; i < size; i++) {
          
            if(posicion == i+1){
                aux = recorrerNodos.obtenerSiguiente();
                recorrerNodos.enlazarSiguiente(nuevoNodo);
                nuevoNodo.enlazarSiguiente(aux);
                size++;
                break;
            }

            recorrerNodos = recorrerNodos.obtenerSiguiente();
        }
        
    }
    
    public void mostrarNodos(){
        
        recorrerNodos = inicio;
 
        for (int i = 0; i < size; i++) {
            System.out.println("Nodo["+i+"] "+recorrerNodos.obtenerPersona().getNombre()+" "+recorrerNodos.obtenerPersona().getEdad());
            recorrerNodos = recorrerNodos.obtenerSiguiente();
        }
    }
   
}
