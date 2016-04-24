package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main539 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		int sum = 0;
		float count = 0;
		
		
		while(true){
			
			a = in.nextInt();
			count += 1;			
			sum += a;
			
			if(a >= 100){
				break;
			}
			
		}
		
		System.out.println(sum);
		
		float avg = sum/count;
		
		avg = avg*10;
		float result = Math.round(avg);
		result = result/10.0f;
		
		System.out.println(result);

	}

}
