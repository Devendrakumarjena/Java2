package Practice.DevJava;

public class NestedWhile {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		while(a<=5)
		{
			while(b<=5)
			{
				System.out.println("value of b : "+b);
				b++;
			}
			System.out.println("value of a : "+a);
			a++;
		}

	}

}
