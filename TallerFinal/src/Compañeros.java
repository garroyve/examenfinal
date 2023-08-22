


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class Compañeros {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       punto1();
        punto2();
        punto3Y4Y5();
        punto6Y7();
  
    }
    public static void punto1 (){
       String nombres [];
       nombres= new String[6];
       for (int i = 0; i < 6; i++){
           System.out.println("Agregar nombres : ");
           nombres[i]=sc.next();
           
           
       }for (int j = 0; j < nombres.length; j++){
        System.out.print(" El nombre en la posicion " + j + " es " + nombres[j]);}
       
        
    }
    
    public static void punto2(){
        System.out.println("-------------------------------");
      int array[][]={{30,26,18},{44,12,22},{5,70,15}};
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
            System.out.print( array[i][j] + "\t");
        }
        System.out.println();
        }
    }
    
    public static void punto3Y4Y5() {
     String jugadores [][]={{"juan","15 años","delantero"},{"pedro","16 años","defensa"},{"luis","17 años","arquero"}};
        
         System.out.println("----------------------------------------");
         System.out.println("punto 3");
        for (int i = 0; i < jugadores.length; i++) {
            for (int j = 0; j < jugadores[i].length; j++) {
                 System.out.print( jugadores[i][j] + "\t" );
            }
            System.out.println();
        }
       
         System.out.println("----------------------------------------");
         System.out.println("punto 4");
         System.out.println("en la posicion 2 esta :" + jugadores[2][2]);
         System.out.println("----------------------------------------");
         System.out.println("punto 5");
         System.out.println("en la posicion 1 del jugador2 esta : " + jugadores[1][1]);
    }   
        
        
    public static void punto6Y7() {
        int cont = 0;
       int numeros [];
       numeros = new int[7];
       System.out.println("----------------------------------------");
         System.out.println("punto 6");
        do{
            System.out.println("ingrese los 7 numeros");
            numeros[cont]=sc.nextInt();
            cont++;
        }while (cont < 7);
        
        System.out.println("----------------------------------------");
         System.out.println("punto 7");
         
         for (int i = 0; i < numeros.length; i++) {
             System.out.println("los  numeros en la posicio " + i + " es " + numeros[i]);
            
        }
    }
    
}
