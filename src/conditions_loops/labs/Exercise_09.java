package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        int a = 1;
        while (a <= 10){
            System.out.println("a is " + a);
        if (a == 5){
        break;
        }
        a++;
        }
        System.out.println("Break stopped at 5.");
    }


}
