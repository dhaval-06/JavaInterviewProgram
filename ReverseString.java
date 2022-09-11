package basic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hey";
		char rev ;
		String reverse="";
		for (int i=0;i<str.length();i++) {
			rev=str.charAt(i);
			reverse=rev+reverse;
		}
		System.out.println(reverse);
		
		
		String input = "Geeks for Geeks";
		  
        StringBuilder input1 = new StringBuilder();
  
        // append a string into StringBuilder input1
        input1.append(input);
  
        // reverse StringBuilder input1
        input1.reverse();
  
        // print reversed String
        System.out.println(input1);
		
        
        String inpu = "raju";
        
        // convert String to character array
        // by using toCharArray
        char[] try1 = inpu.toCharArray();
  
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);

	}
	
	
	

}
