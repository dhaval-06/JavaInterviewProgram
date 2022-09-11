package basic;

public class MaxandMinElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int a[]= {50,20,49,55,76,45,87};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
				a[i]=a[i-1];
				System.out.println( a[i]);
			}
		}
		
	}

}
