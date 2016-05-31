package Basis.Func01;

import java.util.Scanner;

public class Main174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int array[][] = new int[3][3];
		
		for(int i=0;i<3;i++){
			
			for(int k=0;k<3;k++){
				array[i][k] = in.nextInt();
			}
		}
		
		show(array);

		in.close();

	}

	private static void show(int[][] array) {
		// TODO Auto-generated method stub
		int result[] = new int[3];
		
		for(int i=0;i<3;i++){
			
			int sum = 0;
			for(int k=0;k<3;k++){
				
				System.out.printf("%d ", array[i][k]);
				
				sum += array[i][k];
				
				result[k] += array[i][k];
				
			}
			System.out.println(sum);						
			
		}
		
		int sum =0;
		for(int k=0;k<3;k++){
			System.out.printf("%d ", result[k]);
			sum += result[k];
		}
		System.out.println(sum);
		
		
		
		
	}



}
