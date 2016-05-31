package Basis.Func01;

import java.util.Scanner;

public class Main171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		
		sum(num);
		
		in.close();
		
	}

	private static void sum(int num) {
		// TODO Auto-generated method stub
		System.out.println(num*(num+1)/2);
	}


}
