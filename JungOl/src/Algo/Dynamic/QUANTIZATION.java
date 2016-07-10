package Algo.Dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class QUANTIZATION {
	
	public static int array[];
	public static int arraySum[];
	public static int arrayDoubleSum[];
	public static int total;
	
	public static int cache[][] = new int[101][51];

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int i = 0; i< problem ;i++){
			
			// Initialize Cache
			for(int k=0;k<100;k++){
				Arrays.fill(cache[k], -1);
			}
			
			// Insert input data
			total = in.nextInt();
			int filternum = in.nextInt();
			
			array = new int[total];
			arraySum = new int[total];
			arrayDoubleSum = new int[total];
			
			for(int k=0;k<total;k++){
				array[k] = in.nextInt();
			}

			// Sorting Array
			Arrays.sort(array);
			
			// figure out sum array
			arraySum[0] = array[0];
			arrayDoubleSum[0] = array[0]*array[0];
			for(int k=1;k<total;k++){
				
				arraySum[k] = arraySum[k-1]+array[k];
				arrayDoubleSum[k] = arrayDoubleSum[k-1]+array[k]*array[k];
			}
			
			// Call find functions
			int result = findnum(0,filternum);
			
			System.out.println(result);
			
		}
		in.close();
	}
	
	
	// result start 'i' and use 'filternum'
	private static int findnum(int i, int filternum) {
		
		// last position
		if(i == total ){
			if(filternum > 0) {
				// un normal
				return 987654321;
			}else{
				
				// final case
				return 0;
			}
		}
		
		// There is no filternum
		if(filternum == 0){
			return 987654321;
		}
		
		// use cache
		if(cache[i][filternum] != -1 ) return cache[i][filternum];
				
		int mid = 987654321;
		
		
		for(int size = 1; size< (total-i);size++ ){
			
			mid = Math.min(mid, getNum(i,i+size)+findnum(i+size,filternum-1));
			
		}
		
		return mid;
	}


	private static int getNum(int i, int j) {
		
		
		
		return 0;
	}

}
