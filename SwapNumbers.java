package basic;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=10,b=20;
			
			System.out.println("Original value "+a+ "  "+b);
			
			//logic 1 -third variable
			
			int t=a;
			a=b;
			b=t;
			
			
			//logic 2 use + and - without using third variable
			
			a=a+b;//10+20=30
			b=a-b;//30-20=10
			a=a-b;//30-10=20
			
			//logic 3 use * and /
			// here a and b value should not be zero
			a=a*b;//10*20=200
			b=a/b;//200/20=10
			a=a/b;//200/10=20
			
			//logic 4 - biwise xor operator(^)
			
			a=a^b;//30
			b=a^b;//10
			a=a^b;//20
			
			//logic 5 single statement
			//
			b=a+b-(a=b);
					
			System.out.println( "After swapping "+a+"  "+b);
			
	}

}
