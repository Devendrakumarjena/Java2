
import java.util.Scanner;

public class Input {

	private static final String Avg = null;

	public static void main(String[] args) {
		Input Mark= new Input();
		Scanner Marks= new Scanner(System.in);
		System.out.println("Enter the marks of class Xth=");
		int	XthMarks = Marks.nextInt();
		int	XthMarks1 = Marks.nextInt();
		int	XthMarks11 = Marks.nextInt();
		int	XthMarks111 = Marks.nextInt();
		int	XthMarks1111 = Marks.nextInt();

		
		Mark.Add(XthMarks1111, XthMarks1111, XthMarks1111, XthMarks1111, XthMarks1111);
		Mark.Avg();


	}

	private int Add(int m1,int m2, int m3 , int m4 , int m5 ) {
		int total= m1+m2+m3+m4 +m5;
		System.out.println("Total of Xth Mark"+total );
		return total;
		
	}

	private float Avg() {
		int total( total, total, total, total, total);
		float avg=total/5;
		System.out.println("Avg of Xth Mark" + Avg );
		return avg;
	}

}