package Basis.String02;

import java.util.Scanner;

public class Main216 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String temp = "";
		
		char ch[];
		
		while(true){
			
			temp = in.next();
			
			if(temp.equals("END")) break;
			
			ch = temp.toCharArray();
			
			for(int k=ch.length-1;k>=0;k--){
				System.out.printf("%c", ch[k]);
			}
			System.out.println();
			
		}
		
		
	}

}
