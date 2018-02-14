package io_examples_pkg;


// using printwriter to print to console by passing System.out as outputStream Parameter
import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("This is a string.");
		int i = 10;
		double d = 4.5e-7;
		pw.println(i);
		pw.println(d);
	}

}
