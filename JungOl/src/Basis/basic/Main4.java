package Basis.basic;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a1 = 21.6f;
		float b1 = 110.3f;
				
		System.out.printf("���� %3.1f4�� ȭ�� %2.1f���̴�.\n" , a1, (a1*1.8)+32);
		System.out.printf("ȭ�� %3.1f4���� ���� %2.1f���̴�.",b1, (b1-32)*0.55);
	}

}


/*
     ���� = (ȭ��-32) x 0.55 ȭ�� = (���� x 1.8) + 32�̴�.
     ���� 21.6�Ƹ� ȭ���� ȭ�� 110.3�Ƹ� ������ ��ȯ�Ͽ� ���� ���Ŀ� ���߾� �Ҽ� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ͻÿ�.
     
     ����  21.6���� ȭ�� 70.9���̴�.
     ȭ�� 110.3���� ���� 43.1���̴�.
*/
