package basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//approach 1 using file reader
    FileReader fr = new FileReader("D:\\test.txt");
    BufferedReader br = new BufferedReader(fr);
    
    String str;
    while((str= br.readLine()) !=null) 
	    {
	    	System.out.println(str);
	    }
    br.close();
    
    
    //  approach 2  :use scanner and file
    
    File file = new File("D:\\test.txt");
    Scanner sc= new Scanner(file);
    
    
   /* while(sc.hasNextLine())
		    {
		    	System.out.println(sc.nextLine());
		    }
	}
	*/
    
	//approach 3 
	
	sc.useDelimiter("\\Z");
	System.out.println(sc.next());
	
	}
}
