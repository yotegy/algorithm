package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main634 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		for(int i=0;i<a;i++){
			
			for(int j = 0;j<=i;j++){
				System.out.printf("*");
			}
			
			System.out.println("");
			
		}
		
		in.close();

	}

}
