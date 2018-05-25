package exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            System.out.println("Caught Arithmetic exception.");
        }
        try {
            int i = ThrowFive();
        }
        catch (ArithmeticException exci) {
            throw exci;
        }
    }

    public static int ThrowFive() throws ArithmeticException {
        throw new ArithmeticException();

    }
}