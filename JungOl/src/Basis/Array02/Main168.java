package Basis.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main168 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		int array[][] = new int[size][size];
		
		for(int i=0;i<size;i++) Arrays.fill(array[i], 0);
		
		array[0][0] = 1;
		
		for(int i=1;i<array.length;i++){
			
			for(int k=0;k<=i;k++){
				
				if(k == 0){
					array[i][k] = 1;
				}else{
					array[i][k] = array[i-1][k-1]+array[i-1][k];
				}
				
			}
			
		}
		
		for(int i = size-1;i>=0;i--){
			for(int k=0;k<size;k++){
				if(array[i][k] == 0) break;
				System.out.printf("%d ", array[i][k]);
			}
			System.out.println();
		}
		
		
		in.close();
	}

}
