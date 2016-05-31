package Basis.String02;

import java.util.Scanner;

public class Main602 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String array[] = new String[5];
		
		for(int i=0;i<array.length;i++){
			array[i] = in.next();
		}
		
		for(int k=array.length-1;k>=0;k--){
			System.out.println(array[k]);
		}
		
		
		in.close();
		
	}

}
