package Basis.Array02;

import java.util.Arrays;

public class Main570 {

	public static void main(String[] args) {
		
		
		int array[][] = new int[5][5];
		
		for(int k=0;k<5;k++) Arrays.fill(array[k], 1);
		
		
		for(int i=1;i<5;i++){
			
			for(int j=1;j<5;j++){
				
				array[i][j] = array[i][j-1]+array[i-1][j];
				
			}
			
		}
		
		
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				
				System.out.printf("%d ", array[i][j]);
				
			}
			System.out.println("");
			
		}
		
		

	}

}
