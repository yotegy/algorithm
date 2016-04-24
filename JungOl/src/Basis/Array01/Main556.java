package Basis.Array01;

import java.util.Scanner;

public class Main556 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for(int i =0;i<10;i++){
			array[i] = i+1;
		}
		
		for(int k = 0;k<array.length;k++){
			System.out.printf("%d ", array[k]);
		}
		
		in.close();
		
	}

}
