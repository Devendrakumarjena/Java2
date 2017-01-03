package Home.practice;

public class Exception {

	public static void main(String[] args) {
		int i=5;
		int j=0;
		
		try{
		int k=i/j;
		System.out.println(k);
		
		}
	   catch(ArithmeticException e)
	{
			System.out.println("Can't be divided by 0");
		}
	
	}
	

}
