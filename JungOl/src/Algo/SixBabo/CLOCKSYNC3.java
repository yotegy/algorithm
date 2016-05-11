package Algo.SixBabo;

import java.util.Scanner;

public class CLOCKSYNC3 {
	
	public static int clocks[][] ={
			{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0},
			{0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,1},
			{1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,0},
			{1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1},
			{0,0,0,0,1,1,0,1,0,0,0,0,0,0,1,1},
			{0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,1,1,1,0,0,0,1,0,0,0,1,0,0}
			
	};
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int num=0;num<problem;num++){
			
			int watches[] = new int[16];
			for(int i =0;i<16;i++) watches[i] = in.nextInt();
			
			int final_result = findNumber(watches,0);
			
			if(final_result>=9999){
				System.out.println(-1);
			}else{
				System.out.println(final_result);
			}
			
		}
		
		in.close();
		
	}

	private static int findNumber(int watches[],int switches) {
		
		int result = 9999;
		
		if(switches == 10) 
			return checkArray(watches) ? 0 : result;
		
		
		for(int cnt = 0;cnt<4;cnt++){
			
			int temp = cnt + findNumber(watches,switches+1);
			
			if(temp < result ) result = temp;
			
			for(int i=0;i<16;i++){
				if(clocks[switches][i] != 0){
					watches[i] += 3;
					if(watches[i] == 15 ) watches[i] =3;
				}
			}
			
		}
		
		return result;
		
	}
	
	private static boolean checkArray(int watches[]) {
		
		boolean check = true;
		
		for(int i=0;i<16;i++){
			if(watches[i] == 12 ) {
				continue;
			}else{
				check = false;
				break;
			}
		}
		
		return check;
	}

}
