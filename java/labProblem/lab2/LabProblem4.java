
package labproblem4;

import java.util.Scanner;

public class LabProblem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10]; // Array of length 10;
        int number; 				// User input
        int flag = 0;			// Number of distinct numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < distinctNumbers.length; i++) {
            number = input.nextInt();
            if (isDistinct(distinctNumbers, number)) {
                distinctNumbers[flag] = number;
                flag++;	// Increment count
            }
        }
        System.out.println("The number of distinct numbers is " + flag);
        System.out.print("The distinct numbers are");
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] > 0)
                System.out.print(" " + distinctNumbers[i]);
        }
        System.out.println();
    }
    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }
}

