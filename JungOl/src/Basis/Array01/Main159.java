package Basis.Array01;

import java.util.Arrays;
import java.util.Scanner;

public class Main159 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		
		int array[] = new int[count];
		
		for(int i=0;i<array.length;i++){
			
			array[i] = in.nextInt();
			
		}
		
		Arrays.sort(array);
		
		for(int k=(count-1);k>=0;k--){
			
			System.out.println(array[k]);
			
		}
		
		in.close();
		
	}

}
