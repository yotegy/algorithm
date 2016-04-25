package Algo.SixBabo;

import java.util.Scanner;

public class TSP01 {

	
	public static double distance[][];
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		
		int problem = in.nextInt();
		
		for(int num = 0;num<problem;num++){
			
			int city = in.nextInt();
			
			distance = new double[city][city];
			
			for(int k=0;k<city;k++){
				
				for(int d=0;d<city;d++){
					
					distance[k][d] = in.nextDouble();
					
				}
				
			}
			
			
//			System.out.println(findPath()));
			
			
			
		}
		
		
	}

}
