package Basis.Repeat.Control;

import java.util.Scanner;

public class Main145 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i = 1; i<=num;i++){
			
			for(int j=0;j< (num-i);j++){
				System.out.printf("  ");
			}
			
			int number = 1;
			
			for(int k=0;k< i;k++){
				System.out.printf("%d ",number++);
			}
			System.out.println("");
		}
		
		
		
		in.close();

	}
}
