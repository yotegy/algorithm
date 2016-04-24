package Basis.Array01;

import java.util.Scanner;

public class Main557 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		char array[] = new char[10];
		
		for(int i =0;i<10;i++){
			array[i] = in.next().charAt(0);
		}
		
		System.out.printf("%c %c %c",array[0],array[3],array[6]);
		
		in.close();
		
	}

}
