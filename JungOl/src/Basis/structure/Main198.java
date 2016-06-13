package Basis.structure;

import java.util.Scanner;

public class Main198 {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("아버지의 키와 몸무게? ");
		int fa_height = in.nextInt();
		float fa_weight = in.nextFloat();
		
		System.out.printf("어머니의 키와 몸무게? ");
		int mo_height = in.nextInt();
		float mo_weight = in.nextFloat();
		
		
		int st_height = (fa_height+mo_height)/2 + 5;
		float st_weight = (fa_weight + mo_weight )/2.0f - 4.5f;
		
		
		System.out.printf("학생의 키 : %dcm\n",st_height);
		System.out.printf("학생의 몸무게 : %.1fkg\n",st_weight);
		
		in.close();
		
	}

}
