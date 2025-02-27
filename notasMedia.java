package Ex3Mat;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class notasMedia {
    
   public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
      System.out.println("Digite uma nota:");
       double n1 = teclado.nextDouble();   
       
        System.out.println("Digite outra nota:");
       double n2 = teclado.nextDouble();   
       
       double r1 = ((n1 +n2)/2);
           
      if (r1 <= 4.9) {
      System.out.println("Rodou");
       } else if (r1 > 4.9  && r1 < 7) {
      System.out.println("Recuperacao");      
         } else if (r1 >= 7) {
      System.out.println("Aprovado");  
      
      
    }           
  }
}
