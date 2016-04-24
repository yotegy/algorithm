package Basis.Array01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main158 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[100];
		int count =0;
		
		int i = 0;
		
		for(;i<100;i++){
			
			int temp = in.nextInt();
			if( temp == 0){
				break;
			}else if(temp%2 == 0){
				array[i] = temp/2;
			}else{
				array[i] = temp*2;
			}
			count++;
			
		}
		
		System.out.printf("%d°³\n",	count);
		
		for(int k=0;k<i;k++){
			System.out.printf("%d ", array[k]);
		}
		
		
		in.close();
		
	}

}
