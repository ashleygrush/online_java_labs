package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class FileEncryption {
    public static void main(String[] args) throws IOException {

        // declare input and output streams
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        char c;

            // Open file and create destination file.
            try {
                inputStream = new BufferedReader(new FileReader("/Users/ashleyalmeida/desktop/FolderExample/file.txt"));
                outputStream = new PrintWriter(new FileWriter("/Users/ashleyalmeida/desktop/FolderExample/file_encryption.txt"));

                // Read file by character.
                do {
                    c = (char) inputStream.read();
                    System.out.println(c);
                } while (c != '.');
            }

            // encrypt file - change character.


            // close connection
            finally {
                if (inputStream != null)
                    inputStream.close();
                if (outputStream != null)
                    outputStream.close();
                System.out.println("File closed.");
            }
        }
    }