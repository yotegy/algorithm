package Basis.Repeat.Control;

import java.util.Scanner;

public class Main132 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		int sum =0;
		
		if( a >= 5 ){
			
			for(int i =5;i<=a;i =i+5){
				sum += i;
			}
			
		}
	
		System.out.println(sum);

	}
}
