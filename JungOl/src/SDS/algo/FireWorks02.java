package SDS.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
 *   1) 2���� �迭�� ���� ������ �Է��ϰ�,
 *   2) ���� ���� �迭���� �Է��ϰ�,
 *   3) ���ͽ�Ʈ��� �ִ� �Ÿ��� ����Ѵ�.
 *   4) 1���� �����Ͽ� 2N-1���� ����� ���� �����ϰ� ����� �� �ʿ��� ���� ����Ͽ� ������ �� ���� ����
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
		
		// ���� ���� �Է�
		int pro = Integer.parseInt(br.readLine());
		
		for(int i=0; i  < pro ; i++){
			
			// ��ź ���� �Է�
			Bumnum = Integer.parseInt(br.readLine());
			Spoint = Bumnum*2;
			
			lineList = new int[Spoint+1][Spoint+1];
			dijstra = new int[Spoint+1];
			pre = new int[Spoint+1];
			visited = new boolean[Spoint+1];
			
			// �ʱ�ȭ
			Arrays.fill(dijstra, 987654321);
			Arrays.fill(pre, -1);
			Arrays.fill(visited, false);
			
			// ��ȭ�� �Է�
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
			
			// ���ͽ�Ʈ�� ����ϱ�
			findlength();
			
			// �ִ� �Ÿ� ã�Ƴ���
			
			
			
		}
		

	}

	private static void findlength() {
		
		int max = 987654321;
		
		dijstra[Spoint] = 0;
		
		for(int i = 1;i<=Spoint;i++){
			
			int point = 0;
			int min = max;
			// ����� ã��
			for(int k=1;k<=Spoint;k++){
				
				if( visited[k] == false && dijstra[k] < min){
					
					min = dijstra[k];
					point = k;
					
				}
				
			}
			
			visited[point] = true; 
			
			// ���ͽ�Ʈ�� �������� dijstra[]�� �ּҰ��� ��ϵ�
			for(int t=1;t<=Spoint;t++){
				
				if(lineList[point][t] != 0 && visited[t] == false && dijstra[t] > (dijstra[point]+lineList[point][t])){
					dijstra[t] = dijstra[point]+lineList[point][t];
					pre[t] = point;
				}
				
			}
			
		}
		
		
	}


}
