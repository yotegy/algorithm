package Basis.basic;

import java.util.Scanner;

public class Main517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		float first = in.nextFloat();
		float second = in.nextFloat();
		double third = in.nextDouble();
		
		System.out.printf("%.3f\n",first);
		System.out.printf("%.3f\n",second);
		System.out.printf("%.3f", third);
		
		
	}

}


/*
     ���� = (ȭ��-32) x 0.55 ȭ�� = (���� x 1.8) + 32�̴�.
     ���� 21.6�Ƹ� ȭ���� ȭ�� 110.3�Ƹ� ������ ��ȯ�Ͽ� ���� ���Ŀ� ���߾� �Ҽ� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ͻÿ�.
     
     ����  21.6���� ȭ�� 70.9���̴�.
     ȭ�� 110.3���� ���� 43.1���̴�.
*/
