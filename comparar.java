package Ex3Mat;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class comparar {
    
     public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
      System.out.println("Digite o primeiro numero:");
       double n1 = teclado.nextDouble();  
       
        System.out.println("Digite o segundo numero:");
       double n2 = teclado.nextDouble();  
       
       if (n1 > n2) {
      System.out.println("O primeiro numero eh maior");
       } else if (n1 < n2) {
      System.out.println("O segundo numero eh maior");      
         } else if (n2 == n1) {
      System.out.println("Os numeros sao iguais");     
           
           
       }
  }  
}
