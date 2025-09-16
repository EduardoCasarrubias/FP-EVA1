/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.pkg13.pkgif;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva113IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calificacion;
        
        Scanner input = new Scanner(System.in);
        System.out.println("introduce tu año de nacimiento");
        calificacion = input.nextInt();
        
        if(calificacion<=2007){
            System.out.println("puedes comprar alcohol");
            
        }else{
            System.out.println("no puedes comprar alcohol");
        }
    }
    
}
