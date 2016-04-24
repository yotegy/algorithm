package Basis.Repeat.Control;

import java.util.Scanner;

public class Main144 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i = 1; i<=num;i++){
			
			for(int j=0;j< (num-i)*2;j++){
				System.out.printf(" ");
			}
			
			for(int k=0;k< (i*2)-1;k++){
				System.out.printf("*");
			}
			System.out.println("");
		}
		
		
		
		in.close();

	}
}
