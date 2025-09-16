/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.pkg12.pkgif;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva112IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calificacion;
        
        Scanner input = new Scanner(System.in);
        System.out.println("introduce tu calificacion");
        calificacion = input.nextInt();
        
        if(calificacion>=70){
            System.out.println("acreditado");
            
        }else{
            System.out.println("no acreditaste");
        }
        
    }
    
}
