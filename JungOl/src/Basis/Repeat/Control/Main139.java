package Basis.Repeat.Control;

import java.util.Scanner;

public class Main139 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int start = in.nextInt();
		int end = in.nextInt();
	
		
		for(int i=1;i<=9;i++){
			
			
			if(start > end){
				for(int j=start;j>=end;j--){
					
					System.out.printf("%d * %d =%3d   ", j,i,(i*j));
					
				}
			}else{
				for(int j=start;j<=end;j++){
					
					System.out.printf("%d * %d =%3d   ", j,i,(i*j));
					
				}
			}
			System.out.println("");
		}

	}
}
