package Basis.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main569 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int total = 5;
		int successor = 0;
		int avg = 0;
		int sum = 0;
		
		for(int i=0;i<total;i++){
			
			sum = 0;
			avg = 0;
			
			for(int j =0;j<4;j++){
				
				sum += in.nextInt();
				
			}
			
			avg = sum/4;
			if(avg >= 80){
				
				successor++;
				System.out.println("합격");
				
			}else{
				System.out.println("불합격");
			}
			
		}
		
		System.out.printf("합격자 %d명", successor);
		

	}

}
