package Basis.Repeat.Control;

import java.util.Scanner;

public class Main135 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int min = Math.min(a, b);
		int max = Math.max(a,b);
		
		int sum = 0;
		int count =0;
		float avg = 0;
		
		for(int i = min;i<=max;i++){
			if(i%3 == 0 || i%5 == 0){
				sum += i;
				count++;
			}
		}
		
		avg = ((float)sum) / ((float)count);
		avg = avg*10;
		
		avg = Math.round(avg);
		
		avg = avg/10.0f;
		
		System.out.printf("ÇÕ°è : %d\n", sum);
		System.out.printf("Æò±Õ : %.1f",avg);

	}
}
