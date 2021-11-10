/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cualeselmasgrandeenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CualEsELMasGrandeEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, elMaximo;
        System.out.println("Escribe 3 numeros: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        
        elMaximo=cualEsElMaximo(num1, num2);
       
        elMaximo=cualEsElMaximo(elMaximo, num3);
        
        System.out.println("El numero mas grande es: "+elMaximo);
    }
    /**
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public static int cualEsElMaximo(int num1, int num2){
        
        if (num1>num2){
            return num1;
        } else{
            return num2;
        }
        
    }
    
}
