/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproblem1;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class labProblem1 {
      public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student:");
        int number = input.nextInt();
        System.out.println();
        int [] Scores;
        Scores = new int[number];
        System.out.println("Enter "+number+" Scores:");
        //take input the total number
        for(int i = 0; i<Scores.length; i++)
        {
            Scores[i] = input.nextInt();
        }
        //find the best
        int best = 0;
        for (int score : Scores) {
            if (score > best) {
                best = score;
            }
        }
        System.out.println(best);
        for(int i = 0; i<Scores.length; i++){
            if(Scores[i] < (best-40)) {
                System.out.println("Student " + i + " Score is " + Scores[i] + " and Grade is D");
            }
            else if((best-30) >= Scores[i]  )  {
                System.out.println("Student " + i + " Score is " + Scores[i] + " and Grade is C");
            }
            else if((best-20) >= Scores[i])  {
                System.out.println("Student " + i + " Score is " + Scores[i] + " and Grade is B");
            }
            else if((best-10) >= Scores[i] )  {
                System.out.println("Student " + i + " Score is " + Scores[i] + " and Grade is A");
            }
            else {
                System.out.println("Grade is F ");
            }
        }
    }
}
