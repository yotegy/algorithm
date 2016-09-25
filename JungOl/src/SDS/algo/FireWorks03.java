package SDS.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
 *   1) 2차원 배열에 연결 정보를 입력하고,
 *   2) 연결 고리를 배열에도 입력하고,

 *   4) 1부터 시작하여 2N-1까지 연결된 값을 동일하게 만드는 데 필요한 값을 계산하여 상위에 그 값을 저장
 * 
 */
public class FireWorks03 {
	
	public static int lineList[][];
	public static int Bumnum;
	public static int Spoint;
	public static int SP[];   // 경로값
	public static int route[];   // 경로 위치
	public static boolean node[];
	public static ArrayList al;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문제 개수 입력
		int pro = Integer.parseInt(br.readLine());
		
		for(int i=0; i  < pro ; i++){
			
			// 폭탄 개수 입력
			Bumnum = Integer.parseInt(br.readLine());
			Spoint = Bumnum*2;
			
			lineList = new int[Spoint+1][Spoint+1];
			SP = new int[Spoint+1];
			route = new int[Spoint+1];
			node = new boolean[Spoint+1];
			
			al = new ArrayList();
			
			// 초기화
			Arrays.fill(SP, -1);
			Arrays.fill(route, -1);
			Arrays.fill(node, false);
			
			// 기본 0 값을 arraylist에 넣음
			al.add("test");
			
			for(int k = 1;k<= Spoint ;k++){
				ArrayList innerAL = new ArrayList();
				
				al.add(innerAL);
				
			}
			
			// 도화선 입력
			for(int k = 1; k< Spoint ;k++){
				
				int start;
				int end;
				int value;
				
				String inarr[] = br.readLine().split(" ");
				
				start = Integer.parseInt(inarr[0]);
				end = Integer.parseInt(inarr[1]);
				value = Integer.parseInt(inarr[2]);
				
				lineList[start][end] = value;
				lineList[end][start] = value;
				
				((ArrayList)(al.get(start))).add(end);
				((ArrayList)(al.get(end))).add(start);
				
			}
			
			
			System.out.println(" [Start Findpath]");
			
			// 경로 구하기
				// 시작점 설정
			route[Spoint] = Spoint;
			SP[Spoint] = 0;
			findpath(Spoint);
			
 			showroute();
			
			// 최단 거리 찾아내기n m879=89p;k\\;\;---9-78\-9\-8888888888888888888\-7-9-=\56\4\=3\311
			
			
			
		}
		

	}

	private static void showroute() {
		
		System.out.println(" show route and SP table ");
		
		for(int i=1;i<=Spoint;i++){
			
			System.out.print(" "+route[i]);
			
		}
		
		System.out.println();
		
		for(int i=1;i<=Spoint;i++){
			
			System.out.print(" "+SP[i]);
			
		}
		
		System.out.println();
		
	}

	private static void findpath(int point) {
		
		ArrayList nowAL = ((ArrayList)al.get(point));
		
		for(int i=0;i< nowAL.size() ; i++){
			
			int targetP = (int)(nowAL.get(i));
			
			// 처음 연결하는 곳
			if(route[targetP] == -1){
				
				// point가 부모
				route[targetP] = point;
				SP[targetP] = SP[point] + lineList[point][targetP];
				
				// targetPoint 하위의 값 연결
			    findpath(targetP);
				
			}
			// 이미 연결된 곳
			else{
				continue;
			}
			
		}
		
		
	}

}
