package SDS.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FireWorks {
	
	public static int lineList[][];
	public static int lineValue[][];
	public static int Bumnum;
	public static int Spoint;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ���� �Է�
		int pro = Integer.parseInt(br.readLine());
		
		for(int i=0; i  < pro ; i++){
			
			// ��ź ���� �Է�
			Bumnum = Integer.parseInt(br.readLine());
			Spoint = Bumnum*2;
			
			lineList = new int[Spoint+1][2];
			lineValue = new int[Spoint+1][2];
			
			// ��ȭ�� �Է�
			for(int k = 0; k< (Bumnum*2);k++){
				
				int start;
				int end;
				int value;
				
				String inarr[] = br.readLine().split(" ");
				
				start = Integer.parseInt(inarr[0]);
				end = Integer.parseInt(inarr[1]);
				value = Integer.parseInt(inarr[2]);
				
				// �� �������� ���ἱ ������ �Է��Ѵ�.
				if(lineList[start][0] == 0){
					lineList[start][0] = end;
					lineValue[start][0] = value;
				}else{
					lineList[start][1] = end;
					lineValue[start][1] = value;
				}
				
				if(lineList[end][0] == 0){
					lineList[end][0] = start;
					lineValue[end][0] = value;
				}else{
					lineList[end][1] = start;
					lineValue[end][1] = value;
				}
				
			}
			
			// ���� Ʈ�� �����
			Node happyTree = makeTree(Spoint,0);
			
			
			// �� ����ϱ�
			
			
		}
		

	}

	// Tree����� ����Լ��� ó��
	private static Node makeTree(int nP,int parent) {
		
		Node nNode = new Node();
		
		// ��ź�� ���
		if(nP <= Bumnum){
			
		// ���ἱ�� ���
		}else if( nP < Spoint ){
			
			
		//  ����ġ�� ���
		}else{
			
			nNode.parent = makeTree(lineList[nP][0],nP);
			
		}
		
		
		return nNode;
	}

}

class Node{
	
	public Node parent;
	public Node node01 = null;
	public Node node02 = null;
	
	public int point = 0;
	public int nowValue = 0;
	
	public boolean  bum = false;
	
}
