package basic;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();//235
        
        //logic 1 using algorithom
        
        int rev=0;
        while (num!=0) {
        	rev=rev*10+num%10;//  1.0*10+235%10 = 5  num=23   2. 5*10+23%10 = 50+3 =53 3.53*10+2%10 =530+2=532
        	num=num/10;
        }
        System.out.println("reverse number is "+rev);
        
        
        //logic 2 using string buffer class method
       
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer reverse=sb.reverse();
        System.out.println("reverse number is "+reverse);
        
        //LOGIC 3 using String builder
        
        StringBuilder sb1=new StringBuilder();
        sb1.append(num);
        StringBuilder reverse1= sb1.reverse();
        System.out.println(reverse1);
       
	}

}
