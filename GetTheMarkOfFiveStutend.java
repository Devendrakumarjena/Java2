import java.util.Scanner;

public class GetTheMarkOfFiveStutend {

	 
	public static void main(String[] args) {
		
	GetTheMarkOfFiveStutend Mark=new GetTheMarkOfFiveStutend();// new object is created as Mark
	System.out.println("Please Enter the no of Student to get Mark =");
	Scanner stud=new Scanner(System.in);// to get the input from the user in stud 
	int studStudent=stud.nextInt();
	System.out.println("Enter the mark of 1st Student :");
	Scanner stud1=new Scanner(System.in); // getting the value from user into the system using stud1
	int studStudent1=stud.nextInt();
	
	
	int m1 = stud.nextInt();
	int m2 = stud.nextInt();
	int m3 = stud.nextInt();
	int m4 = stud.nextInt();
	int m5 = stud.nextInt();
	
	
	int total=Mark.add(m1,m2,m3,m4,m5);
	
	System.out.println("%% " +Mark.Avg(total));
	
	System.out.println("Now enter the mark of 2nd student ");
	Scanner stud2=new Scanner(System.in);
	int studStudent2=stud.nextInt();
	int m11 = stud.nextInt();
	int m22 = stud.nextInt();
	int m33 = stud.nextInt();
	int m44 = stud.nextInt();
	int m55 = stud.nextInt();
	
	// total2=Mark.add(m1,m2,m3,m4,m5);
	System.out.println("2nd"+ Mark.add(m1,m2,m3,m4,m5));
	System.out.println("%% " +Mark.Avg(total));
	
	
	System.out.println("Now enter the mark of 3th student "+total);
	Scanner stud3=new Scanner(System.in);
	int studStudent3=stud.nextInt();
	int m111 = stud.nextInt();
	int m222 = stud.nextInt();
	int m333 = stud.nextInt();
	int m444 = stud.nextInt();
	int m555 = stud.nextInt();
	
	int total3=Mark.add(m1,m2,m3,m4,m5);
	
	System.out.println("%% " +Mark.Avg(total3));
	
	System.out.println("Now enter the mark of 4th student " + total3);
	Scanner stud4=new Scanner(System.in);
	int studStudent4=stud.nextInt();
	int m1111 = stud.nextInt();
	int m2222 = stud.nextInt();
	int m3333 = stud.nextInt();
	int m4444 = stud.nextInt();
	int m5555 = stud.nextInt();
	
    int total4=Mark.add(m1,m2,m3,m4,m5);
	
	System.out.println("%% " +Mark.Avg(total4));
	
	System.out.println("Now enter the mark of 5th student "+total4);
	Scanner stud5=new Scanner(System.in);
	int studStudent5=stud.nextInt();
	int m11111 = stud.nextInt();
	int m22222 = stud.nextInt();
	int m33333 = stud.nextInt();
	int m44444 = stud.nextInt();
	int m55555 = stud.nextInt();
	
	int total5=Mark.add(m1,m2,m3,m4,m5);
	
	System.out.println("%% " +Mark.Avg(total5));
	
	}

		

	private int Avg(int total) {
		
		int avg1 = total/5;
		
		return avg1;
	}

	private int add(int m1,int m2, int m3 , int m4 ,int m5) {
		
		int total=m1+m2+m3+m4+m5;
		
		System.out.println("The total mark is = " + total);
		
		return total;
	}

}
