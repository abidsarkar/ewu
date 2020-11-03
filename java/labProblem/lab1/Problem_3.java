package problem_3;
import java.util.Scanner;
public class Problem_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("A =");
        Double A = input.nextDouble();
        System.out.println(" B =");
        Double B = input.nextDouble();
        System.out.println("C =");
        Double C = input.nextDouble();
        double math1,root1,root2;
        math1 = (int) ((int) Math.pow(B,0.5) - 4 * A * C);
        // condition for real and different roots
        if(math1 > 0)
        {          
            root1 = (-B + Math.sqrt(math1)) / (2 * A);
            root2 = (-B - Math.sqrt(math1)) / (2 * A);
            System.out.printf("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(math1 == 0) {
            root1 = -B / (2 * A);

            System.out.printf("root1 =  %.2f;", root1);
        }
        //The equation has no real roots
        else {
                System.out.print("Theequation has no real roots");
             }
    }
    
}
