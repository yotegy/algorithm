package Basis.Select.Control;

import java.util.Scanner;

public class Main534 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String grade = in.next();
		
		switch(grade){
		case "A":
			System.out.println("매우잘함");
			break;
		case "B":
			System.out.println("잘함");
			break;
		case "C":
			System.out.println("보통임");
			break;
		case "D":
			System.out.println("노력요함");
			break;
		case "F":
			System.out.println("낙제");
			break;
		default:
			System.out.println("잘못입력");
		}
	
		
	}

}
