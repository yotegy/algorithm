package Basis.Func02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float a = in.nextFloat();
		float b = in.nextFloat();
		
		int count = countNum(a,b);
		
		System.out.println(count);
		
		in.close();
		
	}

	private static int countNum(float a, float b) {
		// TODO Auto-generated method stub
		int count = 0;
		
		if(a > b){
			
			float temp = a;
			a=b;
			b=temp;
			
		}
		
		int aint = (int)Math.ceil(Math.sqrt((double)a));
		
		int bint = (int)Math.floor(Math.sqrt((double)b));

		count = bint - aint +1;
		
		
		
		return count;
	}
	

}
