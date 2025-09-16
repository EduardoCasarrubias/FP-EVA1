/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.pkg15.mayor;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva115Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("numero 1");
        numero1 = input.nextInt();
        System.out.println("numero 2");
        numero2 = input.nextInt();
        
        if (numero1 > numero2){
         System.out.println("numero mayor");
         System.out.println(numero1);
        }else{
          if(numero2>numero1){
              System.out.println("numero mayor es: ");
              System.out.println(numero2);
              
          }else{
              System.out.println("los nuemros son iguales");
          }
        }
    }
    
}
