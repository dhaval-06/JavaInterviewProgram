package basic;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hig45%%";
		s=s.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(s);

	}

}
