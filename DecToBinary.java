package converstion;

import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the No u Want to Convert :");
		/*int a=k.nextInt();
		System.out.println("The Binary Value is : "+Integer.toBinaryString(a));
		System.out.println("The hexdecimal value is :"+ Integer.toHexString(a));
		System.out.println("The Octal Value is : "+Integer.toOctalString(a));*/
		int a=0b101;
		int b=0b101;
		System.out.println("addtion is="+Integer.toString(a,b));
		
	}

}
