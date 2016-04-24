package Basis.Array01;

import java.util.Scanner;

public class Main151 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[5];
		
		for(int i = 0;i<5;i++){
			
			array[i] = in.nextInt();
			
		}
		
		System.out.println(array[0]+array[2]+array[4]);
		
		
		
		in.close();
		
	}

}
