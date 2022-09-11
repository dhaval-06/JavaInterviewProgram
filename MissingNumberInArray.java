package basic;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no duplicate
		//no need to be sorted
		//value should be in range
				int a[] = {1,4,2,5};
				
				int sum1=0;
				for (int i=0;i<a.length;i++) {
					sum1=sum1+a[i];
				}
				int sum2=0;
				
				for (int i=1;i<=5;i++) //min value and max value
				{
					sum2=sum2+i;
				}
				
				System.out.println("missing value is "+ (sum2-sum1));
	}

}
