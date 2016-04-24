package Basis.Repeat.Control;

import java.util.Scanner;

public class Main128 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		boolean pass = true;
		
		int count = 0;
		
		while(pass){
			
			a = in.nextInt();
			
			if( a == 0 ){
				pass = false;
			}else if( a%3 != 0 && a%5 !=0 ){
				count += 1;
			}
			
		}
	
		System.out.printf("%d",count);

	}
}
