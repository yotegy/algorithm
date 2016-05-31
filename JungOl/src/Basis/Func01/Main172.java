package Basis.Func01;

import java.util.Scanner;

public class Main172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		drawing(num);

		in.close();

	}

	private static void drawing(int num) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= num; i++) {

			for (int k = 1; k <= num; k++) {

				System.out.printf("%d ", i * k);

			}
			System.out.println();
		}

	}

}
