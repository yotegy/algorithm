package Basis.Repeat.Control;

import java.util.Scanner;

public class Main141 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int i =1;
		
		while(num*i < 100){
			
			System.out.printf("%d ", num*i);
			
			if((num*i)%10 == 0){
				break;
			}
			
			i++;
		}
		
		
		in.close();

	}
}
