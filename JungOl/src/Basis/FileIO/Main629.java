package Basis.FileIO;

import java.util.Scanner;

public class Main629 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		if(str1.length() <= str2.length()){
			
			System.out.println(str1);
			System.out.println(str2);
			
		}else{
			
			System.out.println(str2);
			System.out.println(str1);
			
		}
		
		
		in.close();

	}

}
