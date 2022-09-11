package basic;

import java.util.Arrays;

public class ArrayEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3};
		int b[] = {1,2,3};
		
		
		//logic 1
		
		boolean status= Arrays.equals(a,b);
		if (status==true) {
			System.out.println("equal");
		}
		else
			System.out.println("Not Equal");
	
	//logic 2
	boolean status1=true;
	if(a.length==b.length) {
		
		for (int i=0;i<a.length;i++) {
			if (a[i]!=b[i]) {
			status1=false;	
			}
			
		}
	}
	else
		System.out.println("Not Equal");
	
	
	if (status1==true) {
		System.out.println("equal");
	}
	else
		System.out.println("Not Equal");
}
}
