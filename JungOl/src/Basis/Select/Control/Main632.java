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
			System.out.println("���б��� �޾ư�����.");
			break;
		case  3:
			System.out.println("���� �б⸦ �غ��ϼ���.");
			break;
		case 2:
			System.out.println("���� �б⿡ ����ϼ���.");
			break;
		default:
			System.out.println("���� �б⿡ ������ϼ���.");
		}
		
	}

}
