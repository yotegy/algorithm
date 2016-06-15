package Basis.FileIO;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main214 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String input[] = new String[10];
		String output[] = new String[10];
		int count = 0;
		
		Arrays.fill(output, "z");
		
		for(int i=0;i<10;i++){
			input[i] = in.next();
		}
		
		char index = in.next().charAt(0);
		
		
		for(int i = 0;i<10;i++){
			
			if(input[i].contains(""+index)){
				output[count] = input[i];
				count++;
			}
			
		}
		
		Arrays.sort(output);
	
		for(int k = 0;k<count;k++){
			
			System.out.println(output[k]);
			
		}
		
		
		in.close();
		
	}

}
