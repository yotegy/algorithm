package Algo.SevenIntro;

import java.util.Scanner;

public class QUADTREE {
	
	public static int po = 0;
	public static String input;
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
				
		
		for(int repeat = 0 ;repeat<problem;repeat++){
			
			po = 0;
			input = in.next();
		
			String result = reverse();
							
			System.out.println(result);
			
		}

	}
	
	public static String reverse(){
		
//		System.out.println("point "+po+" character "+input.charAt(po));

		if(input.charAt(po) == 'b' || input.charAt(po) == 'w'){
			
			return ""+input.charAt(po++);
		}
		
		// in case of X
		
		po++;
		String first = reverse();
		String second = reverse();
		String third = reverse();
		String fourth = reverse();
				
		return "x"+third+fourth+first+second;
		
	}

}