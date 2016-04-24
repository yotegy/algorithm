package Basis.Array01;

import java.util.Scanner;

public class Main558 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[100];
		int i =0;
		
		for(;i<100;i++){
			int temp = in.nextInt();
			
			if(temp == 0){
				break;
			}else{
				array[i] = temp;
			}
		}

		for(int k = (i-1);k>=0;k--){
			System.out.printf("%d ", array[k]);
		}
		
		in.close();
		
	}

}
