package Basis.Func03;

import java.util.Scanner;

public class Main590 {

	public static int num = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		num = in.nextInt();

		int array[] = new int[num];

		shownum(0, array);

		in.close();

	}

	private static void shownum(int position, int array[]) {
		// TODO Auto-generated method stub

		if (position == array.length) {

			for (int i = 0; i < array.length; i++) {
				System.out.printf("%d ", array[i]);
			}
			System.out.println();
			return;

		}

		int i = 1;
		
		if(position != 0) i = array[position-1];
		
		for (; i <= 6; i++) {
			
			array[position] = i;
			
			shownum(position+1,array);
			
		}

	}

}
