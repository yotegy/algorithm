package Basis.Array01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main157 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int sum =0;
		int count =0;
		
		for(int i=0;i<100;i++){
			
			int temp = in.nextInt();
			if( temp == 0){
				break;
			}else if(temp%5 == 0){
				
				sum += temp;
				count++;
			}
			
		}
		
		float avg = 0.0f;
		
		avg = sum / (float)count;
		
		System.out.printf("5의 배수 : %d개\n",	count);
		System.out.printf("합계 : %d\n",sum);
		System.out.printf("평균 : %.1f", avg);
		
		in.close();
		
	}

}
