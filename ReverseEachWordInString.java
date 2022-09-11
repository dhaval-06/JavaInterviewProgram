package basic;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter string");
	    // Scanner sc= new Scanner(System.in);
	     String s="jav java";
	     
	     String[] words=s.split(" ");
	     
	     String reverseString="";
	     
	     for (String w:words) {
	    	 String reverseword="";
	    	 for (int i =w.length()-1;i>=0;i--) {//welcome
	    		 reverseword=reverseword+w.charAt(i);
	    	 }
	    	 reverseString=reverseString+reverseword+" ";
	     }
	     System.out.println(reverseString);
	     
	     //logic 2
	     
	     String str1="welcome to java";
	     String[] words1 =str1.split("\\s");
	     
	     String reverseword1="";
	     
	     for (String w1:words1) {
	    	 StringBuilder sb=new StringBuilder();
	    	 sb.append(w1);
	    	 sb.reverse();
	    	 
	    	 reverseword1=reverseword1+sb.toString()+" ";
	     }
	     System.out.println(reverseword1);
	}

}
