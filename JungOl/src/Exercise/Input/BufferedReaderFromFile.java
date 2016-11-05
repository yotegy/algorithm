package Exercise.Input;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderFromFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./src/Exercise/Input/test.txt"),"EUC-KR"));
		
		String out = br.readLine();
		
		System.out.println(out);
		
		br.close();
		

	}

}
