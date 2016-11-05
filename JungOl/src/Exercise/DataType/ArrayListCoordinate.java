package Exercise.DataType;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListCoordinate {
	
	public static void main(String arg[]) throws IOException{
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./src/Exercise/DataType/ArrayListCoordinate_input.txt"),"EUC-KR"));
		
		 ArrayList<ArrayList> xy_list = new ArrayList<ArrayList>();
		 
		 for(int i=0;i<10;i++){
			 ArrayList<Integer> point_x = new ArrayList<Integer>();
			 xy_list.add(point_x);
		 }
		 
		 while(br.ready()){
			 String point[] = br.readLine().split(" ");
			 
			 int x = Integer.parseInt(point[0]);
			 int y = Integer.parseInt(point[1]);
			 
			 xy_list.get(x).add(y);
			 
		 }
		 
		 showResult(xy_list);
		 
		 br.close();
		
	}

	private static void showResult(ArrayList<ArrayList> array) {
		
		for(int i=0 ; i<array.size() ; i++){
			System.out.print(" ["+i+"]");
			for(int j=0 ; j< (array.get(i).size()) ; j++){
				
				  System.out.print(" "+array.get(i).get(j));
				
			}
			System.out.println();
		}
		
		
	}

}
