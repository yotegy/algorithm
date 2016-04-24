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
     섭씨 = (화씨-32) x 0.55 화씨 = (섭씨 x 1.8) + 32이다.
     섭씨 21.6°를 화씨로 화씨 110.3°를 섭씨로 변환하여 다음 형식에 맞추어 소수 둘째 자리에서 반올림하여 소수 첫째자리까지 출력하시오.
     
     섭씨  21.6도는 화씨 70.9도이다.
     화씨 110.3도는 섭씨 43.1도이다.
*/
