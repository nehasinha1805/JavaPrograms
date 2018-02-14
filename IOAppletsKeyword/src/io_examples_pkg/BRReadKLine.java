package io_examples_pkg;

import java.io.*;

public class BRReadKLine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter line of text");
		System.out.println("Enter \"stop\" to exit.");
		do {
			str = br.readLine();
		} while(!str.equals("stop"));
	}

}
