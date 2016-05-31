package Basis.Func03;

import java.util.Scanner;

public class Main236 {

	public static int cache[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int result = findnum(a*b*c);
		
		System.out.println(result);
		
		in.close();

	}

	private static int findnum(int i) {
		// TODO Auto-generated method stub
		
		if( i == 0 ) return 1;
		
		int a = i%10;
		if(a==0) a=1;
		
		return a*findnum(i/10);
		
	}


	
}
