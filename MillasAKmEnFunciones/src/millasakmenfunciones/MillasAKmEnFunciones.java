/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millasakmenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MillasAKmEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double milla= 1.60934;
        double numMilla, kilometro;
        System.out.println("Introduce el numero de millas que quieres convertir");
        numMilla= sc.nextInt();
        kilometro= millas_a_kilometros(milla, numMilla);
        System.out.println("La conversion de kilometros a millas es:"+kilometro);
        
        
        
    }
    /**
     * 
     * @param milla
     * @param numMilla
     * @return 
     */
    public static double millas_a_kilometros(double milla, double numMilla){
        double km;
        
        km=numMilla*milla;
        
        return km;
        
        
    }
    
}
