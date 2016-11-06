package KOITP.SDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trimTest {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp[] = br.readLine().trim().split(" ");
		
		int status =0;
		
		for(int i=0;i<20;i++){
			
			status += Integer.parseInt(temp[i]);
			
		}
		
		System.out.println(status);
		

	}

}
