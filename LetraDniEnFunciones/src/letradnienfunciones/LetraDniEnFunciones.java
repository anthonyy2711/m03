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
        System.out.println("Introduce el DNIasdasdasdasddasdaasdasdasdsadadsaddasdasasd: ");
        dni = sc.nextInt();
        char letraDni = devuelveLetra(dni);
        System.out.println("Para el DNI: " + dni + " el NIF es: " + letraDni);
    }

    public static char devuelveLetra(int dni) {
        int residuo;
        residuo = dni % 23;
        char letra = 0;
        switch (residuo) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            default:
                letra ='*';
                break;
        }
        return letra;

    }

}
