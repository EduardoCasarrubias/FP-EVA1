/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_conversiones;

/**
 *
 * @author ecasa
 */
public class Eva1_23_conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //todo code aplication logic here
         int temp;
         double tempDecimal;
         tempDecimal = 24.5;
         temp = (int)tempDecimal;
         System.out.println(temp);
         
         String cade, mensaje;
         mensaje = "latemperatura es ";
         cade = mensaje + temp;// concatenacion
         System.out.println(cade);
    }
    
}
