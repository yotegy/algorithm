package Basis.FileIO;

import java.util.Scanner;

public class Main206 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.printf("%d %d...%d", a+b+c,(a+b+c)/3,(a+b+c)%3);
		
		
		
		in.close();
		
	}
	

}
