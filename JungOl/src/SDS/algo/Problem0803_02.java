package SDS.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Problem0803_02 {

	public static boolean array[][] = new boolean[10001][10001];
	public static int result[] = new int[101];
	public static int cpX[] = new int[101];
	public static int cpY[] = new int[101];
	public static int cpL[] = new int[101];
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int i = 0;i< problem; i++){
			
			for(int k=1;k<101;k++){
				
				Arrays.fill(result, 0);
			}
			
			int repeat = in.nextInt();
			
			int max = repeat;

			// input points
			for(int t=1;t<=repeat;t++){
				cpX[t] = in.nextInt();
				cpY[t] = in.nextInt();
				cpL[t] = in.nextInt();
				
			}
		    
		    
			// Find out result
			findout(repeat);
		    
			
			// Print out result
		    System.out.printf("#%d ",(i+1));
		    
		    findmin(max);
		    System.out.println();
		    findmax(max);
		    System.out.println();
			
		}
		
	}

	private static void findout(int bound) {
		
		for(int i =1;i<=bound;i++){
			
			// initial value
			result[i] = cpL[i]*cpL[i];
			
			System.out.println(" initial size "+" i : "+i+"  "+result[i]);
			
			for(int t = 0;t<cpL[i] ;t++){
				
				Arrays.fill(array[t], true);
				
			}
			
			
			for(int k = bound ; k>i ; k--){
				System.out.println(" >>>>>>>>>>>>>>>>> checkbox  "+ i +"   "+k);
				checkBox(i,k);
			
			}
			
			result[i] = result[i] - calFalse(i);
			
			System.out.println(" final size "+" i : "+i+"  "+result[i]);
		}
		
	}

	private static int calFalse(int ori) {
		
		int count = 0;
		
		for(int x =0 ; x<cpL[ori];x++){
			for(int y=0;y<cpL[ori];y++){
				
				if(!array[x][y]) count++;
				
			}
		}
		
		System.out.println(" cal false  "+" i : "+ori+"  "+count);
		
		return count;
	}

	private static void checkBox(int ori, int cov) {
		
		if( ( cpY[ori]+cpL[ori]) < cpY[cov]){
			// Do nothing
			System.out.println(" --- > out 1");
		}else if((cpX[ori]+cpL[ori]) < cpX[cov]){
			// Do nothing
			System.out.println(" --- > out 2");
		}else{
			
			for(int x = Math.max(0, cpX[cov] - cpX[ori]) ; x <= Math.min(cpL[ori], cpX[cov]-cpX[ori] );x++ ){
				
				for(int y = Math.max(0, cpY[cov] - cpY[ori]) ; y <= Math.min(cpL[ori], cpY[cov]-cpY[ori] );y++ ){
					
					array[x][y] = false;
					System.out.println("#### change false  "+x+"  "+y);
				}
				
			}
			
		}
		
	}

	private static void findmin(int max) {
		
		int min_num = 987654321;
		
		int count = 0;
		
		for(int i =1;i<=max;i++){
			if(result[i] != 0 && min_num > result[i]) {
				count =1;
				min_num = result[i];
			}else if(min_num == result[i]){
				count +=1;
			}
		}
		
		System.out.printf("%d ",count);
		
		for(int i=1;i<=max;i++){
			
			if(min_num == result[i]){
				
				System.out.printf("%d %d ",i,min_num);
				
			}
			
		}
		
		
	}

	private static void findmax(int max) {
		
		int max_num = -1;
		
		int count = 0;
		
		for(int i =1;i<=max;i++){
			if(max_num < result[i]) {
				count =1;
				max_num = result[i];
			}else if(max_num == result[i]){
				count +=1;
			}
		}
		
		System.out.printf("%d ",count);
		
		for(int i=1;i<=max;i++){
			
			if(max_num == result[i]){
				
				System.out.printf("%d %d ",i,max_num);
				
			}
			
		}
		
	}






}
