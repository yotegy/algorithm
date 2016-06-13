package Basis.FileIO;

import java.util.Scanner;

public class Main208 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		
		int result = findresult(a);
		
		System.out.println(result);
		
		in.close();
		
	}

	private static int findresult(int a) {
		
		if(a <= 1) return 1;

		return a * findresult(a-1);
		
	}
	

}
