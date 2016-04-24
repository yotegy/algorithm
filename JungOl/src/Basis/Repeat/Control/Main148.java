package Basis.Repeat.Control;

import java.util.Scanner;

public class Main148 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int column = num*2-1;
		
	    char array[][] = new char[column][num];
	    
	    for(int i=0;i<column;i++){
	    	for(int j=0;j<num;j++){
	    		
	    		if( i >= j && i <= (j+num-1) ){
	    			array[i][j] = '#';
	    		}else{
	    			array[i][j] = ' ';
	    		}
	    		
	    	}
	    }
	    
	    
	    for(int i=0;i<column;i++){
	    	for(int j=0;j<num;j++){
	    		System.out.printf("%c ", array[i][j]);	    		
	    	}
	    	System.out.println("");
	    }
		
		in.close();

	}
}
