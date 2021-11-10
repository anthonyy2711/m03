/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ancho_y_alto_enfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ancho_Y_Alto_EnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Total, ancho, alto, perimetro, area;
        System.out.println("Introduce el ancho: ");
        ancho=sc.nextInt();
        System.out.println("Introduce el alto: ");
        alto=sc.nextInt();
        
        perimetro= perimetroRectangulo(ancho, alto);
        System.out.println("El perimetro de los datos introducidos es: "+perimetro);
        area= areaRectangulo(ancho, alto);
        System.out.println("El ancho de los datos introducidos es: "+area);
        
        
    }
    public static double perimetroRectangulo(double ancho, double alto){
        double perimetroAncho, perimetroAlto, perimetroTotal;
        
        perimetroAncho= ancho*2;
        perimetroAlto=alto*2;
        perimetroTotal= perimetroAncho+perimetroAlto;
        
        return perimetroTotal;
        
    }
    public static double areaRectangulo(double ancho, double alto){
        double areaRectangulo;
        
        areaRectangulo= ancho*alto;
        
        return areaRectangulo;
        
    }
    
}
