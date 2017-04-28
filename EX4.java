package chapSixteentoTwenty;

import java.io.File;
import java.io.IOException;

/*
 * Write a program to create a file and write into it Which is given by user
 */

public class EX4 {
	public static void main(String[] args) 
	{
	File file=new File("D:\\java files\\text.txt");	
	
	try {
		//file.createNewFile();
		if(file.createNewFile()){
			System.out.println("File is created");
		}
		else{
			System.out.println("file is already their");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
