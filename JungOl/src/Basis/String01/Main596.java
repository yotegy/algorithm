package Basis.String01;

import java.util.Scanner;

public class Main596 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		int num = in.nextInt();
		
		int str_len = str.length();
		
		char words[] = str.toCharArray();
		
		for(int k=1;k<=num && k<=str_len ;k++){
			System.out.printf("%c", words[str_len-k]);
		}
		
		in.close();
		
		
	}
}
