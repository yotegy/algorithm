package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main545 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int multiple_3 = 0;
		int multiple_5 = 0;
		
		for(int i =0;i<10;i++){
			
			int a = in.nextInt();
			
			if( a != 0){
				if(a % 3 == 0){
					multiple_3++;
				}
				
				if(a % 5 == 0){
					multiple_5++;
					
				}
			}
			
		}
		
		System.out.printf("3의 배수 : %d개\n", multiple_3);
		System.out.printf("5의 배수 : %d개", multiple_5);
		
	}

}
