package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main633 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		boolean pass = true;
		
		while(pass){
			
			System.out.println("1. ���ѹα�");
			System.out.println("2. �̱�");
			System.out.println("3. �Ϻ�");
			System.out.println("4. �߱�");
			System.out.printf("������ �˰� ���� ����� �� ���Դϱ�? ");
			
			a = in.nextInt();
			System.out.println("");
			switch(a){
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("������");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("�ϰ�");
				break;
			default:
				System.out.println("�ش��ϴ� ���� �����ϴ�.");
				pass = false;
			}
			System.out.println("");
		}
		

	}

}
