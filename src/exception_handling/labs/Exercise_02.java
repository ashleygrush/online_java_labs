package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class ExceptionEx2 {
    public static void main(String[] args) {
        int array[] = new int[4];

        int i = 0;
        int x = 3;
        int y = 0;

        // try program
        try {
            array[4] = 5;
            i = x/y;
        }
        // catch the issue
        catch ( ArithmeticException exc1 ) {
            System.out.println("Arithmetic exception: " + exc1.toString());
        }
        catch ( ArrayIndexOutOfBoundsException exc2 ) {
            System.out.println("Out of bounds.");
        }
        catch ( java.lang.Exception e ) {
            System.out.println(e.getMessage());
      }

    }
}
