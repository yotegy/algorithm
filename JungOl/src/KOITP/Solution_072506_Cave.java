package KOITP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution_072506_Cave {
	
	public static int height[];
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String arraynum[] = br.readLine().split(" ");
		int n = Integer.parseInt(arraynum[0]);
		int h = Integer.parseInt(arraynum[1]);
		
		int array[] = new int[n];
		
		height = new int[h];
		
		for(int i=0;i<n/2;i++){
			
			int down = Integer.parseInt(br.readLine());
			
			for(int k=0;k<down;k++){
				height[k]++;
			}
			
			int up = Integer.parseInt(br.readLine());
			for(int t = h-1;t>=(h-up) ;t--){
				height[t]++;
			}
			
		}
		
		int min = 987654321;
		int count = 0;
		
		
		Arrays.sort(height);
		
		min = height[0];
		count++;
		for(int i=1;i<h;i++){
			
			if(min == height[i]) { count++; 
			
			}else{
				break;
			}
			
		}

		
		System.out.println(min+" "+count);
		
		
		
	}

}
