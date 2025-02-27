package Ex3Mat;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class promocao {
    
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
     
//     System.out.println("Qual seu nome?");
//       double nome = teclado.nextDouble();

     System.out.println("Qual eh seu sexo / Masculino[1]Feminino[2] ");
      int s1 = teclado.nextInt();
     
      System.out.println("Qual o valor do produto?: ");
       double d1 = teclado.nextDouble();
      
      if (s1 == 1) {
          
     double res =  d1 - d1*0.05 ;
     
           System.out.println("O valor do desconto eh:R$"+ res);    
      } else {
          
    double r = d1 - d1 * 0.13;
      
     System.out.println("O valor do desconto eh:R$"+ r);
//        
      }
       }
}
