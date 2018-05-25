package exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 *
 *
 */

class ExceptionEx1 {
    static void ExcError() {
        int array[] = new int[4];
        array[4] = 6;
    }
}

class FixArray {
    public static void main(String[] args) {
        // try program
        try {
            ExceptionEx1.ExcError();
        }
            catch ( ArrayIndexOutOfBoundsException exc) {
                System.out.println("Out of bounds.");
            }
    }
}
