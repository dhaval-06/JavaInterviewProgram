package basic;

public class EvenAndOddNumberfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {2,3,6,0,3,7,8};
         int even=0;
        int odd =0;
        for (int value:a)
        {
          if(value%2==0) {
        	  even++;
          }
          else
        	  odd++;
        }
        
        System.out.println("even value"+even+" odd value "+odd);
	}

}
