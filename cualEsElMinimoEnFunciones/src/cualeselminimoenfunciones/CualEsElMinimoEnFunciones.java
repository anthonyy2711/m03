/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cualeselminimoenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CualEsElMinimoEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, menor=0;
        
        System.out.println("Introduce el primer numero");
        a= sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b=sc.nextInt();
        menor= elMenor(a, b);
        System.out.println("El menor es "+menor);
        
    }
    public static int elMenor(int a, int b){
    int menor = 0;
    
    if(a<b){
        menor=a;
    }else if(b<a){
        menor=b;
    }
    return menor;
}
    
    
}
