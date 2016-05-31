package Basis.String02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main603 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String array[] = str.split(" ");
		
		for(int k=0;k<array.length;k++){
			
			if(k%2 == 0) System.out.println(array[k]);
			
		}
		
		br.close();
		
	}

}
