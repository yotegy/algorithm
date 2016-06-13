package Basis.pointer;

import java.util.Scanner;

public class Main624 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		
		int num = in.nextInt();
		
		float array[] = new float[num];
		
		float sum = 0;
		float avg = 0;
		
		for(int k=0;k<num;k++){
		
			float temp = in.nextFloat();
			array[k] =  (Math.round(temp*100))/100f;
			
			sum += array[k];
			
		}
		
		avg = sum/((float)num);
		
		for(int k=0;k<num;k++){
			
			System.out.printf("%.2f ", array[k]);
			
		}
		
		System.out.println("");
		System.out.printf("합계 : %.2f\n", sum);
		System.out.printf("평균 : %.2f", avg);
		
		in.close();
		
	}

}
