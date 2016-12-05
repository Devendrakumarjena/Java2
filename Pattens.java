 Practice;

public class Pattens {

	public static void main(String[] args) {
		
		/* output
		     *
		    ***
		   *****
		  *******
		   *****
		    ***
		     *
		 */
		
		int noOfcol=1;
		int noofs=3;
		for(int i=1;i<=7;i++)
			{
				for(int j=1;j<=noofs;j++)
				{
					System.out.print(" ");
				}
		if(i<4)
			{
			noofs=noofs-1;
			}
			else 
				{
				noofs=noofs+1;
				}
			for(int j=1;j<=noOfcol;j++)
			{
				System.out.print("");				
				System.out.print("*");
			}	
				
			
			System.out.println();
			if(i<4)
			{
			noOfcol=noOfcol+2;
			}
			else
			{
				noOfcol=noOfcol-2;
			}
			
			
		}
			
		

	}

}
