package Basis.String01;

import java.util.Scanner;

public class Main597 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		
		int sum = 0;
		sum = str1.length() + str2.length();
		
		System.out.println(sum);
		

		in.close();
		
		
	}
}
