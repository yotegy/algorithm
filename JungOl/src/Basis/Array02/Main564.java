package Basis.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main564 {

	public static void main(String[] args) {
		
		/*
		 *  A 65
		 *  Z 90
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		
		boolean pass = true;
		
		int array[] = new int[90-65+1];
		
		Arrays.fill(array, 0);
		
		while(pass){
			
			char input = in.next().charAt(0);
			
			if(input < 65 || input > 90){
				pass = false;
			}else{
				
				array[input-65] += 1;
				
			}
			
		}
		
		for(int i=0;i<array.length;i++){
			
			if(array[i]>0){
				
				System.out.printf("%c : %d°³\n",(char)(i+65),array[i]);
			}
			
		}
		

	}

}
