package Basis.pointer;

import java.util.Arrays;
import java.util.Scanner;

public class Main204 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int total = in.nextInt();
		
		int num[] = new int[total];
		
		for(int k=0;k<total;k++){
			
			num[k] = in.nextInt();
			
		}
		
		Arrays.sort(num);
		
		System.out.println("최대값 : "+num[total-1]);
		System.out.println("최소값 : "+num[0]);
		
		
		
		in.close();
		
	}

}
