package Basis.structure;

import java.util.Scanner;

public class Main617 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name[] = new String[5];
		int height[] = new int[5];
		
		for(int k=0;k<5;k++){
			
			name[k] = in.next();
			height[k] = in.nextInt();
			
		}
		
		int min = 98765;
		int po = 0;
		
		for(int k=0;k<5;k++){
			
			if(Math.min(min, height[k]) == height[k] ){
				po = k;
				min = height[k];
			}
			
		}
		
		System.out.println(name[po]+" "+height[po]);
		
		
		in.close();
		
	}

}


