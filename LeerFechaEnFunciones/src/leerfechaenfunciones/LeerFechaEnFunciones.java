/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerfechaenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class LeerFechaEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int correcto = esCorrecto(0, 0, 0);
        introduceFecha(sc);
        

        if (correcto == 1) {
            System.out.println("La fecha introducida es correcta");
        } else if (correcto == 0) {
            System.out.println("La fecha introducida es incorrecta");
        }

    }

    public static void introduceFecha(Scanner sc) {
        int dia, mes, año;

        System.out.println("Introduce el dia: ");
        dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduce el año");
        año = sc.nextInt();

    }

    public static int esCorrecto(int dia, int mes, int año) {

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año >= 1900) {
                    return 1;
                }
            }
        } else {
            return 0;
        }
            return 0;
    }

}
