package basic;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=564;
		int sum=0;
		int odd =0;
		
		while(num>0)
		{
			int reminder=num%10;
			sum=sum+reminder;
			num=num/10;
		}
		
       System.out.println(sum);
	}

}
