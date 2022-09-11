package basic;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {10,20,30,40,50};
         int search=55;
         boolean flag=false;
         for (int i=0;i<a.length;i++) {
        	 if (a[i]==search) {
        		 System.out.println("value found at "+i+" index");
        		 flag=true;
        		 break;
        	 }
         }
         if (flag==false)
         System.out.println("element not found");
	}

}
