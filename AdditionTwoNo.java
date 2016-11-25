package Java;

import java.util.Scanner;

public class AdditionTwoNo {
	private static final int d = 0;

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in); 

		int d= obj.nextInt();
		
		System.out.println("Enter the 2 value " );
		
		int a = obj.nextInt();
		while(choice==1){
		int b = obj.nextInt();
		
		System.out.println("what you want to do");
		System.out.print("1.ADD");
		System.out.print("2.SUBTRACTION");
		System.out.print("3.DIVISION");
		System.out.println("4.MULTIPICATION");
		System.out.println("Enter choice ");
		
		int result;
		int choice=obj.nextInt();
		if(choice==1)
		{
			result=a+b;
			System.out.println("Ans : "+result);
		}
		else if(choice==2)
		{
			result=a-b;
			System.out.println("Ans : "+result);
		}
		else if(choice==3)
		{
			result=a/b;
			System.out.println("Ans : "+result);
		}
		else
		{
			result=a*b;
			System.out.println("Ans : "+result);
		}

	System.out.println("Do You Want to CONT...... ");
	
	System.out.println("1.Yes");
	System.out.println("2.No ");
		}
		}
		}
		
	
	
