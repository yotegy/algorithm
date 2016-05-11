package Basis.Array02;

import java.util.Scanner;

public class Main169 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		char array[][] = new char[3][5];

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 5; k++) {

				array[i][k] = in.next().toLowerCase().charAt(0);

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 5; k++) {
				System.out.printf("%c ", array[i][k]);

			}
			System.out.println();
		}

		in.close();
	}

}
