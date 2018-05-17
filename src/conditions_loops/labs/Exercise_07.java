package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

// HELP!

//
// while(expression){
//        //executable code
//        }


public class Exercise_07 {
    public static void main(String[] args) {
    // take a word from user and find first vowel.

        //input from user
        System.out.println("type a word.");

        // Scanner
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int length = word.length();
        int count = 0;
        char vowel = 0;

        while(count < length) {
            char c = word.charAt(count);

            switch (c) {
                case 'a':
                    vowel = 'a';
                    break;
                case 'e':
                    vowel = 'e';
                    break;
                case 'i':
                    vowel = 'i';
                    break;
                case 'o':
                    vowel = 'o';
                    break;
                case 'u':
                    vowel = 'u';
                    break;
                default:
                    vowel = 0;

            }

        }
        if (vowel == 0){
            System.out.println("No vowels present.");
        }
        else {
            System.out.println("first vowel is " + vowel);
        }

        System.out.println("Word is " + word);
    }
}