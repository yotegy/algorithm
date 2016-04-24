package Basis.Select.Control;

import java.util.Scanner;

public class Main123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int position = in.nextInt();
		
		System.out.println(month[position-1]);
		
	}

}
