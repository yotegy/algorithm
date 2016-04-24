package Basis.Array01;

import java.util.Scanner;

public class Main150 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		char ch[] = new char[10];
		
		for(int i=0;i<10;i++){
			
			ch[i] = in.next().charAt(0);
			
		}
		
		for(int t = 9 ; t>=0;t--){
			System.out.printf("%c ",ch[t]);
		}
		
		in.close();
		
	}

}
