package Basis.Select.Control;

import java.util.Scanner;

public class Main534 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String grade = in.next();
		
		switch(grade){
		case "A":
			System.out.println("�ſ�����");
			break;
		case "B":
			System.out.println("����");
			break;
		case "C":
			System.out.println("������");
			break;
		case "D":
			System.out.println("��¿���");
			break;
		case "F":
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��Է�");
		}
	
		
	}

}
