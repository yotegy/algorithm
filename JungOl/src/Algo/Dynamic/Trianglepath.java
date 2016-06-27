package Algo.Dynamic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Trianglepath {
	
	public static int maxy =0;
	public static int array[][] = new int[100][100];
	public static int cache[][] = new int[100][100];

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int i=0;i<problem;i++){
			
			maxy = in.nextInt();
			
			for(int t=0;t<maxy;t++){
				
				for(int h=0;h<maxy;h++){
					array[t][h] = 0;
					cache[t][h] = -1;
				}
				
			}
			
			String temp = in.nextLine();
			
			for(int k=0;k<maxy;k++){
				
				String nums = in.nextLine();
				
				StringTokenizer st = new StringTokenizer(nums," ");
								
				for(int j=0;j<=k;j++){
					array[k][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int result = 0;
			
			if(maxy == 1) { 
				result = array[0][0]; 
			}else{
				result = f(0,0);
			}
			
			System.out.println(result);
			
		}
		
		in.close();
		
	}

	private static int f(int x, int y) {
		
		if(x >= maxy-1) { return array[x][y]; }
		
		if(cache[x][y] != -1 ) {
			return cache[x][y];
		}else{
			int value = array[x][y] + Math.max(f(x+1,y), f(x+1,y+1));
			cache[x][y] = value;
			return value;
			
		}
		
	}

}
