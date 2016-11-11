package KOITP.SDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SDS_PRO_10_2 {

	public static int node[];
	public static ArrayList<ArrayList> lines;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp[] = br.readLine().trim().split(" ");

		int nodeN = Integer.parseInt(temp[0]);
		int lineN = Integer.parseInt(temp[1]);
		
		node = new int[nodeN+1];
		lines = new ArrayList<ArrayList>();
		
		for(int i=0;i<=nodeN;i++){
			
			ArrayList<Integer> tempAL = new ArrayList<Integer>();
			lines.add(tempAL);
			
		}
		
		for(int i=0;i<lineN;i++){
			
			temp = br.readLine().trim().split(" ");
			int start = Integer.parseInt(temp[0]);
			int end = Integer.parseInt(temp[1]);
			
			lines.get(start).add(end);
			node[end]++;
			
		}
		
		Queue<Integer>  Rque = new LinkedList();
		Queue<Integer>  Wque = new LinkedList();
		
		// Start Make sorted list
		for(int k=1;k<=nodeN;k++){
			
			if(node[k] == 0 ) Wque.add(k);
				
		}
		
		while(Rque.size() < nodeN){
			
			for(int i=0;i<Wque.size();i++){
				
				int num = Wque.poll();
				Rque.add(num);
				
//				System.out.println( " num "+num+", line number "+lines.get(num).size());
				
				for(int k=0;k<lines.get(num).size();k++){
					
					int point = (int) lines.get(num).get(k);
//					System.out.println(" connection removing "+point);
					
					node[point]--;
					if(node[point] == 0) {
						
						Wque.add(point);
//						System.out.println(" Add point in Queue "+point);
					}
					
				}
				
			}
			
			
		}
		
		
		while(!Rque.isEmpty()){
			System.out.print(Rque.poll()+" ");
		}
		
		br.close();
		
	}

}
