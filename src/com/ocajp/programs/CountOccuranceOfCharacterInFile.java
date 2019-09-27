package com.ocajp.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CountOccuranceOfCharacterInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";
	     try {
		    FileWriter fileWriter = new FileWriter("c:/temp/samplefile2.txt");
		    fileWriter.write(fileContent);
		    fileWriter.close();
		System.out.println("done ");
		
		System.out.println("reading file  ");
		
		
		File f=new File("c:/temp/samplefile2.txt");     //Creation of File Descriptor for input file
	      FileReader fr=new FileReader(f);   //Creation of File Reader object
	      BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
	      int c = 0;             
	      while((c = br.read()) != -1)         //Read char by Char
	      {
	            char character = (char) c;          //converting integer to char
	            System.out.print(character);        //Display the Character
	      }
		
		
	     }catch(Exception e) {
	    	 
	     }
	}

}
