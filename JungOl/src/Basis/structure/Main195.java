package Basis.structure;

import java.util.Scanner;

public class Main195 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		String tel = in.next();
		String addr = in.next();
		
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+tel);
		System.out.println("주소 : "+addr);
		
		
		in.close();
		
	}

}
