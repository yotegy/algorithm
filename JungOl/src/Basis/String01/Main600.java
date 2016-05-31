package Basis.String01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main600 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.trim();
		
		String words[] = str.split(" ");
		
		System.out.println(words.length);
		

		in.close();
		
		
	}
}
