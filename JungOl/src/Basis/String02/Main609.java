package Basis.String02;

import java.util.Arrays;
import java.util.Scanner;

public class Main609 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str[] = new String[3];
		
		for(int i=0;i<str.length;i++){
			str[i] = in.next();
		}
		
		Arrays.sort(str);
		
		System.out.println(str[0]);
		
		in.close();
		
	}

}
