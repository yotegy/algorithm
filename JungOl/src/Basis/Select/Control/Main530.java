package Basis.Select.Control;

import java.util.Scanner;

public class Main530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int age = in.nextInt();
		
		if(age >= 20){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("����� "+(20-age)+"�� �Ŀ� ������ �˴ϴ�.");
		}
		
		
		
	}

}
