/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocerelmajorenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConocerElMajorEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1=0, valor2=0, mayor=0, numeromayor;
        System.out.print("Pon el valor 1: ");
        valor1 = sc.nextInt();
        System.out.println("Pon el valor 2:");
        valor2= sc.nextInt();
        mayor=numMasGrande(valor1, valor2);
                
        
        System.out.println("EL numero mas grande que has puesto es"+ mayor);
    }
    
    /**
     * numMasGrande
     * FUncion que a partir de dos numero RETRONA del valor mas grande
     * @param valor1 es el primer valor de entrada
     * @param valor2 es el segundo valor de entrada
     * @return devuelve el numero(valor) mas grande de los 2 de entrada
     * 
     */
    public static int numMasGrande(int valor1, int valor2){
        int mayor=0;
        if(valor1>valor2){
            mayor=valor1;   
        } else if(valor2>valor1){
            mayor=valor2;
        }
        return mayor;

    }
}
