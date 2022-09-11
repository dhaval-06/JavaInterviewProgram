package basic;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter First number:");
		int a= sc.nextInt();
		
		System.out.println("Enter Second number:");
		int b= sc.nextInt();
		

		System.out.println("Enter third number:");
		int c= sc.nextInt();
		
		int largest=a>b && a>c?a:(b>a && b>c?b:c);
		
		System.out.println(largest);

	}

}
