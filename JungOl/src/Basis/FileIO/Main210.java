package Basis.FileIO;

import java.util.Scanner;

public class Main210 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int total = num*2-1;
		
		char ch[][] = new char[total][total];
		
		// initializing
		for(int k=0;k<total;k++){
			for(int j=0;j<total;j++){
				ch[k][j] = ' ';
			}
		}
		
		// fill '*' in cross
		for(int k = 0;k<total;k++){
			for(int i =0;i<total;i++){
				if(k == (num-1) || i == (num-1)){
					ch[k][i] = '*';
					
				}
			}
		}
		
		// 1. left-up
		for(int k=0;k<(num-1);k++){
			for(int i=0;i<(num-1);i++){
				if((k+i) >= (num-1) ) {
					ch[k][i] = '*';
					ch[2*num-2-k][i] = '*';
				}
			}
		}
		
		// 2. right-up
		for(int k=0;k<(num-1);k++){
			for(int i=num;i<total;i++){
				if((i-k) < num ) {
					ch[k][i] = '*';
					ch[2*num-2-k][i] = '*';
				}
			}
		}
		
		
		
		showFigure(ch);
		
		in.close();
		
	}

	private static void showFigure(char[][] ch) {
		
		for(int k = 0;k<ch.length;k++){
			for(int i = 0; i<ch.length;i++){
				if(ch[k][i] == '*'){
					System.out.printf("* ");
				}else{
					System.out.printf("  ");
				}
			}
			System.out.println();
		}
		
	}



}
