package io_examples_pkg;

// Display a text file.
// To use this program, specify the file name that you want to see.
// for example, to see a file called TEST.TXT, use the following command line
// java ShowFile TEST.TXT

import java.io.*;

public class ShowFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;

		// first, confirm the file name is entered in CL or not
		if(args.length != 1) {
			System.out.println("Usage: ShowFile Filename");
			return;
		}
		
		// Attempt to open the file
		/*try {
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException e) {
			System.out.println("Cannot open file.");
			return;
		}*/
		
		// At this point file is open and can be read
		try {
			fin = new FileInputStream(args[0]);
			do {
				i = fin.read();
				if(i != -1) System.out.print((char)i);
			} while(i != -1);
		} /*catch(FileNotFoundException e) {
			System.out.println("Cannot open file.");
		}*/ catch(IOException e) {
			System.out.println("I/O error: " + e);
		} finally {
			// closing the file.
			try {
				if(fin != null) fin.close();
			} catch(IOException e) {
				System.out.println("Error closing file.");
			}
		}
		
	}
}
