package io_examples_pkg;

/* Copy a file.
 * To use this program, specify the name of source file and destination file.
 * example, tocopy a file called FIRST.TXT to a file called SECOND.TXT, use
 * the following:-
  
    java CopyFile FIRST.TXT SECOND.TXT
    
 * */
import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		// First confirm both the files have been specified.
		if(args.length != 2) {
			System.out.println("Usage: Copying file from to");
			return;
		}
		
		// Copy a file
		try {
			// Attempt to open the files
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
			
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		} finally {
			try {
				if(fin != null) fin.close();
			} catch(IOException e) {
				System.out.println("Error closing input file.");
			}
			try {
				if(fout != null) fout.close();
			} catch(IOException e) {
				System.out.println("Error closing output file.");
			}
		}
	}

}
