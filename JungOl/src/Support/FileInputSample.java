package Support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputSample {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("./resource/FileInput_JumpGame.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		Scanner in = new Scanner(fis);
		
		int problem = in.nextInt();
		
		for(int i =0; i<problem;i++){
			
			int line = in.nextInt();
			
			int array[][] = new int[line][line];
			
			for(int k = 0;k<line ;k++){
				
				for(int c=0;c<line;c++){
					
					array[k][c] = in.nextInt();
					
				}
				
			}
			
			System.out.println(" "+(i+1)+" problem");
			
			for(int k = 0;k<line ;k++){
				
				for(int c=0;c<line;c++){
					
					System.out.printf("%d ", array[k][c]);
					
				}
				System.out.println("");
				
			}
			
		}
		
		in.close();
		fis.close();
		

	}

}
