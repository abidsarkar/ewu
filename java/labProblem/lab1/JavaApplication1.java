/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class JavaApplication1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String  departmant;
        System.out.println(" Enter your name");
        String name = input.next();
        System.out.println("Inter your age");
        int age = input.nextInt();
        System.out.println("Inter your CGPA");
        double cgpa = input.nextDouble();
        input.nextLine();
        System.out.println("Enter your Departmant");
        //String  departmant;
        //departmant = intput.nextLine();
        departmant = input.
        System.out.printf("your Name : %s \n",name);
        System.out.printf("your Age: %d \n", age);
        System.out.printf("CGPA %f \n", cgpa);
        System.out.printf("Your Departmant : %s \n", departmant);
        
    }
    
}
