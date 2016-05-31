package Basis.Func03;

import java.util.Scanner;

public class Main589 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int sum = calsum(num);
		
		System.out.println(sum);
		
		in.close();
		
	}

	private static int calsum(int num) {
		// TODO Auto-generated method stub
		
		if(num == 0){
			return 0;
		}
		
		return num + calsum(num-1);
		
		
	}

	

}
