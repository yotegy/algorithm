package Basis.Select.Control;

import java.util.Scanner;

public class Main124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("1. 개");
		System.out.println("2. 고양이");
		System.out.println("3. 병아리");
		System.out.printf("영어로 알고 싶은 번호를 입력하세요. ");
		
		int a = in.nextInt();
		
		switch(a){
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
		}
		
	}

}
