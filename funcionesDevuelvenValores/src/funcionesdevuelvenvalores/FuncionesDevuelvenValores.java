/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesdevuelvenvalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionesDevuelvenValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pone un valor y lo doblare por 2, luego lo resultado lo mutliplicare por 3");
        int numero = sc.nextInt();
        int valorDoble = doblarNumero(numero);
        System.out.println("numero: "+ numero + "Valor doble: "+valorDoble);
        int valorTriple = triplicarNumero(valorDoble);
        System.out.println("numero: "+ numero + "Valor doble: "+valorTriple);
        numero=numero*2;
        numero=numero*3;
        System.out.println("El resultado es: "+numero);
        
    
    }
    /**
     * Funcion que dobla cualquier valor
     * @param valor de entrada que será doblado
     * @return el doble del valor entrada
     */
    public static int doblarNumero(int valor){
        int doble = valor*2;
        return doble;
    
        
    }
    /**
     * funcion que triplica cualquier valor
     * @param valor el valor de entrada que serça triplicado
     * @return el triple del valor de entrada
     */
    public static int triplicarNumero(int valor){
        
        int triple=valor*3;
        return triple;
    }
    
}
