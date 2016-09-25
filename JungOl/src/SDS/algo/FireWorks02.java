package SDS.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
 *   1) 2차원 배열에 연결 정보를 입력하고,
 *   2) 연결 고리를 배열에도 입력하고,
 *   3) 다익스트라로 최단 거리를 계산한다.
 *   4) 1부터 시작하여 2N-1까지 연결된 값을 동일하게 만드는 데 필요한 값을 계산하여 상위에 그 값을 저장
 * 
 */
public class FireWorks02 {
	
	public static int lineList[][];
	public static int Bumnum;
	public static int Spoint;
	public static int dijstra[];
	public static int pre[];
	public static boolean visited[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문제 개수 입력
		int pro = Integer.parseInt(br.readLine());
		
		for(int i=0; i  < pro ; i++){
			
			// 폭탄 개수 입력
			Bumnum = Integer.parseInt(br.readLine());
			Spoint = Bumnum*2;
			
			lineList = new int[Spoint+1][Spoint+1];
			dijstra = new int[Spoint+1];
			pre = new int[Spoint+1];
			visited = new boolean[Spoint+1];
			
			// 초기화
			Arrays.fill(dijstra, 987654321);
			Arrays.fill(pre, -1);
			Arrays.fill(visited, false);
			
			// 도화선 입력
			for(int k = 0; k< (Bumnum*2);k++){
				
				int start;
				int end;
				int value;
				
				String inarr[] = br.readLine().split(" ");
				
				start = Integer.parseInt(inarr[0]);
				end = Integer.parseInt(inarr[1]);
				value = Integer.parseInt(inarr[2]);
				
				lineList[start][end] = value;
				lineList[end][start] = value;
				
			}
			
			// 다익스트라 계산하기
			findlength();
			
			// 최단 거리 찾아내기
			
			
			
		}
		

	}

	private static void findlength() {
		
		int max = 987654321;
		
		dijstra[Spoint] = 0;
		
		for(int i = 1;i<=Spoint;i++){
			
			int point = 0;
			int min = max;
			// 출발점 찾기
			for(int k=1;k<=Spoint;k++){
				
				if( visited[k] == false && dijstra[k] < min){
					
					min = dijstra[k];
					point = k;
					
				}
				
			}
			
			visited[point] = true; 
			
			// 다익스트라 로직으로 dijstra[]에 최소값이 등록됨
			for(int t=1;t<=Spoint;t++){
				
				if(lineList[point][t] != 0 && visited[t] == false && dijstra[t] > (dijstra[point]+lineList[point][t])){
					dijstra[t] = dijstra[point]+lineList[point][t];
					pre[t] = point;
				}
				
			}
			
		}
		
		
	}


}
