package Basis.basic;

import java.util.Scanner;

public class Main516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		double first = in.nextDouble();
		double second = in.nextDouble();
		String third = in.next();
		
		System.out.printf("%.2f\n",first);
		System.out.printf("%.2f\n",second);
		System.out.printf("%s", third);
		
		
	}

}


/*
     ���� = (ȭ��-32) x 0.55 ȭ�� = (���� x 1.8) + 32�̴�.
     ���� 21.6�Ƹ� ȭ���� ȭ�� 110.3�Ƹ� ������ ��ȯ�Ͽ� ���� ���Ŀ� ���߾� �Ҽ� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ͻÿ�.
     
     ����  21.6���� ȭ�� 70.9���̴�.
     ȭ�� 110.3���� ���� 43.1���̴�.
*/
