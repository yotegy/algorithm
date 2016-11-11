package KOITP.SDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SDS_PRO_10_1 {
	
	public static ArrayList<ArrayList> lines = new ArrayList<ArrayList>();
	public static Queue<Integer> DFSque = new LinkedList<Integer>();
	public static Queue<Integer>	BFSque = new LinkedList<Integer>();
	public static int startPoint;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp[] = br.readLine().trim().split(" ");
		
		int nodeN = Integer.parseInt(temp[0]);
		int lineN = Integer.parseInt(temp[1]);
		startPoint = Integer.parseInt(temp[2]);
		
		
		for(int i=0;i<=nodeN;i++){
			
			ArrayList<Integer> tempAL = new ArrayList<Integer>();
			lines.add(tempAL);
			
		}
		
		for(int i=0;i<lineN;i++){
			
			temp = br.readLine().trim().split(" ");
			
			int sp = Integer.parseInt(temp[0]);
			int ep = Integer.parseInt(temp[1]);
			
			lines.get(sp).add(ep);
			lines.get(ep).add(sp);
			
		}
		
		
		
		findDFS();
		findBFS();
		
		showDFS();
		showBFS();
		
		br.close();

	}

	private static void showDFS() {
		
		while(!DFSque.isEmpty()){
			
			System.out.print(DFSque.poll()+" ");
			
		}
		System.out.println();
		
	}

	private static void showBFS() {
		
		while(!BFSque.isEmpty()){
			
			System.out.print(BFSque.poll()+" ");
			
		}
		System.out.println();
		
	}

	private static void findBFS() {
		
		BFSque.add(startPoint);
		
	}

	private static void findDFS() {
		
		DFSque.add(startPoint);
		
		
		
	}

}
