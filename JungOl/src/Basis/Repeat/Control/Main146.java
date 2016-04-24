package Basis.Repeat.Control;

import java.util.Scanner;

public class Main146 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		char latter = 'A';
		int number = 0;
		
		for(int i = 1; i<=num;i++){
			
			for(int j=0;j<=(num-i);j++){
				System.out.printf("%c ",latter++);
			}
			
			
			for(int k=0;k< i-1;k++){
				System.out.printf("%d ",number++);
			}
			System.out.println("");
		}
		
		
		
		in.close();

	}
}
