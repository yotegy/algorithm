package Basis.Func03;

import java.util.Arrays;
import java.util.Scanner;

public class Main234 {

	public static int cache[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		cache = new int[num+1];

		Arrays.fill(cache,-1);
		
		int result = findnum(num);
		
		
		
		
		System.out.println(result);
		
		in.close();

	}

	private static int findnum(int num) {
		// TODO Auto-generated method stub
		
		if(num == 1) return 1;
		if(num == 2) return 2;
		
		int a = 0;
		int b =0;
				
		if(cache[num-1] >= 0){
			a = cache[num-1];
		}else{
			a = findnum(num-1);
		}
		
		if(cache[num-2] > -1){
			b = cache[num-2];
		}else{
			b = findnum(num-2);
		}
		
		cache[num] = (a*b)%100;
		
		return cache[num];
		
	}

}
