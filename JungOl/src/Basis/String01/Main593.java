package Basis.String01;

import java.util.Scanner;

public class Main593 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		while(true){
			
			System.out.printf("아스키 코드 =? ");
			int num = in.nextInt();
			
			if(num >= 33 & num <= 127){
				char a = (char) (num);
				System.out.println(a);
				
			}else{
				break;
			}
			
		}
		
		
		
		in.close();
		
		
	}

}
