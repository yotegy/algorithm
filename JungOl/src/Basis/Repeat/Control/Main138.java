package Basis.Repeat.Control;

import java.util.Scanner;

public class Main138 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				System.out.printf("(%d, %d) ", i,j);
				
			}
			
			System.out.println("");
		}

	}
}
