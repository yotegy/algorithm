package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main536 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		while(true){
			
			System.out.printf("������ �Է��ϼ���. ");
			a = in.nextInt();
			
			if(a > 0){
				System.out.println("����Դϴ�.");
			}else if(a < 0){
				System.out.println("�����Դϴ�.");
			}else if(a == 0){
				break;
			}
			
			
		}

	}

}
