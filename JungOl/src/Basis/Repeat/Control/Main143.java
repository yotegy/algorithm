package Basis.Repeat.Control;

import java.util.Scanner;

public class Main143 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int max = num*2 - 1;
		
		int array[][] = new int[max][max];
		
		for(int i=0;i<max;i++){
			for(int j=0;j<max;j++){
				
				if( i == j || (i+j) == ((num-1)*2) || (i<j && i< (max/2) && (i+j)<((num-1)*2) ) || (i>j && i> (max/2) && (i+j)>((num-1)*2)) ){
					array[i][j] = 1;
				}else{
					array[i][j] = 0;
				}
			}
		}
		
		
		for(int i=0;i<max;i++){
			for(int j=0;j<max;j++){
				
				if(array[i][j] == 1){
					System.out.printf("*");
				}else{
					System.out.printf(" ");
				}
				
				
			}
			System.out.println("");
		}
		
		
		in.close();

	}
}
