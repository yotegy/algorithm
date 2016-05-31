package Basis.Func02;

import java.util.Scanner;

public class Main585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for(int i=0;i<array.length;i++){
			
			array[i] = in.nextInt();
			
		}
		
		bubblesort(array);
		
		
		in.close();
		
	}

	private static void bubblesort(int[] array) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<9;i++){
			
			
			for(int k=0 ; k<9-i;k++){
				
				int temp = 0;
				
				if(array[k] < array[k+1]){
					
					temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
					
				}
				
			}
			
			showresult(array);
			
			
		}
		
	}

	private static void showresult(int[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++){
			
			System.out.printf("%d ", array[i]);
			
		}
		
		System.out.println();
	}

	

}
