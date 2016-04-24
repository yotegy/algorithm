package Basis.Operation;

import java.util.Scanner;

public class Main113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int width = in.nextInt();
		int height = in.nextInt();
		
		width +=5;
		height *=2;
		
		int area = width*height;
		
		System.out.printf("가로 = %d\n",width);
		System.out.printf("세로 = %d\n",height);
		System.out.printf("넓이 = %d\n",area);
		
		
	}

}
