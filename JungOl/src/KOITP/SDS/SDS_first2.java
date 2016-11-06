package KOITP.SDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SDS_first2 {
	
	public static int array[] = new int[20];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp[] = br.readLine().trim().split(" ");
		
		for(int t=0;t<20;t++){
			
			array[t] = Integer.parseInt(temp[t]);
			
		}
		
		int result = solve(0);
		
		if(result > 20) result = -1;
		
		System.out.println(result);
		
		br.close();
		
	}

	private static int solve(int point) {

		if(check()){
			return 0;
		}
		int ret = 987654321;
		if(point >= 20 ) return ret;
		
		int noClick = 0;
		int click = 0;
		
		noClick = solve(point+1);
		
		cowAction(point);
		click = 1+solve(point+1);
		cowAction(point);
		ret = Math.min(noClick, click);
		
		return ret;
	}

	private static boolean check(){
		
		int sum = 0;
		
		for(int i=0;i<20;i++)
			sum += array[i];
		
		if(sum == 0){
			return true;
		}else{
			return false;
		}
	}
	
	private static void show() {

		for(int i=0;i<20;i++){
			
			System.out.print(" "+array[i]);
			
		}
		
		System.out.println("");
		
	}

	private static int cowAction(int point) {
		
		int change = 0;
		
		if( point  == 0 ){
			
			change += changePoint(0);
			change += changePoint(1);
			
		}else if(point == 19){
			
			change += changePoint(18);
			change += changePoint(19);
			
		}else{
			
			change += changePoint(point-1);
			change += changePoint(point);
			change += changePoint(point+1);
			
		}
		
		return change;
		
	}

	private static int changePoint(int i) {
		
		if(array[i] == 1){
			array[i] = 0;
			return -1;
		}else{
			array[i] = 1;
			return 1;
		}
	}

}
