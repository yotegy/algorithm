package Basis.Repeat.Control;

import java.util.Scanner;

public class Main131 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for(int i = min;i<=max;i++){
			System.out.printf("%d ", i);
		}
	

	}
}
