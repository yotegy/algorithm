package Basis.String02;

import java.util.Arrays;
import java.util.Scanner;

public class Main610 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str[] = new String[5];
		
		for(int i=0;i<str.length;i++){
			str[i] = in.next();
		}
		
		Arrays.sort(str);
		
		
		for(int i=str.length-1;i>=0;i--){
			System.out.println(str[i]);
		}
		
		
		in.close();
		
	}

}
