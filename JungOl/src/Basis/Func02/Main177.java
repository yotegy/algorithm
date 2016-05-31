package Basis.Func02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int array[] = new int[5];
		
		for(int i=0;i<5;i++){
			array[i] = in.nextInt();
		}
		
		int result = sum(array);
		
		System.out.println(result);
		
		in.close();
		
	}

	private static int sum(int[] array) {
		// TODO Auto-generated method stub
		
		int sum =0;
		
		for(int i=0;i<array.length;i++){
			
			sum += Math.abs(array[i]);
			
		}
		
		return sum;
	}

	

}
