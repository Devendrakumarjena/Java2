package Java;

import java.util.Scanner;

public class UsingSwitchCase {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 2 Values : ");
		int a=input.nextInt();
		
		
		do{//do statement is started
		int b=input.nextInt();
		
		System.out.println("What do u want do....");
		
		System.out.println("1.ADD 2.SUB 3.DIV  4.MULT  5.NOTHING ");
		
		int choice=input.nextInt();
		
		switch(choice)
		{
		case 1:
			int r=a+b;
			System.out.println("Ans"+r);
			break;
			
		case 2:
		int r2=a-b;
		System.out.println("Ans"+r2);
		break;
		
		case 3:
			int r3=a/b;
			System.out.println("Ans"+r3);
			break;
			
		case 4:
			int r4=a*b;
			System.out.println("Ans"+r4);
			break;
			
		case 5:
			System.out.println("exit");
			break;
		}

		System.out.println("do u want to cont...");
		System.out.println("1.YES 2.NO");
		int c=input.nextInt();
	}while(a==1);// do statement is ended
		
}}
