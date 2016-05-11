package Exercise.recursive;

import java.util.Scanner;

public class Main1169 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int total = in.nextInt();
		int type = in.nextInt();

		int array[] = new int[total];

		if (type == 1) {

			for (int i = 1; i <= 6; i++) {
				type01(array, 0, i);
			}

		} else if (type == 2) {
			for (int i = 1; i <= 6; i++) {
				type02(array, 0, i);
			}

		} else if (type == 3) {

			for (int i = 1; i <= 6; i++) {
				type03(array, 0, i);
			}

		}

		in.close();

	}

	public static void type01(int array[], int po, int value) {

		array[po] = value;

		if (po == (array.length - 1)) {

			for (int i = 0; i < array.length; i++)
				System.out.printf("%d ", array[i]);

			System.out.println();
			return;
		}

		for (int k = 1; k <= 6; k++) {
			type01(array, po + 1, k);

		}

	}

	public static void type02(int array[], int po, int value) {
		
		array[po] = value;
		
		if (po == (array.length -1)) {

			for (int i = 0; i < array.length; i++)
				System.out.printf("%d ", array[i]);

			System.out.println();
			return;
		}
		
		for(int k=value;k<=6;k++){
			type02(array,po+1,k);
		}

	}

	public static void type03(int array[], int po, int value) {
		
		for(int k=0;k<po;k++){
			
			if(array[k] == value) {
				return;
			}
			
		}
		array[po] = value;
		
		if (po == (array.length-1)) {

			for (int i = 0; i < array.length; i++)
				System.out.printf("%d ", array[i]);

			System.out.println();
			return;
		}
		
		for(int k=1;k<=6;k++){
			type03(array,po+1,k);
		}
	}

}
