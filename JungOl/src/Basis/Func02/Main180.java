package Basis.Func02;

import java.util.Scanner;

public class Main180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int array[] = new int[7];
		
		for(int i=0;i<array.length;i++){
			
			array[i] = in.nextInt();
			
		}
		
		showResult(array);
		
		
		in.close();
		
	}

	private static void showResult(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++){
			for(int k=0;k<array.length-1;k++){
				if(array[k] > array[k+1]){
					int temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
			}
		}
		
		for(int i=0;i<array.length;i++){
			
			System.out.printf("%d ", array[i]);
			
		}
		System.out.println();
		
		
	}

	

	
	

}
