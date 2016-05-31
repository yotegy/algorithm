package Basis.Func01;

import java.util.Scanner;

public class Main173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(getresult(a,b));

		in.close();

	}

	private static int getresult(int a, int b) {
		// TODO Auto-generated method stub
		
		if(a > b){
			
			return (int)(Math.pow(a, 2) - Math.pow(b, 2));
			
		}else{
			
			return (int)(Math.pow(b, 2) - Math.pow(a, 2));
			
		}
		
	}

	

}
