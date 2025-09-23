/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva1_20_califas {

    
    public static void main(String[] args) {
        int calificacion;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("introduce tu calificacion: ");
        calificacion = captu.nextInt();
        
        
        if((calificacion >=90) && (calificacion <=100)){
            System.out.println("su calificacion es A");
        }else if((calificacion >=80) && (calificacion <=89)){
            System.out.println("su calificacion es B");
        }else if((calificacion >=70) && (calificacion <=79)){
            System.out.println("su calificacion es C");
        }else if((calificacion >=60) && (calificacion <=69)){
            System.out.println("su calificacion es D");
        }else if((calificacion >=0) && (calificacion <=59)){
            System.out.println("su calificacion es F");
        }else{
            System.out.println("calificacion no valida");
        }
    }
    
}
