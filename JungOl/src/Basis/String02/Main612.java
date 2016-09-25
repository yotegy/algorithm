package Basis.String02;

import java.util.Arrays;
import java.util.Scanner;

public class Main612 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String num = "";
		
		for(int i=0;i<5;i++){
			num += in.next();
		}

		String temp = "";
		
		while(num.length() > 0){
			
			if(num.length() <=3 ){
				temp = num;
				num = "";
			}else{
				temp = num.substring(0,3);
				num = num.substring(3,num.length());
			}
			
			System.out.println(temp);
			
		}
		
		
		
		
		
		in.close();
		
	}

}
