package Basis.Func03;

import java.util.Scanner;

public class Main592 {

	public static int num = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		num = in.nextInt();
			
		System.out.println(findnum(num));

		in.close();

	}

	private static int findnum(int num) {

		if(num%10 == 0) return num*num;
		
		return (int)Math.pow((num%10), 2) + findnum(num/10);
	
	}

	

}
