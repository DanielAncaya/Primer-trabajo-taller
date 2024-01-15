
package JavaApplication4;

import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args){
    int montoCompra;
    final double DESCUENTO;
    
     Scanner entrada = new Scanner (System.in);    
    System.out.println("Ingrese su monto de compra: ");
    montoCompra = entrada.nextInt();
    
    DESCUENTO = montoCompra * 0.10;
   
    if(montoCompra>2500) {
     System.out.println("Sí cuenta con descuento. Sería :" + DESCUENTO);
}   else{
        System.out.println("no cuenta con descuento");
    }
    System.out.printf("Monto final a pagar es: %f" , montoCompra - DESCUENTO);
    }  
    
}
