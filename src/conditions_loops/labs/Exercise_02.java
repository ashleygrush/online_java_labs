package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.println("Enter a number between 1 and 7.");

        // assign int to variable
        int x = scanner.nextInt();

        // body of code
        if (x == 1) {
            System.out.println("Monday");
        }
        if (x == 2) {
            System.out.println("Tuesday");
        }
        if (x == 3) {
            System.out.println("Wednesday");
        }
        if (x == 4) {
            System.out.println("Thursday");
        }
        if (x == 5) {
            System.out.println("Friday");
        }
        if (x == 6) {
            System.out.println("Saturday");
        }
        if (x == 7) {
            System.out.println("Sunday");
        }
        if (x >= 8) {
            System.out.println("other");
            }
    }
}

