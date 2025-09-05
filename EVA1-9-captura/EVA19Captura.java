/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.pkg9.captura;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EVA19Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in); //crea el scanner
        
        System.out.println("introduce tu nombre complreto");
        nombre= input.nextLine();//campura el texto (nextLine())
        System.out.println("introduce tu edad");
        edad= input.nextInt();
        System.out.println("captura tu promedio de preparatoria");
        promedio= input.nextDouble();
        //captura de datos
        System.out.println("el nombre capturado es:");
        System.out.println(nombre);
        System.out.println("la edad es: ");
        System.out.println(edad);
        System.out.println("el promedio es: ");
        System.out.println(promedio);
        
    }
    
}
