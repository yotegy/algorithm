package Algo.Dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class TILING2 {

	public static int limit = 1000000007;
	public static int total;
	public static int cache[] = new int[101];
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int problem =in.nextInt();
		
		for(int i=0;i<problem;i++){
			
			Arrays.fill(cache, -1);
			
			total = in.nextInt();
			
			int result = findnum(total);
			
			System.out.println(result);
			
		}
		
		in.close();

	}

	private static int findnum(int num) {
		
		if(num <= 0) return 0;
		if(num == 1) return 1;
		if(num == 2) return 2;
		
		if(cache[num] != -1) return cache[num];
		
		int temp = ( findnum(num-1) + findnum(num-2) ) % limit;
		
		cache[num] = temp;
		
		return temp;
	}

}
