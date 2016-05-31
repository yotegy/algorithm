package Basis.String01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main601 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.trim();
		
		for(int k=0;k<str.length();k++){
			
			str = str.substring(str.length()-1,str.length())+str.substring(0,str.length()-1);
			System.out.println(str);
			
			
		}
		

		in.close();
		
		
	}
}
