package Basis.Repeat.Control;

import java.util.Scanner;

public class Main133 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		
		float sum =0;
		
		float avg = 0;
		
		
		for(int i =0;i<count;i++){
			
			int temp = in.nextInt();
			sum += temp;
			
		}
		
		avg = ((float)sum)/((float)count);
		avg = avg*100;
		avg = Math.round(avg);
		avg = avg/100f;
	
		System.out.println(avg);

	}
}
