package Basis.FileIO;

import java.util.Scanner;

public class Main631 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		float num[] = new float[100];

		int po = 0;

		while (in.hasNext()) {

			num[po] = in.nextFloat();
			po++;

		}

		for (int k = 0; k < po; k++) {
			findline(num[k]);
		}

		in.close();

	}

	public static void findline(float num) {

		float line = num / 3.14f / 2.0f;

		line = Math.round(line * 100) / 100f;

		System.out.printf("%.2f\n", line);

	}

}
