package Ex3Mat;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Terreno {
    
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
      System.out.println("Digite a largura do terreno:");
       double n1 = teclado.nextDouble();   
       
        System.out.println("Digite o comprimento do terreno:");
       double n2 = teclado.nextDouble();   
     
     double  r1 = n1*n2; 
     
      if (r1 < 100) {
      System.out.println("Terreno popular");
       } else if (r1 >= 100  && r1 < 500) {
      System.out.println("Terreno Master");      
         } else if (r1 >= 500) {
      System.out.println("Terreno VIP");  
     
         }
    }
}
