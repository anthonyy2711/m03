/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijeraenfunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PiedraPapelTijeraEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int contador_jugador=0, contador_usuario=0;
        int numUsuario = tirada_usuario(sc);
        System.out.print("Has elegido: ");
        mostrar_jugada(numUsuario);
        
        int numPc = tirar_ordenador(r);
        System.out.print("La maquina ha elegido: ");
        mostrar_jugada(numPc);
        
        int ganador = comprobar_quien_gana(numPc, numUsuario);
        System.out.println("el ganador"+ganador);
        
        if (ganador==1){
            contador_jugador=aumentar_contador(contador_jugador);
        } else if(ganador==-1){
            contador_usuario=aumentar_contador(contador_usuario);
        }
        
        int contador = aumentar_contador(0);
        
        int seguir= seguir_jugando(2, 0);
        
        
        

        System.out.println("numero del pc"+numPc);
        System.out.println("numero del usuario"+numUsuario);
        
        System.out.println("contador " + contador);
        
        System.out.println("seguir "+seguir);
        

    }

    public static int tirar_ordenador(Random r) {
        int num_Pc = r.nextInt(3);
        return num_Pc;
    }

    public static int tirada_usuario(Scanner sc) {
        int num_usuario;
        do {
            System.out.print("Escoge: 0-->Piedra; 1-->Papel; 2-->Tijera: ");
            num_usuario = sc.nextInt();
        } while (num_usuario < 0 || num_usuario > 2);
        return num_usuario;
    }

    public static int comprobar_quien_gana(int numPc, int numUsuario) {

        if (numPc == 0 && numUsuario == 2) {
            return -1;
        } else if (numPc == 1 && numUsuario == 0) {
            return -1;
        } else if (numPc == 2 && numUsuario == 1) {
            return -1;
        } else if (numUsuario == 0 && numPc == 2) {
            return -1;
        } else if (numUsuario == 1 && numPc == 0) {
            return -1;
        } else if (numUsuario == 2 && numPc == 1) {
            return -1;
        } else {
            return 0;
        }

    }

    public static int aumentar_contador(int contador) {
        contador++;

        return contador;

    }

    public static void mostrar_jugada(int jugada) {

        if (jugada == 0) {
            System.out.println("Piedra");
        } else if (jugada == 1) {
            System.out.println("Papel");
        } else if (jugada == 2) {
            System.out.println("Tijera");
        }

    }
    public static int seguir_jugando(int contadorj, int contadorm){
        if (contadorj>=5 ||contadorm>5){
            return -1;
        } else{
            return 1;
        }
        
        
    }

}
