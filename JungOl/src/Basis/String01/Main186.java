package Basis.String01;

import java.util.Scanner;

public class Main186 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		String first = in.next();
		String second = in.next();
		
		if(first.length() > second.length()){
			System.out.println(first.length());
		}else{
			System.out.println(second.length());
		}
		
		
		in.close();

	}

}
