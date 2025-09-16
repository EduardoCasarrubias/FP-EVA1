/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva1_19_antro {
    final static String edad = "mayor de 18";
    final static String credencial = "si";
    
    public static void main(String[] args) {
        String edad, credencial;
        Scanner input = new Scanner (System.in);
        System.out.println("BIENVENIDO");
        System.out.println("CUAL ES SU EDAD?? ");
        edad = input.nextLine();
        System.out.println("TIENE CREDENCIAL DE ELECTOR?? ");
        credencial = input.nextLine();
        
        
        if(edad.equals(edad)){ 
            if(credencial.equals(credencial)){
            System.out.println("PUEDES PASAR");
        }else{ 
            System.out.println("NO PASAS");
        }
            
        }else{
            System.out.println("NO PASAS");
        
        }
    }
    
}
