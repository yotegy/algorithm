package Basis.String02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main192 {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		String str[] = new String[num];
		
		
		for(int k=0;k<num;k++){
			
			str[k] = in.next();
			
		}
		
		Arrays.sort(str);
		
		for(int k=0;k<num;k++){
			System.out.println(str[k]);
		}
		
		in.close();
		
	}

}

