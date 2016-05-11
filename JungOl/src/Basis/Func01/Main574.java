package Basis.Func01;

import java.util.Scanner;

public class Main574 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println(max(a,b,c));
		

		in.close();

	}

	public static int max(int a,int b,int c) {

		return Math.max(a, Math.max(b, c));

	}

}
