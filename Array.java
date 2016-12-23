package Home.practice;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		char Chara;
		Scanner ObjChar=new Scanner(System.in);
		
		System.out.println("Enter the words: ");
		Chara = ObjChar.next().charAt(0);
		
		if(Chara== 'a' || Chara=='A' ||Chara=='e'||Chara=='E'||Chara=='i'||Chara=='I'||Chara=='u'||Chara=='U')
		{
			System.out.println("Its a vowel: ");
		}
		else
		{
			System.out.println("not a vowel: ");
		}
	}

}
