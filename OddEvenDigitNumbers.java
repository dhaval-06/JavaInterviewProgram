package basic;

public class OddEvenDigitNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=456000789;
		int even=0;
		int odd =0;
		
		while(num>0)
		{
			int reminder=num%10;
			if (reminder%2==0|| reminder==0) {
				even++;
			}
			else {
			  odd++;
			}
			num=num/10;
		}
		
		
		System.out.println("even number is "+even +"  odd number is "+odd);
		
	

	}

}
