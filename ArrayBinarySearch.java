package basic;

public class ArrayBinarySearch {
  
	public static void main(String[] args) {
		
	//array must be in sorted
	//binary search -in sorted element we use divide by two logic.get mid value
	//compare search value with mid value
	 int arr[]= {1,2,3,4,5,6,7,8,9};
	 int binarySearch =8;
	 boolean flag=false;
	 int low=0;
	 int high=arr.length-1;
	 while (low<=high) {
		 int mid =(low+high)/2;
		 if (arr[mid]==binarySearch) {
			 System.out.println("elemnt found..");
			 flag=true;
			 break;
		 }
		 
		  if (arr[mid]<binarySearch) {
			 low=mid+1;
		 }
		  if (arr[mid]>binarySearch) {
			  high=mid-1;
		  }
			  
	 }
	 
	 if (flag==false) {
		 System.out.println("not found");
	 }
}	 
	 
}
