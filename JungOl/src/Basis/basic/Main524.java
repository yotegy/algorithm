package Basis.basic;

import java.util.Scanner;

public class Main524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int first = in.nextInt();
		int second = in.nextInt();
		
		int out1 = 0;
		int out2 = 0;
		
		if(first == 0 || second == 0){
			out1 = 0;
		}else{
			out1 = 1;
		}
		
		if(first > 0 || second > 0 ){
			out2 = 1;
		}else{
			out2 = 0;
		}
				
		System.out.printf("%d %d",out1,out2);
		
	}

}


/*
     ���� = (ȭ��-32) x 0.55 ȭ�� = (���� x 1.8) + 32�̴�.
     ���� 21.6�Ƹ� ȭ���� ȭ�� 110.3�Ƹ� ������ ��ȯ�Ͽ� ���� ���Ŀ� ���߾� �Ҽ� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ͻÿ�.
     
     ����  21.6���� ȭ�� 70.9���̴�.
     ȭ�� 110.3���� ���� 43.1���̴�.
*/
