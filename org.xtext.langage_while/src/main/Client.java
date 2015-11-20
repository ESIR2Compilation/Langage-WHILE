package main;

import tests.*;

public class Client {
	
	public static void main(String[] args) {
		AbstractTest test = new BadFormatTest();
		String file1="badFile.txt";
		String file2="badFile.while";
		
		test.setEntry(file1);
		test.tester();
		System.out.println(test.genererRapport());
		
		test.setEntry(file2);
		test.tester();
		System.out.println(test.genererRapport());
	}

}
