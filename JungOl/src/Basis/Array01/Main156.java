package Basis.Array01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main156 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[100];
		
		
		for(int k = 0;k<100;k++){
			array[k] = -1000;
		}
		
		int i =0;
		for(;i<100;i++){
			
			int temp = in.nextInt();
			if(temp == 999) break;
			
			array[i] =temp;
			
		}
		
		Arrays.sort(array);
		i--;
		System.out.printf("최대값 : %d\n", array[99]);
		System.out.printf("최소값 : %d", array[99-i]);
		
		in.close();
		
	}

}
