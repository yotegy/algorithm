package KOITP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_wormhole {
	
	public static int road[][] = new int[501][501];
	public static int WHstart[] = new int[200];
	public static int WHend[] = new int[200];
	public static int WHV[] = new int[200];
	
	public static int num_farm;
	public static int num_road;
	public static int num_WH;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pro = Integer.parseInt(br.readLine());
		
		for(int i=0; i<pro ; i++){
			
			String inputArray[];
			
			inputArray = br.readLine().split(" ");
			
			num_farm = Integer.parseInt(inputArray[0]);
			num_road = Integer.parseInt(inputArray[1]);
			num_WH = Integer.parseInt(inputArray[2]);
			
			// road 초기화
			for(int k=1;k<=num_farm;k++){
				Arrays.fill(road[k], -1);
			}
			
			// road의 길이 값 넣기
			for(int k=0;k<num_road;k++){
				inputArray = br.readLine().split(" ");
				int startpoint = Integer.parseInt(inputArray[0]);
				int endpoint = Integer.parseInt(inputArray[1]);
				int roadvalue = Integer.parseInt(inputArray[2]);
				
				if(road[startpoint][endpoint] == -1 || road[startpoint][endpoint] > roadvalue){
					road[startpoint][endpoint] = roadvalue;
					road[endpoint][startpoint] = roadvalue;
				}
				
			}
			
			// WH 값 넣기
			for(int k=0;k<num_WH;k++){
				inputArray = br.readLine().split(" ");
				WHstart[k] = Integer.parseInt(inputArray[0]);
				WHend[k] = Integer.parseInt(inputArray[1]);
				WHV[k] = Integer.parseInt(inputArray[2]);
			}
			
			// WH 기준으로 음수가 되는 값 찾기
			// 단, 이 접근은 WH이 2개 이상 적용되어 값이 음수가 되는 것을 찾을 수 없음
			// 그런데, 2개의 WH을 거쳐서 오는 경우는 첫번째 WH에서 이미 시간을 거슬러야 가능함
			// 이 방법으로 찾아보자
			
			String result = "NO";
			
			for(int k=0;k<num_WH;k++){
				
				if( findWH(WHstart[k],WHend[k],WHV[k]) < 0){
					result = "YES";
					break;
				}
				
			}
			
			System.out.println(result);
			
			
		}
		
	}

	private static int findWH(int start, int end, int value) {
		
		int result = value*-1;
		
		int SP[] = new int[num_farm+1];
		int prev[] = new int[num_farm+1];
		boolean visited[] = new boolean[num_farm+1]; 
		
		int max = 987654321;
		
		// 초기화
		for( int i=1;i<=num_farm;i++){
			SP[i] = max;
			prev[i] = 0;
			visited[i] = false;
		}
		
		// 다익스트라 알고리즘
		
		SP[start] = 0;
		for( int i = 1; i <= num_farm;i++){
			
			int min = max;
			int point = 0;
			
			// 다음 출발 점 정하기
			for( int j=1;j<= num_farm;j++){
				
				if(visited[j] == false && SP[j] < min){
					
					min = SP[j];
					point = j;
					
				}
			}
			
			visited[point] = true;
			
			// point 기준으로 짧은 거리 계산하기
			for(int j=1;j<=num_farm;j++){
				
				if(road[point][j] != -1 && visited[j] == false && ( SP[j] > ( SP[point] + road[point][j] )) ){
					SP[j] = SP[point] + road[point][j];
					prev[j] = point;
				}
				
			}
			
		}
		
		result = result +  SP[end];
		
		// debugging
//		System.out.println(" [farm's SP]");
//		for( int t=1;t<=num_farm;t++){
//			System.out.println(SP[t]);
//		}
//		
//		System.out.println(" result : "+result);
		
		return result;
	}

}
