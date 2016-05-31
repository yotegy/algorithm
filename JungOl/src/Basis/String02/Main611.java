package Basis.String02;

import java.util.Arrays;
import java.util.Scanner;

public class Main611 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String num = in.next();
		
		char intnum[] = num.toCharArray();
		
		int po =0;
		boolean pointcheck = false;
		for(;po<intnum.length;po++){
			
			if(intnum[po] == '.') {
				if(pointcheck) break;
				
				pointcheck = true;
			}
			
			if( !((intnum[po] >= '0' && intnum[po] <= '9') || intnum[po] == '.') )
				break;
			
		}
		
		String f_str = num.substring(0, po);
		float floatnum = Float.parseFloat(f_str);
		int int_str = (int)floatnum/1;
		System.out.println(int_str*2);
		
		System.out.printf("%.2f",floatnum);
		
		in.close();
		
	}

}
