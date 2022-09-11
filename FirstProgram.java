package basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Class of ReverseString
class FirstProgram {

	public static void main(String[] args) {
		
		int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
       
      
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i+=2) {     
        	temp=temp+1;
        	
        }    
        int[] arr1    = new int[temp];
           
        for (int i = 0; i < arr.length; i=i+2)
        {  
        	arr1[i/2] = arr[i];
        	System.out.print(arr1[i/2]);
        }
        //Sort the array in ascending order    
        for (int i = 0; i < arr1.length; i++) 
        {     
        	 for (int j = i+1; j < arr1.length; j++)
				 { 
					 if(arr1[i] < arr[j]) 
					 {
						 temp = arr1[i];
						 arr1[i] = arr1[j];
						 arr1[j] = temp; 
					 } 
				 }
			   
        }
          
       
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr1.length; i++) {     
            System.out.print(arr1[i] + " ");    
        }    
    }    
}