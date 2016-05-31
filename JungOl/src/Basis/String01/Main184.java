package Basis.String01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main184 {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		char word[] = str.toCharArray();
		
		for(int k =0;k<word.length;k++){
			
			
			if( (word[k] >= 48 && word[k] <= 57) ||
					(word[k] >= 'A' && word[k] <= 'Z') ||
					(word[k] >= 'a' && word[k] <= 'z')){
				
				String temp = ""+word[k];
				
				System.out.printf("%s", temp.toLowerCase());
			}
			
			
		}
		System.out.println();
	
		
		br.close();
	}

}
