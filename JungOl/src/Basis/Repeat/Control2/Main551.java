package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main551 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		
		for(int i = 0;i<num;i++){
			
			for(int j = 0;j <i ;j++){
				System.out.printf(" ");
			}
			
			for(int k =i;k<num;k++){
				System.out.printf("*");
			}
			
			System.out.println("");
			
		}
		
		in.close();
		
	}

}
