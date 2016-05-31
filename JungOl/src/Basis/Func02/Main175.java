package Basis.Func02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main175 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int array[] = new int[num];
		
		for(int i=0;i<num;i++){
			array[i] = in.nextInt();
		}
		
		arraysort(array);
		
		
		in.close();
		
	}

	private static void arraysort(int[] a) {
		// TODO Auto-generated method stub
		
		Integer array[] = new Integer[a.length];
		
		for(int i=0;i<a.length;i++){
			
			array[i] = a[i];
			
		}
		
		
		Arrays.sort(array,Collections.reverseOrder());
		
		for(int i=0;i<array.length;i++){
			
			System.out.printf("%d ", array[i]);
			
		}
		
		System.out.println();
		
	}

	

	

}
