package Basis.String02;

import java.io.IOException;
import java.util.Scanner;

public class Main604 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		
		String array[] = new String[10];
		
		for(int i=0;i<array.length;i++){
			array[i] = in.next();
		}

		char ch = in.next().charAt(0);
		
		for(int i=0;i<10;i++){
			
			if(ch == array[i].charAt(array[i].length()-1)){
				System.out.println(array[i]);
			}
			
		}
		
		in.close();
		
	}

}
