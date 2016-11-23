import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		int studentCount=0;
		
		
		
		{
		int SubjectCount=0;
		
		studentCount=studentCount+1;
		
		String StudentName;
		Scanner studN=new Scanner(System.in);
		System.out.println("Enter the Name of student : ");
		String Name=studN.nextLine();
		
		System.out.println("Enter the Marks : ");
		
		int m1 = studN.nextInt();
		int m2 = studN.nextInt();
		int m3 = studN.nextInt();
		int m4 = studN.nextInt();
		int m5 = studN.nextInt();
		
		
		
		StudentMark mark=new StudentMark();
		
		int total=mark.add(m1, m2, m3, m4, m5);
		
		System.out.println("Total mark:= "+mark.add(m1, m2, m3, m4, m5));
	    System.out.println("persentage %"+ mark.Avg(total));
		}while(studentCount<=5);

	}

	private float Avg(int total) {
		
		
		float avg=total/5;
		return avg;
	}

	private int add(int m1, int m2, int m3, int m4,int m5 ) {
		int total=m1+m2+m3+m4+m5;
		return total;
		
	}

}
