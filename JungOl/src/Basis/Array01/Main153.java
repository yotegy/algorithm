package Basis.Array01;

import java.util.Scanner;

public class Main153 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = new int[100];
		int i =0;
		for(;i<100;i++){
			
			int temp = in.nextInt();
			if(temp == -1){
				break;
			}
			array[i] = temp;
			
		}
		i--;

		int index = i -2;
		
		if(index < 0) index = 0;
		
		if(array.length != 0 ){
		
			for(int c =0;c<3;c++){
				
				if( (index+c) <= i){
					System.out.printf("%d ",  array[index+c]);
				}else{
					break;
				}
				
			}
		}
		
		in.close();
		
	}

}
