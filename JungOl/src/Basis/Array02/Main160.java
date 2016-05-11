package Basis.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main160 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int dice[] = new int[6];
		
		Arrays.fill(dice, 0);
		
		for(int i =0;i<10;i++){
			
			int temp = in.nextInt();
			
			dice[temp-1]++;
			
		}

		
		for(int i=0;i<6;i++){
			System.out.printf("%d : %d¹ø\n",(i+1),dice[i]);
		}
		

	}

}
