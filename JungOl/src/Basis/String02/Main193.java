package Basis.String02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main193 {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		String str[] = new String[5];
		
		for(int i = 0;i<str.length;i++){
			str[i] = in.next();
		}
		
		String str1 = in.next();
		String str2 = in.next();
		
		boolean pass = true;
		
		for(int k =0;k<str.length;k++){
			
			if(str[k].indexOf(str1)>-1 || str[k].indexOf(str2) > -1){
				System.out.println(str[k]);
				pass = false;
			}
			
		}
		
		if(pass) System.out.println("없음");
		
		
		in.close();
		
	}

}

