package basic;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0;
		int two =1;
		int total=0;
		System.out.print( "Fibonaci "+ first +","+two);
		while (total<700)
			{
			total=first+two;
		    first=two;
		    two=total;
		    System.out.print( ","+total);
			}
		
	}

}
