package basic;

public class FactorialOfNumber {
    public static void main(String[] args) {
		
    	int num=7;
    	int result=1;
    	while(num>0) {
    		result=result*num;
    		num--;
    	}
    	System.out.println(result);
	}
}
