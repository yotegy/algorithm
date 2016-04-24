package Basis.Repeat.Control;

import java.util.Scanner;

public class Main149 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int array[] = { 1,3,5,7,9};
		
		int position = 0;
		
		for(int i=0;i<num;i++){
			
			for(int j=0;j<num;j++){
				
				if(position == 5){
					position =0;
				}
				System.out.printf("%d ",array[position++]);
				
			}
			System.out.println("");
		}
		
		
		in.close();

	}
}
