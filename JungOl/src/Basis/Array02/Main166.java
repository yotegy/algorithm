package Basis.Array02;

import java.util.Scanner;

public class Main166 {

	public static void main(String[] args) {
		
		int first[][] = new int[2][3];
		int second[][] = new int[2][3];
		
		int result[][] = new int[2][3];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫 번째 배열 입력");
		for(int i = 0;i<2;i++){
			for(int k=0;k<3;k++){
				first[i][k] = in.nextInt();
			}
		}
		
		System.out.println("두 번째 배열 입력");
		for(int i = 0;i<2;i++){
			for(int k=0;k<3;k++){
				second[i][k] = in.nextInt();
			}
		}
		
		
		for(int i = 0;i<2;i++){
			for(int k=0;k<3;k++){
				result[i][k] = first[i][k]*second[i][k];
			}
		}
		
		for(int i = 0;i<2;i++){
			for(int k=0;k<3;k++){
				System.out.printf("%d ", result[i][k]);
			}
			System.out.println();
		}
	}

}
