package io_examples_pkg;

// A modified version of CopyFile using try-with-resources.
// Two files being managed by a single try statement.

import java.io.*;
public class CopyFile2 {

	public static void main(String[] args) {
		int i;
		
		if(args.length != 2) {
			System.out.println("Usage: CopyFile2 from to");
			return;
		}
		
		try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])) {
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("I/O error: " + e);
		}
		
	}

}
