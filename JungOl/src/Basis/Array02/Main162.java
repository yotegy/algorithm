package Basis.Array02;

import java.util.Scanner;

public class Main162 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int array[] = new int[10];
		
		array[0] = in.nextInt();
		array[1] = in.nextInt();
		
		for(int i=2;i<10;i++){
			
			array[i] = (array[i-2]+array[i-1])%10;
		}

		for(int i=0;i<10;i++) System.out.printf("%d ",array[i]);
		
		
		in.close();

	}

}
