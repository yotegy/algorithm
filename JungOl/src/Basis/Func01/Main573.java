package Basis.Func01;

import java.util.Scanner;

public class Main573 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		show(n);

		in.close();

	}

	public static void show(int num) {

		int n =1;
		
		for(int i=0;i<num;i++){
			for(int k=0;k<num;k++){
				
				System.out.printf("%d ", n++);
				
			}
			System.out.println();
		}

	}

}
