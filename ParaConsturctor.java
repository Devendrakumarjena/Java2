package Home.practice;

 class ParaConsturctor {
		   //Default constructor
	 ParaConsturctor(){
		      System.out.println("Default constructor");
		   }
		   /* Parameterized constructor with 
		    * two integer arguments
		    */
	 ParaConsturctor(int i, int j){
		      System.out.print("parameterized constructor");
		      System.out.println(" with Two parameters");
		   }
		   /* Parameterized constructor with 
		    * three integer arguments
		    */
	 ParaConsturctor(int i, int j, int k){
		      System.out.print("parameterized constructor");
		      System.out.println(" with Three parameters");
		   }
		   public static void main(String args[]){
		      //This will invoke default constructor
		      ParaConsturctor obj = new ParaConsturctor();
		      /* This will invoke the constructor 
		       * with two arguments
		       */
		      ParaConsturctor obj2 = new ParaConsturctor(12, 12);
		      /* This will invoke the constructor 
		       * with three arguments
		       */
		      ParaConsturctor obj3 = new ParaConsturctor(1, 2, 13);		
		   }
		}


