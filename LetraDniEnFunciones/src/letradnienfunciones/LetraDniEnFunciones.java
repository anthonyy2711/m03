/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letradnienfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class LetraDniEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni;
        
        System.out.println("Introduce el DNI: ");
        dni= sc.nextInt();
        char letraDni=devuelveLetra(dni);
        System.out.println("Para el DNI: "+dni+"el NIF es: "+letraDni);
        
        
    }
    public static char devuelveLetra(int dni){
        int residuo;
        
        residuo=dni%23;
        char letra=0;
        if(residuo==0){
           letra='T'; 
        }else if(residuo==1){
           letra='R';
        }else if(residuo==2){
           letra='W';
        } else if(residuo==6){
            letra='Y';
        }
        
        return letra;
        
        
        
    }
    
    
}
