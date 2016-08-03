package Algo.Dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class TRIPATHCNT {

	
	public static int array[][];
	public static int sumarray[][];
	public static int cache1[][] = new int[100][100];
	public static int cache2[][] = new int[100][100];
	public static int total;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int i =0 ; i<problem; i++){
			
			total = in.nextInt();
			
			array = new int[total][total];
			sumarray = new int[total][total];
			
			for(int t = 0;t<total;t++){
				Arrays.fill(cache1[t], -1);
				Arrays.fill(cache2[t], -1);
			}
			
			for(int y = 0; y<total ; y++){
				
				for(int x=0;x<=y;x++){
					
					array[y][x] = in.nextInt();
					
				}
				
			}
			
			
			sumarray[0][0] = findsum(0,0);
			
			
			
			int result = findline(0,0);
						
			System.out.println(result);
			
			
		}
		
		
		in.close();

	}
	
	private static int findline(int y, int x){
		
		if(y == (total-1) ) return 1;
		
		if(cache2[y][x] != -1 ) return cache2[y][x];
		
		int max = 0;
		
		
		if( sumarray[y+1][x] > sumarray[y+1][x+1]  ){
			max = findline(y+1,x);
		}else if(sumarray[y+1][x] < sumarray[y+1][x+1] ){
			max = findline(y+1,x+1);
		}else{ // same
			max = findline(y+1,x) + findline(y+1,x+1);
		}
				
		cache2[y][x] = max;
		
		return max;
		
		
	}
	
	
	// Make sum array
	private static int findsum(int y, int x) {
		
		if(y == total ) return 0;
		if(x == y+1 ) return 0;
		
		if(cache1[y][x] != -1) return cache1[y][x];
		
		int max = array[y][x];
		
		max = max + Math.max( findsum(y+1,x), findsum(y+1,x+1));
		
		sumarray[y][x] = max;
		cache1[y][x] = max;
		
		return max;
	}

	private static void show(int[][] array) {
		
		for(int y=0;y<total;y++){
			for(int x=0;x<total ;x++){
				
				System.out.printf("%d ",array[y][x]);
				
			}
			System.out.println();
		}
		
		
	}

}
