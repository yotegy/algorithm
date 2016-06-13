package Basis.pointer;

import java.util.Scanner;

public class Main203 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		
		for(int k=0;k<10;k++){
			
			if(in.nextInt() %2 == 0 ){
				even++;
			}else{
				odd++;
			}
				
			
		}
		
		System.out.println("홀수 : "+odd+"개");
		System.out.println("짝수 : "+even+"개");
		
		
		
		in.close();
		
	}

}
