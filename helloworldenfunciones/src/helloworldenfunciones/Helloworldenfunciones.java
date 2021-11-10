/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworldenfunciones;

/**
 *
 * @author alumne
 */
public class Helloworldenfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    helloworld();
    String nombre = "Anthony Reyes";
    hellorworldNombre(nombre);
    int valor =5;
    System.out.println("valor no clonado antes de la funcion: " + valor);
    aumentaEnDos(valor);
    System.out.println("valor no clonado despues de la funcion: " + valor);
             
    /**
     * Funcion que muestra por pantalla helloWorld
     * void no devuelve ningún valor al main
     */    
    }
    public static void helloworld(){
        System.out.println("Hello world in functions"); 
        
    }
    /**
     * Escribira hello world acompañado del nombre 
     * @param nom es la variable que contiene el nombre
     */
    
    public static void hellorworldNombre(String nom){
        System.out.println("Hello World. "+nom+", How are you?");
    }
    /**
     * Aumentar el valor que ha pasado en dos
     * @param valor tendra el numero que me pasa desde el main
     */
    private static void aumentaEnDos(int valor) {
        System.out.println("Valor clonado antes de ningun cambio"+ valor);
        valor= valor+2;
        System.out.println("valor clonado " + valor);
        valor= valor*2;
        System.out.println("Valor clonado por 2: " +valor);
    }
    
}
