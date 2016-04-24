package Basis.Repeat.Control;

import java.util.Scanner;

public class Main127 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		boolean pass = true;
		
		int sum =0;
		float avg = 0;
		float count = 0;
		
		while(pass){
			
			a = in.nextInt();
			
			if( a >= 0 && a <= 100 ){
				count += 1;
				sum += a;
			}else{
				pass = false;
			}
			
		}
	
		avg = sum / count;
		
		avg = avg*10;
		avg = Math.round(avg);
		avg = avg/10;
		
		System.out.printf("합계 : %d점\n",sum);
		System.out.printf("평균 : %.1f점",avg);

	}
}
