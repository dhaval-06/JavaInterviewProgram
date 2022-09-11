package basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataIntoTextFile {

	public static void main(String[] args) throws IOException {
			
		
		FileWriter fw = new FileWriter("D:\\test.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("hi there");
		bw.write("hi there u are");
		
		System.out.println("Finished!..");
		bw.close();
	}

}
