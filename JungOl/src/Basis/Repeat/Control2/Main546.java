package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main546 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		float sum = 0;
		
		for(int i = 0;i<num;i++){
			
			float temp = in.nextInt();
			sum += temp;
			
		}
		
		float avg = sum / (float) num;
		
		avg = avg*10;
		avg = Math.round(avg);
		avg = avg/10;
		
		System.out.printf("평균 : %.1f\n", avg);
		if(avg >= 80.0f){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		
	}

}
