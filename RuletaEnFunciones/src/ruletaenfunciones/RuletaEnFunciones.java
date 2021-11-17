/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletaenfunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RuletaEnFunciones {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num_apuesta, dinero_tengo, bola, dinero_actual, cantidad, premio;
        boolean seguir;
       
//        int dinero_tengo;
//        int cantidad=100;
//        int bola=tirar_bola(r);
//        int num_apuesta= pedir_numero_apuesta(sc);
//        boolean comprobado=comprobar_resultado(num_apuesta, bola);
//        int premio= calcular_premio(num_apuesta, cantidad, bola);
//        int dinero_actual= actualizar_dinero(premio, cantidad, comprobado);
//        boolean seguir= seguir_jugando(dinero_tengo, sc);
        do{
            System.out.println("Decide a cual quieres apostar---> numero del 0 al 36, impar(37) o par(38) ");
            num_apuesta=pedir_numero_apuesta(sc);
            System.out.println("Cuanto quieres apostar?");
            cantidad= sc.nextInt();
            bola=tirar_bola(r);
            System.out.println("El numero que ha salido es el "+ bola);
            boolean comprobado=comprobar_resultado(num_apuesta, bola);
            if(comprobado==true){
                System.out.println("Has ganado con el "+num_apuesta);
                premio= calcular_premio(num_apuesta, cantidad, bola);
                dinero_actual=
                System.out.println("Se te ha sumado: "+dinero_actual);
            } else if(comprobado==false){
                System.out.println("Has perdido con el "+num_apuesta);
                dinero_actual=
                System.out.println("Se te ha restado: "+dinero_actual);
            }  
           
        }while (seguir=seguir_jugando(bola, sc));
       
    }

    public static int tirar_bola(Random r) {

        int bola = r.nextInt(37);
        return bola;
    }

    public static int pedir_numero_apuesta(Scanner sc) {
        int pedir_num;
        pedir_num = sc.nextInt();
        if (pedir_num >= 0 && pedir_num <= 38) {
            return pedir_num;
        } else {
            return -1;
        }
    }

    public static int pedir_dinero_apuesta(Scanner sc, int dinero_tengo) {
        int dinero_apuesta = sc.nextInt();
        if (dinero_apuesta >= 0 && dinero_apuesta <= dinero_tengo) {
            return dinero_apuesta;
        } else {
            return -1;
        }

    }
    public static boolean comprobar_resultado(int num_apuesta, int bola){
        if(num_apuesta==bola){
            return true;
        } else if(num_apuesta==37 && bola%2!=0){
            return true;
        } else if(num_apuesta==38 && bola%2==0){
            return true;
        } else{
            return false;
        }
       
    }
    public static int calcular_premio(int num_apuesta, int cantidad, int bola){
        int numeroNormal, par_impar;
       
        if(num_apuesta==37||num_apuesta==38){
            par_impar= cantidad*2;
            return par_impar;
        } else if(num_apuesta==bola){
            numeroNormal=cantidad*36;
            return numeroNormal;
        } else {
            return 0;
        }
       
    }
    public static int actualizar_dinero(int cantidad, int dinero_ganado, int premio, boolean comprobado){
        int dinero_actual ;
        if(comprobado==false){
            dinero_actual= cantidad-dinero_ganado;
            return dinero_actual;
        } else{
            dinero_actual=cantidad+premio;
            return dinero_actual;
        }  
    }
    public static boolean seguir_jugando(int dinero, Scanner sc){
        char opcion;
        if(dinero<0){
            return false;
        } else if(dinero>0){
            System.out.println("Quieres seguir jugando?");
            opcion=sc.next().charAt(0);
            if(opcion=='s' || opcion=='S'){
                return true;
            } else if(opcion=='N'|| opcion=='n'){
                return false;
            }
        } else{
            return false;
        }
        return false;
    }
   
   
       
       
    }



