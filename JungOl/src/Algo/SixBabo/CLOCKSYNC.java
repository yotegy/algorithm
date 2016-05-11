package Algo.SixBabo;

import java.util.Arrays;
import java.util.Scanner;

public class CLOCKSYNC {
	
	
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
	public static int final_num = -1;
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int num=0;num<problem;num++){
			
			gate = false;
			final_num = -1;
			
			watches = new int[16];
			for(int i =0;i<16;i++) watches[i] = in.nextInt();
			
			clicks = new int[10];
			Arrays.fill(clicks, 0);
			
			int limit = 1;
			for(;limit <37;limit++){
				gate = findnumber(0,limit,0);
				if(gate) break;
			}
			
			System.out.println(final_num);
			
		}
		
		in.close();
		
	}


	private static boolean findnumber(int now_click,int limit,int startpoint) {
		
//		for(int tt = 0;tt<10;tt++){
//			
//			System.out.printf("%d ", clicks[tt]);
//			
//		}
//		System.out.printf("                   ");
//		for(int tt = 0;tt<16;tt++){
//			
//			System.out.printf("%3d ", watches[tt]);
//			
//		}
//		System.out.println("          click : "+now_click);
		
		if(checkArray()){
			final_num = now_click;
			return true;
		}
		
		if(now_click >= 36){
			return false;
		}else if(now_click > limit){
			return false;
		}
		
		for(int i = startpoint;i<10;i++){
			
			if(clicks[i]<3){

				int k =0;
				for(;k<16;k++){
					if(clocks[i][k] != 0) break;
				}
				
//				if(watches[k] == 12) {
//					continue;
//				}else{
					
					clicks[i]++;
					
					k=0;
					for(;k<16;k++){
						
						if(clocks[i][k] != 0) watches[k] +=3;
						if(watches[k] == 15 ) watches[k] =3;
						
					}
					if(findnumber(now_click+1,limit,i)) return true;
					
					for(k=0;k<16;k++){
						
						if(clocks[i][k] != 0) watches[k] -=3;
						if(watches[k] == 0 ) watches[k] = 12;
						
					}
					
					clicks[i]--;
//				}
				
			}else{				
				continue;
			}
			
		}
		
		return false;
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
