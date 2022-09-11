package basic;

import java.util.LinkedHashSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String arr[]= {"java","c","java","python"};
         
         
        		 LinkedHashSet<String> set
                 = new LinkedHashSet<String>();
      
             // adding elements to LinkedHashSet
             for (int i = 0; i < arr.length; i++)
                 set.add(arr[i]);
      
             // Print the elements of LinkedHashSet
             System.out.print(set);
        	 }
        
	}

