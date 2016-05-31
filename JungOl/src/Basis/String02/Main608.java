package Basis.String02;

import java.util.Scanner;

public class Main608 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		int c = str.indexOf('c');
		int ab = str.indexOf("ab");
		
		if(c > -1 ) {
			System.out.printf("Yes ");
		}else{
			System.out.printf("No ");
		}
		
		if(ab > -1){
			System.out.printf("Yes");
		}else{
			System.out.printf("No");
		}
		
		in.close();
		
	}

}
