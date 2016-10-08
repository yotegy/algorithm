package Algo.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Routing {
	
	public static float dist[];
	public static ArrayList<ArrayList> connect;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pro = Integer.parseInt(br.readLine());
		
		for(int i=0;i<pro;i++){
			
			String tempInput[];
			
			tempInput = br.readLine().split(" ");
			
			int nodeSize = Integer.parseInt(tempInput[0]);
			int lineSize = Integer.parseInt(tempInput[1]);
			
			dist = new float[nodeSize];
			
			Arrays.fill(dist, 987654);
			
			connect = new ArrayList<ArrayList>();
			
			
			for( int k=0;k<nodeSize;k++){
				ArrayList<Line> goal = new ArrayList<Line>();
				connect.add(goal);
			}
			
			// insert value
			for( int k=0;k<lineSize;k++){
				
				tempInput = br.readLine().split(" ");
				int from;
				int to;
				float tempValue;
				
				from = Integer.parseInt(tempInput[0]);
				to = Integer.parseInt(tempInput[1]);
				tempValue = Float.parseFloat(tempInput[2]);
								
				Line fromline  = new Line(to, tempValue);
				Line toline = new Line(from,tempValue);
				
				connect.get(from).add(fromline);
				connect.get(to).add(toline);
				
			}
			
			PriorityQueue<Distance> pq = new PriorityQueue<Distance>();
			
			Distance start = new Distance(0,0);
			pq.add(start);
			
			int nowD = 0;
			
			while(!pq.isEmpty()){
				Distance fromPoint = pq.poll();
				
				if(dist[fromPoint.point] < fromPoint.value ) {
					continue;
				}else{
					dist[fromPoint.point] = fromPoint.value;
				}
				
				for(int t=0;t<connect.get(fromPoint.point).size();t++){
					
					int fromP = fromPoint.point;
					Line tempL = ((Line)(connect.get(fromP).get(t)));
					int toP = tempL.point;
					float nowValue;
					if(fromPoint.value == 0){
						nowValue = tempL.value;
					}else{
						nowValue = tempL.value * fromPoint.value;
					}
					
					Distance tempDis = new Distance(toP,nowValue);
					pq.add(tempDis);
					
				}
				
			}
			
			System.out.printf("%.10f" , dist[nodeSize-1]);
			System.out.println();
		}
		

	}
	


}

class Line{
	
	public int point;
	public float value;
	
	public Line(int p, float v){
		this.point = p;
		this.value =v;
	}
			
}

class Distance implements Comparable<Distance>{

	public int point;
	public float value;
	
	public Distance(int p,float v){
		this.point = p;
		this.value = v;
	}
	
	@Override
	public int compareTo(Distance target) {
		if(this.value > target.value){
			return 1;
		}else{
			return -1;
		}
		
	}
	
}
