package KOITP.SDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SDS_first {
	
	public static int array[] = new int[20];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp[] = br.readLine().trim().split(" ");
		
		int status = 0;
		
		int result = 987654321;
		int count = 0;
		boolean pass = false;
		boolean candi = false;
		
		for(int i=0;i<20;i++){
			
			status = 0;
			count = 0 ;
			
			for(int t=0;t<20;t++){
				
				array[t] = Integer.parseInt(temp[t]);
				
				status += array[t];
				
			}
			
			
			int k=i;
			for( ; k<20;k++){
				
				if(k >= 1 && array[k-1] == 1){
					candi = true;
				}else if(k==0 && array[k]== 1){
					candi = true;
				}
				
				if(candi){
					int change = 0;
					change = cowAction(k);
					
					status += change;
					count++;
					
					candi = false;
				}
				
				if(array[k] == 1){
					
					candi = true;
					
				}
				
//				System.out.print(" ["+k+"] ");
//				show();
				
				if(status == 0 ){
					result = Math.min(result, count);
					pass = true;
//					System.out.println(" Result is "+result);
					break;
				}
				
			}
			
			
		}
		
		if(!pass) result = -1;	
		
		if(result == -1){
			System.out.println("-1");
		}else{
			System.out.println(result);
		}
		
		br.close();
		
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
