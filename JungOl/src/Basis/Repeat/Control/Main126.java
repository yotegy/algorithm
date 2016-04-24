package Basis.Repeat.Control;

import java.util.Scanner;

public class Main126 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		boolean pass = true;
		
		int even =0;
		int odd = 0;
		
		while(pass){
			
			a = in.nextInt();
			
			if(a == 0){
				pass = false;
			}else if( (a%2) == 0 ){
				even++;
			}else {
				odd++;
			}
			
		}
	
		
		System.out.printf("È¦¼ö : %d°³\n",odd);
		System.out.printf("Â¦¼ö : %d°³",even);

	}
}
