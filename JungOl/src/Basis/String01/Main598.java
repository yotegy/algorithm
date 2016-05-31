package Basis.String01;

import java.util.Scanner;

public class Main598 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		
		while(true){
			
			char ch = in.next().charAt(0);
			
			if(ch >= 'A' && ch <= 'z' ){
				System.out.println(ch);
			}else if(ch >= '0' && ch <= '9' ){
				System.out.println(ch+0);
			}else{
				break;
			}
			
			
		}
		
		

		in.close();
		
		
	}
}
