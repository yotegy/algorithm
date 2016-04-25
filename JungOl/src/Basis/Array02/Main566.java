package Basis.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main566 {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		
		int startnumber = 100;
		
		System.out.printf("%d %d ", startnumber,number);
		
		int outnumber = startnumber - number;
		
		while(outnumber >-1){
			
			System.out.printf("%d ", outnumber);
			int temp = outnumber;
			outnumber = number - outnumber;
			number = temp;
			
		}
		
		System.out.printf("%d ", outnumber);
		

	}

}
