package Basis.Repeat.Control;

import java.util.Scanner;

public class Main142 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int i =0;
		
		for(i=0;i<num;i++){
			
			for(int j=0;j<=i;j++){
				System.out.printf("*");
			}
			
			System.out.println("");
			
		}
		
		i--;
		
		for(;i>0;i--){
			
			for(int j=0;j<i;j++){
				System.out.printf("*");
			}
			System.out.println("");
			
		}
		
		
		in.close();

	}
}
