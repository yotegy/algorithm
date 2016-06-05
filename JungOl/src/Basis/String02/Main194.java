package Basis.String02;

import java.io.IOException;
import java.util.Scanner;

public class Main194 {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		int num = in.nextInt();
		
		str1 = str1+str2;
		
		System.out.println(str1);
		
		if(num < str2.length()){
			System.out.println(str1.substring(0, num)+str2.substring(num, str2.length()));
			
		}else{
			System.out.println(str1.substring(0, num));
		}
			
		
		
		
		
		in.close();
		
	}

}

