/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elivaenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ElIvaEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cincoNum;
        System.out.println("Introduce 5 numeros");
        cincoNum=PideCincoNumeros(sc);
        
        
    }
    public static double PideCincoNumeros(Scanner sc){
        double cont=0, precio_sin_iva=0, precio_con_iva=0;
        
        do{
            precio_sin_iva=sc.nextInt();
            precio_con_iva=precio_sin_iva*0.21;
            precio_con_iva=precio_sin_iva+precio_con_iva;
            System.out.println("El de iva del: "+precio_sin_iva+" es "+precio_con_iva);
            cont++;
        }while (cont!=5);
        
        
        
        return precio_con_iva;
        
    }
    
}
