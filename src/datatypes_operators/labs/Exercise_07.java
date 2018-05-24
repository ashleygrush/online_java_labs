package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */


// how do i get it to print more than 1 row?

public class Exercise_07 {
    public static void main(String[] args) {

        int i, j;
        int irArry[][] = {
                {1, 2},
                {3, 4, 5},
                {6, 7},
                {8, 9, 10}
        };
//    for (i =0; i < irArry.length; i++ ){
//        for (j = 0; j < irArry.length; j++)
//            System.out.print(irArry[i][j] + " | ");
//        System.out.println();
//        }
//    }

        for (int[] arr : irArry) {
            for (int val : arr) {
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
