package Basis.FileIO;

import java.util.Scanner;

public class Main207 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int result = 0;
		
		char op = in.next().charAt(0);
		
		switch(op){
		
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		case '%':
			result = a%b;
			break;
		}
		
		System.out.printf("%d %c %d = %d", a,op,b,result);
		
		
		
		in.close();
		
	}
	

}
