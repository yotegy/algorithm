package Basis.pointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main625 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int total = in.nextInt();
		
		Integer num[] = new Integer[total];
		
		for(int k=0;k<total;k++){
			
			num[k] = in.nextInt();
			
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		
		for(int k=0;k<total;k++){
			
			System.out.printf("%d ", num[k]);
		}
		
		
		in.close();
		
		
	}

}
