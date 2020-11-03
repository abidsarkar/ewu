/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproblem2;

/**
 *
 * @author USER
 */
import java.util.Random;
//import java.util.Scanner;

public class labProblem2 {
    public static void main (String[] args) {
        int j,i,value1 = 0, value2 = 0;
        //Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int[][] array = new int[4][4];
        for( i = 0; i<array.length; i++){
            for( j = 0; j<array[i].length; j++){
                //array[i][j] = input.nextInt();
                int random0and1 = rand.nextInt(2);
                array[i][j] = random0and1;
            }
            //System.out.println(array[i][j]);
        }
        for( i = 0; i<array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                //array[i][j] = input.nextInt();
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
        int max = 0;
         for( i = 0; i<array.length; i++) {
            int counter = 0;
            for (j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    counter++;
                }
            }
            if(counter > max){
                value1 = i;
            }
            max = counter;
        }
        System.out.println("the largest row index is "+value1);
        for( j = 0; j<4; j++) {
            int counter = 0;
            for (i = 0; i < 4; i++) {
                if (array[i][j] == 1) {
                    counter++;
                }
            }
            if(counter > max){
                value2 = j;
            }
            max = counter;
        }
        System.out.println("the largest Column index is "+value2);
    }
}

