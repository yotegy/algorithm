package Basis.Array02;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main161 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		Map<Integer,Integer> statistic = new TreeMap<Integer,Integer>(Collections.reverseOrder());

		boolean pass = true;
		
		int temp = 0;
		int count = 0;
		
		while(pass){
			
			temp = in.nextInt();
			
			if(temp == 0) break;
			
			int key = (temp/10)*10;
			
			if(statistic.containsKey(key)){
				
				count = statistic.get(key);
				statistic.put(key, ++count);
				
			}else{
				
				statistic.put(key,1);
				
			}
			
		}
		
		Set<Entry<Integer,Integer>> results = statistic.entrySet();
		
		Iterator it = results.iterator();
		
		while(it.hasNext()){
			
			Entry<Integer,Integer> a = (Entry<Integer, Integer>) it.next();
			
			System.out.printf("%d점 이상 : %d명\n", a.getKey(),a.getValue());
			
			
		}
		
		
		in.close();

	}

}
