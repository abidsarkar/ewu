
package javalabproblem2;

import java.util.Scanner;

public class Javalabproblem2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input =");
        double minute = input.nextDouble();
        int year = (int) (minute / 525600);
        int xyz = (int) (minute % 525600);
        int day = xyz / 1440;
        /*System.out.printf("%f minutes is approximately ", minute);
        System.out.printf("%d years and ", year);
        System.out.printf("%d days", day);*/
        //the comment code is for multipal printf
        System.out.println(minute+"minutes is approximately "+year+ " year and " +day+"days");//one line prnit code
    }
    
}
