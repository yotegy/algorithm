package Basis.Select.Control;

import java.util.Scanner;

public class Main122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		if( (year % 400) == 0){
			System.out.println("����");
		}else if( (year % 100) == 0){
			System.out.println("���");
		}else if( (year % 4) == 0 ){
			System.out.println("����");
		}else{
			System.out.println("���");
		}
		
		
		
	}

}
