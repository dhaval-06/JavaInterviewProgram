package basic;

import java.util.Random;

public class GeneraterandomNumberAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logic 1 -random
			Random radm= new Random();
			int radm_int=radm.nextInt(10);
			System.out.println(radm_int);
			
	    //logic 2 math class
			
			System.out.println(Math.random());
	
	   //logic 3 apache coomons-lang api
			
	//		RandomStringUtils.randomNumeric(2); contains two digit
	//		RandomStringUtils.randomAlphabetic(5);
			
	}

}
