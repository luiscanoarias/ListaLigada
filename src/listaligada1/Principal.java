/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada1;

import java.util.Scanner;

/**
 *
 * @author GCA
 */
public class Principal {

    public static void main(String[] args) {
        
        ListaLigada lista = new ListaLigada();
        boolean cond = true;
        int opc;
        
        while(cond){
            Scanner scann = new Scanner(System.in);

            System.out.println("\nMenu"+
                "\n1) Agregar nodo"+
                "\n2) Agregar nodo en posicion especifica"+
                "\n3) Mostrar nodos"+
                "\n3) Salir"); 
            
            opc = scann.nextInt();
            
            switch(opc){
                
                case 1:
                    System.out.println("Nombre de la persona");
                    Scanner scannNom = new Scanner(System.in);
                    String nombre = scannNom.nextLine();
                    
                    System.out.println("Edad de la persona");
                    Scanner scannEdad = new Scanner(System.in);
                    int edad = scannEdad.nextInt();
                    
                    Persona nuevaPersona = new Persona(nombre,edad);
                    lista.agregarNodo(nuevaPersona);
                    System.out.println("Nodo agregado");
                            
                    
                    break;
                case 2:
                    System.out.println("Nombre de la persona");
                    Scanner scannNom1 = new Scanner(System.in);
                    String nombre1 = scannNom1.nextLine();
                    
                    System.out.println("Edad de la persona");
                    Scanner scannEdad1 = new Scanner(System.in);
                    int edad1 = scannEdad1.nextInt();
                    
                    System.out.println("En que posicion?");
                    Scanner scannPosicion = new Scanner(System.in);
                    int posicion = scannPosicion.nextInt();

                    Persona nuevaPersona1 = new Persona(nombre1, edad1);
                    lista.insertarEnPosicion(nuevaPersona1, posicion);
                    System.out.println("Nodo insertado en posicion "+posicion);
                    
                    break;                
                case 3:
                    System.out.println("Los nodos son:");
                    lista.mostrarNodos();
                    break;                
                case 4:
                    System.out.println("Saliendo..");
                    cond = false;
                    break;
            }  
        }
    }  
}
