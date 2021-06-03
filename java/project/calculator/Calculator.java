package calculator;
import java.util.Scanner;
//this is my java project about making a simple calculator app
// type by myself and copying from internet https://www.edureka.co/blog/java-programs/
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("input  two value:");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.println("input the operator that you want to do as math + - * /");
        char operator = reader.next().charAt(0);
        double result = 0;
        switch (operator){
            case '+':
                result = first+second;
            break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Errors system did not fined your ans \n check your input again pls ");
                return;
        }
        //printing the result of the operations
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
