package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main633 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		
		boolean pass = true;
		
		while(pass){
			
			System.out.println("1. 대한민국");
			System.out.println("2. 미국");
			System.out.println("3. 일본");
			System.out.println("4. 중국");
			System.out.printf("수도를 알고 싶은 나라는 몇 번입니까? ");
			
			a = in.nextInt();
			System.out.println("");
			switch(a){
			case 1:
				System.out.println("서울");
				break;
			case 2:
				System.out.println("워싱턴");
				break;
			case 3:
				System.out.println("동경");
				break;
			case 4:
				System.out.println("북경");
				break;
			default:
				System.out.println("해당하는 나라가 없습니다.");
				pass = false;
			}
			System.out.println("");
		}
		

	}

}
