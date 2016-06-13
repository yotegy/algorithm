package Basis.structure;

import java.util.Scanner;

public class Main197 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x11 = in.nextInt();
		int y11 = in.nextInt();
		int x12 = in.nextInt();
		int y12 = in.nextInt();
		
		int x21 = in.nextInt();
		int y21 = in.nextInt();
		int x22 = in.nextInt();
		int y22 = in.nextInt();
		
		int fx1 = Math.min(x11, x21);
		int fy1 = Math.min(y11, y21);
		int fx2 = Math.max(x12, x22);
		int fy2 = Math.max(y12, y22);
		
		
		System.out.printf("%d %d %d %d", fx1,fy1,fx2,fy2);
		
		
		
		in.close();
		

	}

}
