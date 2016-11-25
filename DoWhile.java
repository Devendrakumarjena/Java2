package Java;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = obj.nextInt();
	    do
	     {
	     System.out.println("Sample : " + n);
	     n--;
	     }while(n > 0);
	
	}

}
