package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main536 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		while(true){
			
			System.out.printf("정수를 입력하세요. ");
			a = in.nextInt();
			
			if(a > 0){
				System.out.println("양수입니다.");
			}else if(a < 0){
				System.out.println("음수입니다.");
			}else if(a == 0){
				break;
			}
			
			
		}

	}

}
