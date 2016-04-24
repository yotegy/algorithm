package Basis.Array01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main155 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		char array[] = {'J', 'U', 'N', 'G', 'O', 'L'};
		
		Set<Character> charset = new HashSet<Character>();
		
		for(char a : array){
			charset.add(a);
		}
		
	    char a = (in.next()).charAt(0);
	    
	    if(charset.contains(a)){
	    	
	    	for(int k=0;k<array.length;k++){
	    		if(array[k] == a){
	    			System.out.println(k);
	    			break;
	    		}
	    	}
	    	
	    }else{
	    	System.out.println("없는 문자입니다.");
	    }
		
		
		in.close();
		
	}

}
