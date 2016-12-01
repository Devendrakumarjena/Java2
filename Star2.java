package Practice;

public class Star2 {
	
	/* output
	 ****
	 ***
	 **
	 *
	 */

	public static void main(String[] args) {
		 for(int r=0;r<=4;r++)
		 {
			 for(int c=4;c>r;c--)
			 {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }

	}

}
