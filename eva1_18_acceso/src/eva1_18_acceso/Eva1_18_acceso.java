/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva1_18_acceso {
    final static String USUARIO = "eduardo";
    final static String PWD = "1234";
    
    public static void main(String[] args) {
        String usu, contra;
        Scanner input = new Scanner (System.in);
        System.out.println("BIENVENIDO");
        System.out.println("SISTEMA DE VENTAS DE UN OXXO");
        System.out.println("USUARIO: ");
        usu = input.nextLine();
        System.out.println("CONTRASEÑA: ");
        contra = input.nextLine();
        //equals --> compara texto
        if(usu.equals(USUARIO)){ //comparar cadenas // usuario correcto
            if(contra.equals(PWD)){//contra correcta
            System.out.println("ACCESO CONCEDIDO");
        }else{ //contraseña incorrecta
            System.out.println("ACCESO DENEGADO");
        }
            
        }else{//usuario incorrecto
            System.out.println("ACCESO DENEGADO");
        
        }
    }
    
}
