package Algo.Dynamic;

import java.util.Scanner;

public class LIS {
	
	public static int[] array = new int[500];
	public static int[] cache = new int[500];
	
	public static void main(String arg[]){
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i=0;i<num;i++){
			
			int total = in.nextInt();
			
			// initializing
			for(int k=0;k<total;k++){
				array[k]=in.nextInt();
				cache[k] = -1;
			}
			
			int result = 0;
			
			for(int k =0;k<total;k++){
				int temp = find(k,total);
				if(result < temp) result = temp;
			}
			
			System.out.println(result);
		}
		
		in.close();
		
		
	}

	private static int find(int i,int total) {
		
		if(i == total){
			return 0;
		}

		if(cache[i] != -1){
			return cache[i];
		}
		
		int max = 1;
		
		for(int k=i+1;k<total;k++){
			
			if(array[i] < array[k]){
				int temp = 1+find(k,total);
//				System.out.println(" temp :"+temp+" i : "+i+" array[i] :"+array[i]+" k :"+k+" array[k] :"+array[k]);
				if(temp > max) {
					max = temp;
				}
			}
			
		}
		
		cache[i] = max;
		return max;
	}

}
