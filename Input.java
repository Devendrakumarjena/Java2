
import java.util.Scanner;

public class Input {

	private static final String Avg = null;

	public static void main(String[] args) {
		Input Mark= new Input();
		Scanner Marks= new Scanner(System.in);
		System.out.println("Enter the marks of class Xth=");
		int	m1 = Marks.nextInt();
		int	m2 = Marks.nextInt();
		int	m3 = Marks.nextInt();
		int	m4 = Marks.nextInt();
		int	m5 = Marks.nextInt();
       // Mark.Add(m1,m2,m3,m4,m5);
		int total= Mark.Add(m1,m2,m3,m4,m5);
		Mark.Avg(total);


	}

	private int Add(int m1,int m2, int m3 , int m4 , int m5 ) {
		int total= m1+m2+m3+m4 +m5;
		System.out.println("Total of Xth Mark = "+total );
		return total;
		
	}

	private int Avg(int total) {
		int avg=total/5;
		if(avg<80)
		{
			System.out.println("Passed with distinction congratulation ");
		}
		else if (avg>80 && avg<60)
		{
			System.out.println("You are pass with 1st class : ");
		}
		else
		{
			System.out.println("you have just passed : ");
		}
		System.out.println("Avg of Xth Mark =  " + avg );
		return avg;
	}

}