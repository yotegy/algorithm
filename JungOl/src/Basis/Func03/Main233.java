package Basis.Func03;

import java.util.Scanner;

public class Main233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int total = in.nextInt();

		int array[] = new int[num];

		callfunc(0, array, total);

		in.close();

	}

	private static void callfunc(int po, int[] array, int total) {

		if (po == array.length && total == 0) {
			for (int i = 0; i < po; i++) {

				System.out.printf("%d ", array[i]);

			}
			System.out.println();
			return;
		}

		if (total <= 0) {
			return;
		}

		if((array.length - po) == 1 && total <= 6){
			array[po] = total;
			callfunc(po+1,array,0);
			
		}else{
		
			for (int k = 1; k <= 6 && k <= total; k++) {
	
				if ((total - k) > (array.length - po - 1) * 6) {
					// reduce 0.5 sec
					continue;
	
				} else if ((po + 1) <= array.length) {
					array[po] = k;
					callfunc(po + 1, array, total - k);
				}	else {
					break;
				}
	
			}
		}

	}

}
