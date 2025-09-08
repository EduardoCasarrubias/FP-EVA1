/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.pkg11.operaciones.logisticas;

/**
 *
 * @author ecasa
 */
public class EVA111OperacionesLogisticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radio = 5; //declaraciones e inicializamos
        boolean resu;
        //operaciones logicas: comparaciones
        //resultado: verdadero o falso 
        resu = radio > 0;
        System.out.println("radio (5) > 0 --->");
        System.out.println(resu);
        
        resu = radio <0; //radio igual que 0?
        System.out.println("radio (5) < 0 --->");
        System.out.println(resu);
        
        resu = radio ==0; //radio igual que 0?
        System.out.println("radio (5) == 0 --->");
        System.out.println(resu);
        
        resu = radio !=0; //radio igual que 0?
        System.out.println("radio (5) != 0 --->");
        System.out.println(resu);
    }
    
}
