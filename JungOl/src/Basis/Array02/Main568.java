package Basis.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main568 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int first[][] = new int[2][4];
		int second[][] = new int[2][4];
		
		System.out.println("첫 번째 배열");
		for(int i=0;i<2;i++){
			for(int j =0;j<4;j++){
				
				first[i][j] = in.nextInt();
				
			}
		}
		
		System.out.println("두 번째 배열");
		for(int i=0;i<2;i++){
			for(int j =0;j<4;j++){
				
				second[i][j] = in.nextInt();
				
			}
		}
		
		for(int i=0;i<2;i++){
			for(int j =0;j<4;j++){
				
				System.out.printf("%d ", first[i][j]*second[i][j]);
				
			}
			System.out.println("");
		}
		

	}

}
