package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main554 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int number = 1;
		
		char latter = 'A';
		
		
		for(int i = 0;i<num;i++){
			
			for(int k =0;k<(num-i);k++){
				System.out.printf("%d ",number++);
			}
			
			for(int j = 0;j<=i;j++){
				System.out.printf("%c ",latter++);
			}
			
			System.out.println("");
			
		}
		
		in.close();
		
	}

}
