package Ex3Mat;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class peso {
    
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Digite seu peso");
       double p1 = teclado.nextDouble();
       System.out.println("Digite sua altura");
       double a1 = teclado.nextDouble();
     
       double r1 = p1/(a1*a1) ;
       
       if (r1 < 18.5) {
      System.out.println("Magricela");
      
       } else if (r1 >= 18.5   && r1 < 25) {
      System.out.println("Normal"); 
      
         } else if (r1 >= 25  && r1 < 30) {
      System.out.println("Bariginha de chop"); 
      
        } else if (r1 >= 30  && r1 < 40) {
      System.out.println("Gordo");
      
        } else if (r1 >= 40) {
        System.out.println("Muito GORDO"); 
      
        }  
      }
    }

   
  