package Basis.Func01;

import java.util.Scanner;

public class Main578 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		
		int temp;
		
		if(a > b){
			temp =a;
			a = b;
			b= temp;
		}
		
		for(int i=a;i<=b;i++){
			
			show(i);
			
		}
		
		
		in.close();
		
	}

	private static void show(int i) {
		// TODO Auto-generated method stub
		
		System.out.printf("== %d단 ==\n", i);
		for(int k=1;k<10;k++){
			
			System.out.printf("%d * %d = %2d\n", i,k,(i*k));
			
		}
		System.out.println();
		
	}

	
}
