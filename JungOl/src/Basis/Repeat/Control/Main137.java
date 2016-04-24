package Basis.Repeat.Control;

import java.util.Scanner;

public class Main137 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int column = in.nextInt();
		int line = in.nextInt();
		
		for(int i =1;i<=column;i++){
			for(int j=1;j<=line;j++){
				System.out.printf("%d ",i*j);
			}
			System.out.println("");
		}

	}
}
