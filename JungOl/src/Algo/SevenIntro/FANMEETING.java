package Algo.SevenIntro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FANMEETING {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("src/Algo/SevenIntro/FANMETTING.txt");
		
		Scanner in = new Scanner(fs);
		
		int problem = in.nextInt();
		
		for(int num = 0; num<problem ; num++){
			
			char actor[] = (in.next()).toCharArray();
			char fan[] = (in.next()).toCharArray();
			
			
			
			
		}
		
		
		in.close();
		fs.close();
		
	}

}
