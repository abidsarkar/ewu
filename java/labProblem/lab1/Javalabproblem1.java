
package javalabproblem1;

import java.util.Scanner;

public class Javalabproblem1 {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       System.out.println("print the interger valu =");
       int integer = input.nextInt();
       if(integer % 2 == 0 && 0 == integer % 3)
       {
           System.out.println("False");
       }
       else if(integer % 3 == 0 )
       {
           System.out.println("true ");
       }
       else if(integer % 2 == 0)
       {
           System.out.println("true ");
       }
       else{System.out.println("False");}
       
    }
    
}
