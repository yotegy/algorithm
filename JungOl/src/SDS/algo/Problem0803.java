package SDS.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Problem0803 {

	public static int array[][] = new int[101][101];
	public static int result[] = new int[101];
	public static int colorPointX[] = new int[101];
	public static int colorPointY[] = new int[101];
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int i = 0;i< problem; i++){
			
			for(int k=0;k<100;k++){
				Arrays.fill(array[k], 0);
				Arrays.fill(result, 0);
			}
			
			int repeat = in.nextInt();
			
			int max = 0;
			
			for(int t=1;t<=repeat;t++){
				colorPointX[t] = in.nextInt();
				colorPointY[t] = in.nextInt();
				int line = in.nextInt();
				
				if( colorPointX[t] >= colorPointY[t] ){
					if(max < colorPointX[t]+line ) max = colorPointX[t]+line;
				}else{
					if(max < colorPointY[t]+line ) max = colorPointY[t]+line;
				}
				
				insertNum(colorPointX[t],colorPointY[t],line,t);
				
			}
		    
		    calculate(max);
		    
		   // showarray(max);
		    
		    System.out.printf("#%d ",(i+1));
		    
		    findmin(max);
		    System.out.println();
		    findmax(max);
		    System.out.println();
			
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

	private static void calculate(int max) {
		
		for(int i = 1; i<=max ;i++ ){
			for(int k = 1; k <= max ; k ++ ){
				
				result[array[i][k]] = result[array[i][k]]+1;
				
			}
		}
		
	}

	private static void showarray(int max) {
		
		for(int i=1;i<max;i++){
			for(int k=1;k<max;k++){
				
				System.out.printf("%d ",array[i][k]);
				
			}
			System.out.println();
		}
		System.out.println();
		
		for(int t=1;t<max;t++){
			System.out.printf("%d ",result[t]);
		}
	}

	private static void insertNum(int x, int y, int line, int color) {
			
		 for(int i=x;i<x+line;i++){
			 
			 for(int k=y;k<y+line;k++){
				 
				 array[i][k] = color;
				 
			 }
			 
		 }
		
	}

}
