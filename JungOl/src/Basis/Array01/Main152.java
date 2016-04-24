package Basis.Array01;

import java.util.Scanner;

public class Main152 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for(int i = 0;i<10;i++){
			
			array[i] = in.nextInt();
			
		}
		
		int odd_sum = 0;
		int even_sum = 0;
		
		for(int i=0;i<10;i=i+2){
			odd_sum += array[i];
		}
		
		for(int i=1;i<10;i=i+2){
			even_sum += array[i];
		}
		
		System.out.printf("È¦¼ö ¹øÂ° ÇÕ : %d\n", odd_sum);
		System.out.printf("Â¦¼ö ¹øÂ° ÇÕ : %d", even_sum);
		
		
		in.close();
		
	}

}
