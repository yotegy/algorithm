package Basis.Array02;

import java.util.Scanner;

public class Main164 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int array[][] = new int[4][3];
		
		
		
		for(int i=0;i<array.length;i++){
			System.out.printf("%d반? ", (i+1));
			for(int j =0;j<array[i].length;j++){
				
				array[i][j] = in.nextInt();				
				
			}
		}
		
		for(int k=0;k<array.length;k++){
			
			System.out.printf("%d반 : %d개\n", (k+1),array[k][0] + array[k][1] + array[k][2]);
			
		}
		
		
	}

}
