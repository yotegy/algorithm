package Basis.String01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main188 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String array[] = str.split(" ");
		
		
		for(int i=1;i<=array.length;i++){
			
			System.out.println(i+". "+array[i-1]);
			
		}
		
		
		br.close();
		
	}

}
