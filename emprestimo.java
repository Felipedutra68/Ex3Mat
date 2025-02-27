package Ex3Mat;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class emprestimo {
    
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);

     System.out.println("Digite o seu salario:");
       double n1 = teclado.nextDouble();  
       System.out.println("Digite o valor da casa:");
       double c1 = teclado.nextDouble();  
       System.out.println("Digitew em quamtos anos voce deseja pagar a casa:");
       double a1 = teclado.nextDouble();  
     
       double s1 = n1*0.3;
       double va = c1/(a1*12);
       
       if (s1 >= va) {
       System.out.println("O emprestimo foi aprovado");
       } else {      
       System.out.println("O emprestimo foi negado");  
       
           
       }
       
    }
}
