package Basis.structure;

import java.util.Scanner;

public class Main616 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("세 꼭지점의 좌표를 입력하세요. ");
		
		int x[] = new int[3];
		int y[] = new int[3];
		
		for(int k=0;k<3;k++){
			
			x[k] = in.nextInt();
			y[k] = in.nextInt();
			
		}
		
		float gx = (float)(x[0]+x[1]+x[2])/3.0f ;
		float gy = (float)(y[0]+y[1]+y[2])/3.0f;
		
		System.out.printf("무게중심의 좌표 = (%.1f, %.1f)",gx,gy);
		
		in.close();
		
	}

}


