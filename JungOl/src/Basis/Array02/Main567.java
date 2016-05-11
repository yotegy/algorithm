package Basis.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main567 {

	public static void main(String[] args) {
		
		
		int array[][] = {
				{5,8,10,6,4},
				{11,20,1,13,2},
				{7,9,14,22,3}		
		};
		
		for(int i = 0;i<array.length;i++){
			
			for(int j =0;j<array[i].length;j++){
				
				System.out.printf("%2d   ", array[i][j]);
				
			}
			System.out.println("");
			
		}
		
		

	}

}
