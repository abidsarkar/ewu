import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        
        double y = input.nextDouble();
        boolean with_in_Circle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        System.out.println("Point (" + x + ", "+ y + ") is " +

                ((!with_in_Circle) ? "not in " : "in ") + "the circle");
    }
}
