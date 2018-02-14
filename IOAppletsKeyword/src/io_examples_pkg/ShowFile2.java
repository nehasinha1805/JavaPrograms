package io_examples_pkg;

//A modified version of ShowFile using try with resources.
import java.io.*;

public class ShowFile2 {

	public static void main(String[] args) {
		int i;
		
		if(args.length != 1) {
			System.out.println("Usage: ShowFile2 filename");
			return;
		}
		//int i = 0;
		try(FileInputStream fin = new FileInputStream(args[0])) {
	
			do {
				i = fin.read();
				if(i != -1) System.out.print((char)i);
			} while(i != -1);
			
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}

}
