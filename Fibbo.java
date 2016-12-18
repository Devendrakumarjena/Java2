package Home.practice;

public class Fibbo {

	public static void main(String[] args) {
		
		int limit=5;
		long[] series=new long[limit];
		series[0]=0;
		series[1]=1;
		for(int i=2;i<limit;i++){
			series[i]=series[i-1]+series[i-2];
		}
			
	System.out.println("Fibbo series :" +limit);
	for(int i=1;i<limit;i++){
		System.out.println(series[i]+"");
	}

	}

}
