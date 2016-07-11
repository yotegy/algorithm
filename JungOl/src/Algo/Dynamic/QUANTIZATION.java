package Algo.Dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class QUANTIZATION {
	
	public static int array[];
	public static int arraySum[] = new int[101];
	public static int arrayDoubleSum[] = new int[101];
	public static int total;
	
	public static int cache[][] = new int[101][11];
	public static int cachenum[][] = new int[101][101];

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int i = 0; i< problem ;i++){
			
			// Initialize Cache
			for(int k=0;k<100;k++){
				Arrays.fill(cache[k], -1);
				Arrays.fill(cachenum[k],-1);
			}
			
			// Insert input data
			total = in.nextInt();
			int filternum = in.nextInt();
			
			array = new int[total];
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
		if(i == total && filternum >= 0) return 0;
		
		if( i >= total  ) return 987654321;
		
		if(filternum <= 0) return 987654321;
				
		// use cache
		if(cache[i][filternum] != -1 ) return cache[i][filternum];
				
		int mid = 987654321;
		
		
		for(int size = 0; size< (total-i);size++ ){
			
			mid = Math.min(mid, getNum(i,i+size)+findnum(i+size+1,filternum-1));
			
		}
		
		cache[i][filternum] = mid;
		
		return mid;
	}


	private static int getNum(int start, int end) {
		
		if(start == end ){
			return 0;
		}
		
		if(cachenum[start][end] != -1) return cachenum[start][end];
		
		
		int gap = 0;
		int minus = 0;
		int minusD = 0;
		
		if(start != 0) {
			
			minus = arraySum[start-1];
			minusD = arrayDoubleSum[start-1];
		}
		
		int avg = Math.round(  ((float)(arraySum[end] - minus)) / ((float)(end-start+1)) );
		
		avg = avg-1;		
		int gap1 = arrayDoubleSum[end] - minusD - 2*avg*(arraySum[end]-minus) + avg*avg*(end-start+1);
		avg = avg +1;
		int gap2 = arrayDoubleSum[end] - minusD - 2*avg*(arraySum[end]-minus) + avg*avg*(end-start+1);
		avg = avg+1;
		int gap3 = arrayDoubleSum[end] - minusD - 2*avg*(arraySum[end]-minus) + avg*avg*(end-start+1);
		
		gap = Math.min(gap3, Math.min(gap1, gap2));
//		
//		System.out.println(arrayDoubleSum[end]);
//		System.out.println(minusD);
//		System.out.println(2*avg*(arraySum[end]-minus));
//		System.out.println(avg*avg*(end-start+1));
//		
//		System.out.println(" start "+start+" , end "+end+" avg "+avg+" gap "+gap);
		
		cachenum[start][end] = gap;
		
		return gap;
	}

}
