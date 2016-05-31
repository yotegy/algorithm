package Basis.String02;

import java.util.Scanner;

public class Main607 {

	public static void main(String[] args) {

		Scanner  in = new Scanner(System.in);
		
		String fix = in.next();
		
		String str = in.next();
		
		String prefix = fix.substring(0, 2);
		str = str.substring(2, str.length());
		
		System.out.println(prefix+str+prefix);
		
		
		in.close();
		
	}

}
