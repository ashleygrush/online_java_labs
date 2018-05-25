package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */


class ExceptionEx3 {
    public static void main(String[] args) {
        int x;
        int y = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 0-10.");

        int i = scanner.nextInt();

        // try program
        try {
            x = i/y;
        }
        // catch the issue
        catch ( ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of bounds.");
        }
        finally {
            System.out.println("enter a new number.");
        }
    }
}