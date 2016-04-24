package Basis.Array01;

import java.util.Scanner;

public class Main559 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		float array[] = {85.6f ,79.5f, 83.1f, 80.0f, 78.2f, 75.0f};
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		float sum = 0.0f;
		
		sum = array[a-1]+array[b-1];
		
		System.out.printf("%.1f",sum);
		
		in.close();
		
	}

}
