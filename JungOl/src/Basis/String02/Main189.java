package Basis.String02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main189 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String array[] = str.split(" ");
		
		for(int k=(array.length-1);k>=0;k--){
			
			System.out.println(array[k]);
			
		}
		
		br.close();
		
	}

}
