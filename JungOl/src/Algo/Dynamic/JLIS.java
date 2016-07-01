package Algo.Dynamic;

import java.util.Scanner;

public class JLIS {

	public static int fnum[] = new int[101];
	public static int snum[] = new int[101];
	
	public static int cache[][] = new int[101][101];
	
	public static int first = 0;
	public static int second =0;
	
	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
		 
		 int problem = in.nextInt();
		 
		 for(int i=0;i<problem;i++){
			 
			 first = in.nextInt();
			 second = in.nextInt();
			 
			 fnum[0] = snum[0] = -1;
			 
			 for(int k=1;k<=first;k++){
				 fnum[k] = in.nextInt();
			 }
			 
			 for(int k=1;k<=second;k++){
				 snum[k] = in.nextInt();
			 }
			 
			 
			 for(int k=0;k<=first;k++){
				 for(int t =0;t<=second;t++){
					 cache[k][t] = -1;
				 }
			 }
			 
			 int result = find(0,0);
			 
			 System.out.println(result);
			 
		 }
		 in.close();
	}

	private static int find(int k, int t) {
		
//		System.out.println("Enter K :"+k+" T :"+t);
		
		if( k > first  ||  t > second){
			return 0;
		}
		
		if(cache[k][t] != -1 ) return cache[k][t];
		
		int mid=0;
		
		int big = fnum[k];
		if(fnum[k] < snum[t]) big = snum[t];
						
		for(int n = k+1 ; n<=first;n++){
			if( big < fnum[n]){
				mid = Math.max( mid, 1+find(n,t) );
			}
		}
		
		for(int m = t+1 ; m <= second;m++){
			if(big < snum[m]){
				mid = Math.max( mid, 1+find(k,m) );
			}
		}
		
		cache[k][t] = mid;
//		System.out.println(" k : "+k+" t :"+t+" = "+mid);
		
		return mid;
	}

}
