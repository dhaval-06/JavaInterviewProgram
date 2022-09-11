package basic;

import java.util.Arrays;
import java.util.Collection;

public class ArraySortingBuiltIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//approach 1		
		int a[]= {10,5,45,34};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
				//aproach 2
		
		Arrays.sort(a);
		//Arrays.parallelSort(a,Collection.reverseOrder()); primitive not supported.We can use Integer insted of int
	}

}
