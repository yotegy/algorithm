package Basis.basic;

import java.util.Scanner;

public class Main110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("�� �ߵ����� �Է��Ͻÿ�. ");
		
		double a = in.nextDouble();
		double b = a*91.44f;
		
		
		
		System.out.printf("%.1f�ߵ� = %.1fcm", a,b);
		
	}

}


/*
     ���� = (ȭ��-32) x 0.55 ȭ�� = (���� x 1.8) + 32�̴�.
     ���� 21.6�Ƹ� ȭ���� ȭ�� 110.3�Ƹ� ������ ��ȯ�Ͽ� ���� ���Ŀ� ���߾� �Ҽ� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ͻÿ�.
     
     ����  21.6���� ȭ�� 70.9���̴�.
     ȭ�� 110.3���� ���� 43.1���̴�.
*/
