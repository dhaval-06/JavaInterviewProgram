package basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str= sc.next();
		String org_str=str;
		String rev="";
		for (int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if (rev.equals(org_str)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("no");
	}

}
