/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22__bisiesto;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva1_22__bisiesto {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int year, resi4, resi100, resi400;
        System.out.println("año a verificar: ");
        year = captu.nextInt();
        resi4 = year % 4;
        resi100 = year % 100;
        resi400 = year % 400;
        
        if(resi4 == 0){ // divisicion exacta entre 4
            if(resi100 ==0){
                if(resi400 ==0){
                    System.out.print("el año " + year + "  es bisiesto");
               
                }else{
                    System.out.print("el año " + year + " no es bisiesto");
                    
                }
                
            }else{//si no es divisible entre 100 no es bisiesto
               System.out.print("el año " + year +" es bisiesto");
               
            }
        }else{
            System.out.print("el año " + year + " no es bisiesto");
            
            
        }
    }
    
}
