package Basis.String01;

import java.util.Scanner;

public class Main599 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		
		String str = in.next();
		
		char ch[] = str.toCharArray();
		char result[] = new char[100];
		
		int po = 0;
		for(int k=0;k<ch.length;k++){
			if(ch[k] >= 'A' && ch[k] <= 'z'){
				result[po] = ch[k];
				po++;
			}
		}

		String up = "";
		for(int i=0;i<po;i++){
			
			up += result[i];
			
		}
		
		System.out.println(up.toUpperCase());
		

		in.close();
		
		
	}
}
