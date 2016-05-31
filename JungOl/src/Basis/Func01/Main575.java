package Basis.Func01;

import java.util.Scanner;

public class Main575 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		char op = in.next().charAt(0);
		int b = in.nextInt();

		if (op == '+') {
			plus(a, b);
		} else if (op == '-') {
			minus(a, b);
		} else if (op == '*') {
			multi(a, b);
		} else if (op == '/') {
			divide(a, b);
		} else {
			etc(a,b,op);
		}

		in.close();

	}

	private static void etc(int a, int b,char op) {
		// TODO Auto-generated method stub
		System.out.printf("%d %c %d = %d", a,op,b,0);
	}

	private static void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.printf("%d / %d = %d", a,b,(a/b));
	}

	private static void multi(int a, int b) {
		// TODO Auto-generated method stub
		System.out.printf("%d * %d = %d", a,b,(a*b));
	}

	private static void minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.printf("%d - %d = %d", a,b,(a-b));
	}

	private static void plus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.printf("%d + %d = %d", a,b,(a+b));
	}

}
