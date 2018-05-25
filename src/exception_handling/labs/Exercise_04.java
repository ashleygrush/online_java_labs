package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */


class ExceptionEx4 {
    public static void AssignArrFour(int symbol) {
        int i;
        int arrFour[] = new int[4];


        // try program
        try {
            switch (symbol) {
                case 0:
                    i = 4;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    return;
            }
        }
        // catch the issue
        catch ( ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of bounds.");
        }
    }
}

class ArrPrint {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++ ) {
            ExceptionEx4.AssignArrFour(i);
            System.out.println();
        }

    }
}