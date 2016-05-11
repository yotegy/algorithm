package Basis.Array02;

import java.util.Scanner;

public class Main167 {

	public static void main(String[] args) {
		
		int result[][] = new int[4][2];
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0;i<4;i++){
			for(int k=0;k<2;k++){
				result[i][k] = in.nextInt();
			}
		}
		
		System.out.printf("가로평균 ");
		for(int i = 0;i<4;i++){
			System.out.printf("%d ", (result[i][0] + result[i][1])/2);
		}
		System.out.println();
		
		System.out.printf("세로평균 ");
		for(int i = 0;i<2;i++){
			System.out.printf("%d ", (result[0][i] + result[1][i] + result[2][i] + result[3][i])/4);
		}
		System.out.println();
		
		System.out.printf("전체평균 ");
		int sum = 0;
		for(int i = 0;i<4;i++){
			for(int k =0;k<2;k++){
				sum += result[i][k];
			}
		}
		System.out.println(sum/8);
		
	}

}
