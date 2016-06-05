package Basis.structure;

import java.util.Scanner;

public class Main613 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		String school = in.next();
		int age = in.nextInt();
		
		
		System.out.printf("%s %d학년에 재학중인 %s입니다.",school,age,name);
		
		in.close();
		
		
	}

}
