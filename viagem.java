package Ex3Mat;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class viagem {
     public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
    
      System.out.println("Quantos kilometros voce quer viajar?");
       double km = teclado.nextDouble();
       
     if (km <= 200) {
         
     double p = km * 0.50;    
        System.out.println("O peco da viagem sera de:R$" +p);  
     } else {
      double p = km * 0.45;
      
       System.out.println("O peco da viagem sera de:R$" +p);
    
      
         
     }
  }
}
