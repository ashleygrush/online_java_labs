package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

            int c = 1;
            while ( c <= 10){
                c++;
                if ( c == 5) {
                    continue;
                }System.out.println("c is " +c);
            }
        System.out.println("Program end.");
        ;
    }








}
