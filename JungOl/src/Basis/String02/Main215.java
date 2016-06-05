package Basis.String02;

import java.util.Scanner;

public class Main215 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		
		System.out.println(findnum(str1)*findnum(str2));
		
		
		
		in.close();
		
		
	}
	
	public static int findnum(String str){
		
		int result = 0;
		
		char ch[] = str.toCharArray();
		
		
		int k =0;
		for(;k<ch.length;k++){
			
			if(ch[k] < '0' || ch[k] > '9') break;
			
		}
		
		result = Integer.parseInt(str.substring(0,k));
		
		return result;
		
		
	}

}
