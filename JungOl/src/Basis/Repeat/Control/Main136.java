package Basis.Repeat.Control;

import java.util.Scanner;

public class Main136 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int sum = num;
		
		for(int i=0;i<10;i++){
			
			System.out.printf("%d ", sum);
			
			sum += num;
			
		}

	}
}
