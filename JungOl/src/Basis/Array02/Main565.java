package Basis.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main565 {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		boolean pass = true;
		
		int array[] = new int[10];
		
		Arrays.fill(array, 0);
		
		while(pass){
			
			int input = in.nextInt();
			
			if(input == 0){
				pass = false;
			}else{
				
				array[(input/10)] += 1;
				
			}
			
		}
		
		for(int i=0;i<array.length;i++){
			
			if(array[i]>0){
				
				System.out.printf("%d : %d°³\n",i,array[i]);
			}
			
		}
		

	}

}
