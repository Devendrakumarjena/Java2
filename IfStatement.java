import java.util.Scanner;

public class IfStatement {
	
	    public static void main(String[] args) {

	        Scanner obj = new Scanner(System.in);
	        
	        System.out.println("Enter your Marks = ");
	        int m1 = obj.nextInt();

	        char grade;
			if (m1 >= 90) {
	            grade = 'A';
	        } else if (m1 >= 80) {
	            grade = 'B';
	        } else if (m1 >= 70) {
	            grade = 'C';
	        } else if (m1 >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("Grade = " + grade);
	    }
	}


