package Basis.Repeat.Control;

import java.util.Scanner;

public class Main140 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int avg = 0;
		int i =0;
		
		for(i=0;i<20;i++){
			
			int temp = in.nextInt();
			
			if(temp == 0 ){
				break;
			}else{
			
				sum += temp;
				
			}			
			
		}
		
		avg = sum/i;
		
		System.out.printf("%d %d", sum,avg);
		
		
		in.close();

	}
}
