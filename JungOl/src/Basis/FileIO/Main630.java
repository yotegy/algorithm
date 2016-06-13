package Basis.FileIO;

import java.util.Scanner;

public class Main630 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		
		String temp = in.nextLine();
		
		String str[] = new String[num];
		
		for(int k=0;k<num;k++){
			
			str[k] = in.nextLine();
			
		}
		
		for(int k = (num-1);k>=0;k--){
			
			System.out.println(str[k]);
			
		}
		
		in.close();

	}

}
