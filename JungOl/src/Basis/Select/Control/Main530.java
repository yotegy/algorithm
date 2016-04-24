package Basis.Select.Control;

import java.util.Scanner;

public class Main530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int age = in.nextInt();
		
		if(age >= 20){
			System.out.println("성인입니다.");
		}else{
			System.out.println("당신은 "+(20-age)+"년 후에 성인이 됩니다.");
		}
		
		
		
	}

}
