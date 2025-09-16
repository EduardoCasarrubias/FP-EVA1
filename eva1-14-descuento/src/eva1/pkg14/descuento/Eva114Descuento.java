/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.pkg14.descuento;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva114Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double montoVenta, montoPagar;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce el monto de la compra");
        montoVenta = captu.nextDouble();
        
        if(montoVenta>1000){
            montoPagar = montoVenta * 0.85;
            //monoVenta - (montoPagar *0.15)
            System.out.println("debes pagar: ");
            System.out.println(montoPagar);
        
        }
    }
   }
    
    

