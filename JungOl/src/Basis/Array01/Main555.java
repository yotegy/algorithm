package Basis.Array01;

import java.util.Scanner;

public class Main555 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		char array[] = new char[10];
		
		for(int i =0;i<10;i++){
			array[i] = in.next().charAt(0);
		}
		
		System.out.println(array);
		
		
		in.close();
		
	}

}
