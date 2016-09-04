package KOITP;

import java.util.Scanner;

public class Solution_072506_Cave {
	
	public static int height[];
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int h = in.nextInt();
		
		int array[] = new int[n];
		
		height = new int[h];
		
		for(int i=0;i<n/2;i++){
			
			int down = in.nextInt();
			
			for(int k=0;k<down;k++){
				height[k]++;
			}
			
			int up = in.nextInt();
			for(int t = h-1;t>=(h-up) ;t--){
				height[t]++;
			}
			
		}
		
		int min = 987654321;
		int count = 0;
		
		for(int r = 0 ;r<h;r++){
			
			if(height[r] < min ){
				
				count = 1;
				min = height[r];
				
			}else if( height[r] == min ) {
				
				count++;
				
			}
			
		}
		
		System.out.println(min+" "+count);
		
		
		
	}

}
