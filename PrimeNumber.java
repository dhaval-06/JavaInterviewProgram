package basic;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int prime=3;
			int count=0;
			if (prime>1) {
			for (int i=2;i<prime;i++) {
				if(prime%i==0)
				{
					count++;
				}
			}
			
			if (count>0) System.out.println("not prime");
			else System.out.println("prime number");
			}
			else
			{
				System.out.println( "not prime number");
			}
	}

}
