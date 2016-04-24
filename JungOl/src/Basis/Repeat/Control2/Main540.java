package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main540 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		while(true){
			
			a = in.nextInt();
			
			if( (a %3) == 0){
				System.out.println(a/3);
			}else if(a == -1){
				break;
			}
			
		}
		

	}

}
