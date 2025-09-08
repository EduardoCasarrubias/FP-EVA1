/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.pkg10.captura;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva110Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velocidad, distancia, tiempo;
        
        Scanner captu = new Scanner(System.in);//declarar el scanner 
        
        System.out.println("introduce la distancia: ");
        distancia =captu.nextDouble();
        System.out.println("introduce el tiempo; ");
        tiempo =captu.nextDouble();
        //calculo
        velocidad = distancia/tiempo; 
        System.out.print("la velocidad es= ");
        System.out.print(velocidad);
        System.out.print(" m/s");
                
    }
    
}
