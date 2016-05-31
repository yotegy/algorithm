package Basis.Func03;

import java.util.Scanner;

public class Main591 {

	public static int num = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		num = in.nextInt();

		int result = findnum(num);
		
		System.out.println(result);

		in.close();

	}

	private static int findnum(int num) {

		if(num == 1) return 1;
		
		return findnum(num/2)+findnum(num-1);
		
	}

}
