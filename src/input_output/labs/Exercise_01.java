package input_output.labs;
import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class CopyFile {
    public static void main(String[] args) throws IOException {

        // declare input and output streams
        BufferedInputStream fin = null;
        PrintWriter fout = null;
        FileInputStream fis;
        int i;

        // copy file
        try {
            fis = new FileInputStream("/Users/ashleyalmeida/desktop/FolderExample/file.txt");
            fin = new BufferedInputStream(fis);
            fout = new PrintWriter("/Users/ashleyalmeida/desktop/FolderExample/fileCopy.txt");
                do {
                    i = fin.read();
                    if (i != -1) fout.write(i);
                }
                while (i != -1);
        }

        catch (IOException exc) {
                System.out.println("I/O Error: " + exc);
        }

        // close connection
        finally {
                try {
                    if (fin != null)
                        fin.close();
                    if (fout != null)
                        fout.close();
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
        }
    }
}
