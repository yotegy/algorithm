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
		
		System.out.printf("���� = %d\n",width);
		System.out.printf("���� = %d\n",height);
		System.out.printf("���� = %d\n",area);
		
		
	}

}
