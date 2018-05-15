package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 */

// How do I correctly find the sum??

public class Exercise_05 {
    public static void main(String[] args) {

        // scanner
        Scanner in = new Scanner(System.in);

        // prompt user for input
        System.out.println("Enter two numbers.");

        // translate user input
        int x = 0;
        int y = 0;
        int sum;

        x = in.nextInt();
        y = in.nextInt();

        sum = x + y;

 // Option 1
 /**
        int z = x + y;
        float average = z/2;

        // compute the factorial of the numbers through 5
        int sum = 0;
        for (int i = z; i <= 100; i++) sum += i;

*/
 // Option 2
 /**
        for (sum; sum <= 100000 ; sum++) {
            sum +=;
            float av *= sum;
        }
*/
            System.out.println("The sum is " + sum);
            System.out.println("The average is ..... FIX ME!!");
    }
}