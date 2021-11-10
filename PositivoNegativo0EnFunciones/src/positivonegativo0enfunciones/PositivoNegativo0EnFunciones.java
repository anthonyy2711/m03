/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivonegativo0enfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PositivoNegativo0EnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero");
        int numero= sc.nextInt();
        int signo=0;
        
        
        signo= queSigno(numero);
        
        System.out.println("EL numero es:"+ signo);
        
    }
    /**
     * 
     * @param numero
     * @return 
     */
    
    public static int queSigno(int numero){
        
       
        if(numero<0){
            return -1;
        } else if(numero==0){
           return 0;
        } else if(numero>0)
            return 1;
        return 0;
        
        
        
    }
    
}
