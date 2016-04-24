package Basis.Repeat.Control;

import java.util.Scanner;

public class Main134 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int even = 0;   // Â¦¼ö
		int odd = 0;    // È¦¼ö
		
		int num = 0;
		
		for(int i =0;i<10;i++){
			
			num = in.nextInt();
			
			if(num%2 == 0){
				even++;
			}else{
				odd++;
			}
			
		}
		
		System.out.printf("Â¦¼ö : %d°³\n", even);
		System.out.printf("È¦¼ö : %d°³",odd);


	}
}
