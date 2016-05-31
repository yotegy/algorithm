package Basis.String01;

import java.util.Scanner;

public class Main185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		String str = in.next();
		char ch = in.next().charAt(0);

		int position = findFirstIndex(str, ch);

		if (position < 0) {
			System.out.println("No");
		} else {
			System.out.println(position);
		}
		
		str.indexOf(ch);

		in.close();

	}

	private static int findFirstIndex(String str, char ch) {

		char array[] = str.toCharArray();

		for (int k = 0; k < array.length; k++) {

			if (ch == array[k])
				return k;

		}

		return -1;
	}

}
