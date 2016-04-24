package Basis.Operation;

import java.util.Scanner;

public class Main112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int result = a/b;
		int rest = a%b;
		
		System.out.printf("%d / %d = %d...%d", a,b,result,rest);
		
		
	}

}
