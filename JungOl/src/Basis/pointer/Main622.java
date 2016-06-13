package Basis.pointer;

import java.util.Scanner;

public class Main622 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num[] = new int[5];
		
		for(int k=0;k<num.length;k++){
			
			num[k] = in.nextInt();
			
		}
		
		
		for(int k=0;k<num.length;k+=2){
			
			System.out.printf("%d ", num[k]);
			
		}
		
		
		in.close();
		
	}

}
