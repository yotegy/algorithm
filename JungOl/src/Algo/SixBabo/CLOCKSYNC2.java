package Algo.SixBabo;

import java.util.Arrays;
import java.util.Scanner;

public class CLOCKSYNC2 {
	
	
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
	public static int watches[] ;
	public static int clicks[];
	public static boolean gate = false;
	public static int final_num = 9999;
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int num=0;num<problem;num++){
			
			final_num = 9999;
			
			watches = new int[16];
			for(int i =0;i<16;i++) watches[i] = in.nextInt();
			
			clicks = new int[10];
			Arrays.fill(clicks, 0);
			
			findNumber(0,final_num);			
			
			if(final_num == 9999 ){ 
				System.out.println(-1);;
			}else{
				System.out.println(final_num);
			}
		}
		
		in.close();
		
	}

	private static int findNumber(int switches,int min_value) {
		
		if(min_value > final_num) return 9999;
		
		if(switches == 10){
			if(checkArray()){
				if(final_num > min_value) {
					final_num = min_value;
				}
				return 0;
			}else{
				return min_value;
			}
		}
		
		for(int i = 0;i<4;i++){
			
			min_value = Math.min(min_value, i+findNumber(switches+1,min_value));
			
			addclock(switches);
			
		}
		
		return min_value;		
		
	}

	private static boolean addclock(int switches){
		
		for(int i=0;i<16;i++){
			if(clocks[switches][i] !=0 ){
				watches[i] += 3;
				if(watches[i] == 15) watches[i] =3;
			}
		}
		
		return checkArray();
		
	}
	
	private static boolean checkArray() {
		
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
