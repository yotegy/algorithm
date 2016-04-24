package self;

import java.util.Scanner;

public class fraction {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		
		int prime[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		
		for(int p=0 ;p< prime.length;p++){
			
			if(a%prime[p] ==0 && b%prime[p]==0){
				
				a /= prime[p];
				b /=prime[p];
				p--;
				
			}			
			
		}
		
		System.out.printf("%d / %d", a,b);
		
		
		
	}

}
