package Basis.FileIO;

import java.util.Scanner;

public class Main209 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num[] = new int[1000];
		
		int po = 0;
		
		while( true ){
			
			int temp = in.nextInt();
			if(temp == 0) break;
			
			if(temp%3 ==0 && temp%5 == 0){
				
				num[po] = temp;
				po++;
			}
			
			
		}
		
		for(int k=0;k<po;k++){
			
			System.out.printf("%d ", num[k]);
			
		}
		if(po > 0 ) System.out.println("");
		System.out.printf("%d개", po);
		
		
		in.close();
		
	}



}
