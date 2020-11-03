package labproblem3;

import java.util.Scanner;

public class LabProblem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the String:");
        String value = input.nextLine();
        String value2 = "";
        System.out.println(value);
        int length = value.length();
        System.out.println(length);
        for(int i = value.length()-1; i>= 0; i--){
            value2= value2 + value.charAt(i);
        }
        System.out.println("print the pelindrom value: "+value2);
        if(value.equals(value2)){
            System.out.println("Sting is a palindrome");
        }
        else {
            System.out.println("String is not a Palindrome");
        }

    }
    
}
