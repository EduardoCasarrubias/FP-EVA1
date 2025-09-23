/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_operaciones;

/**
 *
 * @author ecasa
 */
public class Eva1_21_operaciones {

    
    public static void main(String[] args) {
           // diferentes operaciones 
           //potencia 
           int valor =2, expo =3;
           double resu;
           resu = Math.pow(valor, expo);
           System.out.print("2 al cubo= ");
           System.out.println(resu);
           //raiz cuadrada 
           int valor2 = 100;
           double resu2;
           resu2 = Math.sqrt(valor2);
           System.out.print("raiz de 100= ");
           System.out.println(resu2);
           //otras raices
           int valor3= 125;
           double resu3;
           resu3 = Math.pow(valor3, 1.0/3.0);
           System.out.print("raiz cubica de 125= ");
           System.out.println(resu3);
           //divicion entre enteros 
           System.out.print("7/3= ");
           System.out.println(7.0/3.0);
           // division exacta 
           int num1 = 2024, num2 = 4;
           int residuo;
           residuo = num1 % num2 ;//calculo del resido
           System.out.print("2024/ 4 el residuo es:");
           System.out.println(residuo);
           
           
    }
    
}
