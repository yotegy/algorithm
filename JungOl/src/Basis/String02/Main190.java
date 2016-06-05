package Basis.String02;

import java.io.IOException;
import java.util.Scanner;

public class Main190 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String str[] = { "flower" ,"rose", "lily", "daffodil", "azalea" };
		
		Scanner in = new Scanner(System.in);
		
		char ch = in.next().charAt(0);
		
		int num = 0;
		
		for(int k=0;k<str.length;k++){
			
			if(ch == str[k].charAt(1) || ch == str[k].charAt(2)){
				System.out.println(str[k]);
				num++;
			}
			
		}

		System.out.println(num);
		
		in.close();
		
	}

}

