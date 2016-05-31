package Basis.Func03;

import java.util.Scanner;

public class Main587 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		showlist(num);
		
		in.close();
		
	}

	private static void showlist(int num) {
		// TODO Auto-generated method stub
		for(int i=0;i<num;i++){
			System.out.println("재귀함수");
		}
	}

}
