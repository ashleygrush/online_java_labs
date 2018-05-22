package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

// need to find multiplier??

class Exercise_06 {

    public static void main(String[] args) {
// create array (twoDArray)
        int[][] twoDArray = new int[5][5];

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
// array formula
                twoDArray[i][j] = i * (i*3);
            }
        }
// print to screen
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + "  ");
            }
            System.out.println();
        }


    }
}