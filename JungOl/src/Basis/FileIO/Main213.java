package Basis.FileIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main213 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str[] = new String[100];
		String temp[];
		
		String line = in.nextLine();
		
		System.out.println(line.length());
		
		temp = line.split(" ");
		
		int max_line = 0;
		
		for(int k=0;k<temp.length;k++){
			
			if(max_line < temp[k].length()){
				max_line = temp[k].length();
			}
			
		}
		
		int addnum = 0;
		
		for(int k=0;k<temp.length;k++){
			
			if(temp[k].length() == max_line){
				str[addnum] = temp[k];
				addnum++;
			}
			
		}
		
		for(int i=0;i<addnum;i++){
			System.out.printf("%s ", str[i]);
		}
		
		
	
		
		in.close();
		
	}

}
