 
package javaapplication4;

import java.util.Scanner;

public class ejercicio01_sesión05 {
    
    public static void main(String[] args){
        
        int edad;
        char sexo;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese su sexo F/M: ");
        sexo = entrada.next().charAt(0);
        
        boolean resultado = (sexo=='M' && edad>=65) || (sexo=='F' && edad>=60);
        if(resultado){
            System.out.print("SÍ se jubila");
                    }else System.out.println("NO se jubila");     
               
        
    }     
}
