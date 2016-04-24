package Basis.Repeat.Control;

import java.util.Scanner;

public class Main147 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int number = 1;
		
		for(int i = 0; i<num;i++){
			
			for(int j=0;j<i;j++){
				System.out.printf("  ");
			}
			
			
			for(int k=0;k< num-i;k++){
				System.out.printf("%d ",number++);
			}
			System.out.println("");
		}
		
		
		
		in.close();

	}
}
