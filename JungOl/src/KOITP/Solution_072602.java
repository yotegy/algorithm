package KOITP;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_072602 {
	
	public static int maxNum = 0;
	public static int divider = 1000000000;
	public static int cache[][];

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		maxNum = in.nextInt();
		int nums = in.nextInt();
		
		int count = 0;
		
		cache = new int[maxNum+1][nums+1];
		
		for(int t=1;t<=maxNum;t++){
			Arrays.fill(cache[t],-1);
		}
		
		count = find(maxNum,nums)%divider;
		
		System.out.println(count);
		
	}

	private static int find(int target, int remain) {
		
		if(target == 0) return 1;
		if(remain == 0) return 0;
		
		if(cache[target][remain] != -1) return cache[target][remain];
		
		
		int count = 0;
		
		for( int k = 0;k<=target;k++){
			
			count = ( count + find(target-k,remain-1) ) % divider;
			
		}
		
//		System.out.println(" target : "+target+" , reamin : "+remain+" , count : "+ count);
		
		cache[target][remain] = count;
		
		return count;
	}

}
