/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroprimoenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NumeroPrimoEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 0, primo=0;
        do {
            System.out.println("Introduce un numero y te diré si es primo o no");
            num = sc.nextDouble();
            primo=numeroPrimo(num);
            if (primo==-1) {
                System.out.println("Es primo");
            } else{
                System.out.println("No es primo");
            }
        } while (num != 0);

    }

    public static double numeroPrimo(double num) {
        for (int i = 2; i <=num-1; i++) {
            if(num%i==0){
                return -1;
            }
            
        }
        return 1;
    }

}
