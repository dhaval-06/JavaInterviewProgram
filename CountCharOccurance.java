package basic;

public class CountCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="Java Programming language";
			int totalcount=s.length();//total length
			int removedCount=s.replace("a","").length();//total length after removing a
			
			System.out.println("number of occurace of a is "+ (totalcount-removedCount));
			
	}

}
