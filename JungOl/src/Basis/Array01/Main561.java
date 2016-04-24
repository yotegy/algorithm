package Basis.Array01;

import java.util.Scanner;

public class Main561 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int low = 0;
		int high = 10000;
		
		for(int i=0;i<10;i++){
			
			int temp = in.nextInt();
				
			if( temp < 100){
				
				if(temp > low){
					low = temp;
				}
				
			}else{
				
				if(temp < high){
					high = temp;
				}
				
			}
					
		}
		
		if(low == 0) low = 100;
		if(high == 10000) high = 100;
		
		System.out.printf("%d %d", low,high);
		
		
		
		in.close();
		
	}

}
