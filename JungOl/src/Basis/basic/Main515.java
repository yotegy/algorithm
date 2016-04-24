package Basis.basic;

import java.util.Scanner;

public class Main515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("정수 입력 ");
		
		int big = in.nextInt();
		int small = in.nextInt();
		
		int multiplication = big * small;
		int result = big / small;
		
		System.out.printf("곱 = %d\n",multiplication);
		System.out.printf("몫 = %d",result);
		
		
	}

}


/*
     섭씨 = (화씨-32) x 0.55 화씨 = (섭씨 x 1.8) + 32이다.
     섭씨 21.6°를 화씨로 화씨 110.3°를 섭씨로 변환하여 다음 형식에 맞추어 소수 둘째 자리에서 반올림하여 소수 첫째자리까지 출력하시오.
     
     섭씨  21.6도는 화씨 70.9도이다.
     화씨 110.3도는 섭씨 43.1도이다.
*/
