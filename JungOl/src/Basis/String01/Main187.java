package Basis.String01;

import java.util.Scanner;

public class Main187 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		int po = 0;
		
		while(str.length() >= 2){
			
			po = in.nextInt();
			
			if(str.length() > po){
				str = str.substring(0,po-1)+str.substring(po);
			}else{
				str = str.substring(0,str.length()-1);
			}
			
			System.out.println(str);
		}
		
		in.close();
		
	}

}
