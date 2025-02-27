package Ex3Mat;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class salario {
    
     public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Digite o seu salario:");
       double n1 = teclado.nextDouble();   
       
       System.out.println("Digite quanto tempo voce trabalho na empresa:");
       double r1 = teclado.nextDouble();   
     
        if (r1 <= 3) {
       double s2 = n1 * 0.03 + n1;     
        
      System.out.println("Seu salario eh:R$"+ s2);
        }  else if (r1 > 3 && r1 < 10) {
    double s2 = n1 * 0.125 + n1;  
 System.out.println("Seu salario eh:R$"+ s2);      
         } else if (r1 >= 10) {
    double s2 = n1 * 0.2 + n1;  
    System.out.println("Seu salario eh:R$"+ s2); 
      
                }
     }
}
