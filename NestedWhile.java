package Practice.DevJava;

public class NestedWhile {

	public static void main(String[] args) {
		int a=1;
		
		while(a<=5)
		{
			int b=5;
			while(b>0)
			{
				
				System.out.print(b);
				b--;
			}
			System.out.println("  value of a : "+a);
			a++;
		}

	}

}
