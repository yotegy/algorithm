package Basis.Array01;

import java.util.Scanner;

public class Main562 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for(int i=0;i<10;i++){
			array[i] = in.nextInt();
		}
		
		int even_sum = 0;
		int odd_sum = 0;
		float odd_avg = 0;
		
		for(int i=1;i<10;i=i+2){
			even_sum += array[i];
		}
		
		for(int i=0;i<10;i=i+2){
			odd_sum += array[i];
		}
		
		odd_avg = ((float)odd_sum) / 5.0f * 10;
		
		odd_avg = Math.round(odd_avg);
		
		odd_avg = odd_avg/10.0f;
		
		System.out.printf("Â¦¼ö¹øÂ° ÇÕ : %d\n",even_sum);
		System.out.printf("È¦¼ö¹øÂ° Æò±Õ : %.1f",odd_avg);
	
		in.close();
		
	}

}
