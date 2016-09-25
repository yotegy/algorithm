package SDS.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
 *   1) 2���� �迭�� ���� ������ �Է��ϰ�,
 *   2) ���� ���� �迭���� �Է��ϰ�,

 *   4) 1���� �����Ͽ� 2N-1���� ����� ���� �����ϰ� ����� �� �ʿ��� ���� ����Ͽ� ������ �� ���� ����
 * 
 */
public class FireWorks03 {
	
	public static int lineList[][];
	public static int Bumnum;
	public static int Spoint;
	public static int SP[];   // ��ΰ�
	public static int route[];   // ��� ��ġ
	public static boolean node[];
	public static ArrayList al;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ���� �Է�
		int pro = Integer.parseInt(br.readLine());
		
		for(int i=0; i  < pro ; i++){
			
			// ��ź ���� �Է�
			Bumnum = Integer.parseInt(br.readLine());
			Spoint = Bumnum*2;
			
			lineList = new int[Spoint+1][Spoint+1];
			SP = new int[Spoint+1];
			route = new int[Spoint+1];
			node = new boolean[Spoint+1];
			
			al = new ArrayList();
			
			// �ʱ�ȭ
			Arrays.fill(SP, -1);
			Arrays.fill(route, -1);
			Arrays.fill(node, false);
			
			// �⺻ 0 ���� arraylist�� ����
			al.add("test");
			
			for(int k = 1;k<= Spoint ;k++){
				ArrayList innerAL = new ArrayList();
				
				al.add(innerAL);
				
			}
			
			// ��ȭ�� �Է�
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
			
			// ��� ���ϱ�
				// ������ ����
			route[Spoint] = Spoint;
			SP[Spoint] = 0;
			findpath(Spoint);
			
 			showroute();
			
			// �ִ� �Ÿ� ã�Ƴ���n m879=89p;k\\;\;---9-78\-9\-8888888888888888888\-7-9-=\56\4\=3\311
			
			
			
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
			
			// ó�� �����ϴ� ��
			if(route[targetP] == -1){
				
				// point�� �θ�
				route[targetP] = point;
				SP[targetP] = SP[point] + lineList[point][targetP];
				
				// targetPoint ������ �� ����
			    findpath(targetP);
				
			}
			// �̹� ����� ��
			else{
				continue;
			}
			
		}
		
		
	}

}
