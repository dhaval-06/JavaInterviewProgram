package basic;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,6,4,1};
		int n=a.length;
		for (int i=0;i<n-1;i++) {//number of passes 5 elemt present then loop will jhappen 5 time
			for (int j=0;j<n-1;j++) {   //iteration is each passes
		       
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}

			}
		System.out.println(Arrays.toString(a));
		}
}
