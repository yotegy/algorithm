package Basis.Func03;

import java.util.Scanner;

public class Main235 {

	public static int cache[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
			
		int result = findnum(num);
		
		System.out.println(result);
		
		in.close();

	}

	private static int findnum(int num) {

		if(num == 1) return 0;
		
		if(num%2 == 0){
			
			return 1+findnum(num/2);
			
		}else{
			
			return 1+ findnum(num/3);
						
		}
		
	}

	
}
