package Basis.Repeat.Control;

import java.util.Scanner;

public class Main129 {
	
	
	/*
	 * �غ��� ���� = 11
		���� = 5
		�Է��� �ﰢ���� ���̴� 27.5�Դϴ�.
		����Ͻðڽ��ϱ�? Y
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int baseline = 0;
		int height = 0;
		
		float area = 0;
		
		boolean pass = true;
		
		while(pass){
			
			System.out.printf("�غ��� ���� = ");
			baseline = in.nextInt();
			System.out.printf("���� = ");
			height = in.nextInt();
			
			area = (baseline * height) /2.0f;
			
			System.out.printf("�Է��� �ﰢ���� ���̴� %.1f�Դϴ�.\n",area);
			System.out.printf("����Ͻðڽ��ϱ�? ");
			
			String answer = in.next();
			
			if( answer.equals("Y") || answer.equals("y") ){
				// do nothing
			}else {
				pass = false;
			}
			
		}
	

	}
}
