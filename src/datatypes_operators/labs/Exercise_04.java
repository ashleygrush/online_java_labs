package datatypes_operators.labs;
import java.util.Scanner;
/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

// import and create scanner.
        Scanner scanner = new Scanner(System.in);

// prompt user for numbers.
        System.out.println("Enter a total of 10 random numbers below 100.");

// assign variables
        int[] arry = new int[10];
        int i;
        int sum = 0;
// create array: type [ ] = var-name;
        for (i = 0; i < 10; i++) {
            arry[i] = scanner.nextInt();
            sum = sum +arry[i];
        }
// print results
        for (i = 0; i < 10; i++) {
            System.out.print(arry[i] + " | ");
        }
// line break
        System.out.println();
// find the sum
        System.out.print("Sum is " + sum);
// line break
        System.out.println();
// find the average
        int average = sum/arry.length;
             System.out.print("Average is " + average);

    }
}



