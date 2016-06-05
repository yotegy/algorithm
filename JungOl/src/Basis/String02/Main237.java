package Basis.String02;

import java.util.Scanner;

public class Main237 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String first = in.next();
		
		Float num = in.nextFloat();
		
		String third = in.next();
		
		
		num = num*1000;
		
		num = (float)Math.round(num);
		
		num = (float)num/1000.f;
		
		String last = first+num+third;
		
		
		int length = last.length();
		int fnum = 0;
		if(length % 2 != 0){
			fnum = length/2+1;
		}else{
			fnum = length/2;
		}
		
		System.out.println(last.substring(0, fnum));
		System.out.println(last.substring(fnum,length));
		
		in.close();
		
		
	}
	
}
