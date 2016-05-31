package Basis.Func02;

import java.util.Scanner;

public class Main179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float array[] = new float[3];
		
		for(int i=0;i<3;i++){
			
			array[i] = in.nextFloat();
			
		}
		
		showAvg(array);
		
		
		in.close();
		
	}

	private static void showAvg(float[] array) {
		// TODO Auto-generated method stub
		
		float sum = 0;
		
		for(int i=0;i<array.length;i++){
			
			sum += array[i];
			
		}
		
		System.out.println((int)Math.round(sum/array.length));
		
		
		sum = 0;
		for(int i=0;i<array.length;i++){
			
			sum += Math.round(array[i]);
			
		}
		
		System.out.println((int)Math.round(sum/array.length));
		
		
		
	}

	
	

}
