
package problem_4;

import java.util.Scanner;

public class Problem_4 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        float USD, TAkA;
        int option;
        option = input.nextInt();
        /*switch (option)
                {
                    case 0:
                        USD = input.nextFloat();
                        TAkA = USD *(float) 84.75;
                        System.out.printf("Taka = %.2lf", TAkA);
                        break;
                    case 1:
                        TAkA = input.nextFloat();
                        USD = TAkA * (float)0.012;
                        System.out.printf("USD = %.2lf",USD);
                        break;
                }*/
        if(option == 0) {
            USD = input.nextFloat();
            float TAkA1 = USD * (float) 84.75;
            System.out.printf("Taka = %.2lf", TAkA1);
        }
        else if(option == 1)
        {
            TAkA = input.nextFloat();
            float USD1 = TAkA * (float)0.012;
            System.out.printf("USD = %.2lf",USD1);
        }
        else {System.out.printf(" Invlade");}
    }
    
}