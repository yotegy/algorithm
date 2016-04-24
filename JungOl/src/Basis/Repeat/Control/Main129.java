package Basis.Repeat.Control;

import java.util.Scanner;

public class Main129 {
	
	
	/*
	 * 밑변의 길이 = 11
		높이 = 5
		입력한 삼각형의 넓이는 27.5입니다.
		계속하시겠습니까? Y
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int baseline = 0;
		int height = 0;
		
		float area = 0;
		
		boolean pass = true;
		
		while(pass){
			
			System.out.printf("밑변의 길이 = ");
			baseline = in.nextInt();
			System.out.printf("높이 = ");
			height = in.nextInt();
			
			area = (baseline * height) /2.0f;
			
			System.out.printf("입력한 삼각형의 넓이는 %.1f입니다.\n",area);
			System.out.printf("계속하시겠습니까? ");
			
			String answer = in.next();
			
			if( answer.equals("Y") || answer.equals("y") ){
				// do nothing
			}else {
				pass = false;
			}
			
		}
	

	}
}
