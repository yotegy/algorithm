package Support;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateDataInt {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		
		
		FileOutputStream fos = new FileOutputStream("testInput.txt",false);
		
		for(int i =0;i<number;i++){
			
			int temp = (int)(Math.random()*10000);
			
			
			
			String space = temp+" ";
			
			fos.write(space.getBytes());
			
		}
		
		fos.close();
		
		in.close();

	}

}
