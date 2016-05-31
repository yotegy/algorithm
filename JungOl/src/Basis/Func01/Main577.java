package Basis.Func01;

import java.util.Scanner;

public class Main577 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int array[] = new int[2];
		
		array[0] = in.nextInt();
		array[1] = in.nextInt();
		
		int temp;
				
		change(array);
		
		System.out.printf("%d %d", array[0],array[1]);
		
		
		in.close();
		
	}

	private static void change(int[] array) {
		// TODO Auto-generated method stub
		
		if(array[0] > array[1]){
			
			array[0] /=2;
			array[1] *=2;
			
			
		}else{
			array[0] *=2;
			array[1] /=2;
			
		}
		
		
	}
}
