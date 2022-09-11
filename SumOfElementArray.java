package basic;

public class SumOfElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr = {1,2,3,4,5};
		int sum=0;
		for (int i=0;i<arr.length;i++) // for (int value :arr){sum=sum+value}
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
