package Home.practice;

 class Consturctor {
	
		   /*This is my default constructor. A constructor does
		    * not have a return type and it's name
		    * should exactly same as class name
		    */
	 Consturctor(){
		      System.out.println("Default constructor");
		   }
		   public void mymethod()
		   {
		      System.out.println("Void method of the class");
		   }
		   public static void main(String args[]){
			/* Creating object of class using default constructor
		         * (new NoteBook()) so default constructor would be 
		         * invoked 
		         */
			Consturctor obj = new Consturctor();
			obj.mymethod();
		   }
		}


