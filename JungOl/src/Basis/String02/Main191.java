package Basis.String02;

import java.io.IOException;
import java.util.Scanner;

public class Main191 {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		String str[] = new String[50];
		
		int position = 0;
		
		String temp = "";
		
		while(true){
			
			temp = in.next();
			
			if(temp.equals("0")){
				break;
			}
			
			str[position++] = temp;
						
		}
		
		System.out.println(position);
		
		for(int k=0;k<position;k+=2){
			System.out.println(str[k]);
		}
		
		
		in.close();
		
	}

}

