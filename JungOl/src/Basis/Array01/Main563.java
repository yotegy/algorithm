package Basis.Array01;

import java.util.Arrays;
import java.util.Scanner;

public class Main563 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for(int i=0;i<10;i++){
			array[i] = in.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int a=array.length-1 ;a>=0;a--){
			System.out.printf("%d ", array[a]);
		}
		
	
		in.close();
		
	}

}
