package Basis.Select.Control;

import java.util.Scanner;

public class Main632 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		float grade = in.nextFloat();
		
		int assess = ((int)(grade*10))/10;
		
		switch(assess){
		case 4:
			System.out.println("장학금을 받아가세요.");
			break;
		case  3:
			System.out.println("다음 학기를 준비하세요.");
			break;
		case 2:
			System.out.println("계절 학기에 등록하세요.");
			break;
		default:
			System.out.println("다음 학기에 재수강하세요.");
		}
		
	}

}
