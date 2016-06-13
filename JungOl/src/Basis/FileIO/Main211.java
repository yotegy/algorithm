package Basis.FileIO;

import java.util.Scanner;

public class Main211 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int first = in.nextInt();
		int second = in.nextInt();
		
		int count = 0;
		
		for(int k = first ; k<=second ; k++){
			
			if( (k%4 == 0  &&  k%100 != 0) || k%400 == 0){
				count++;
			}
			
		}
		
		System.out.println(count);
		
		in.close();
		
	}


}
