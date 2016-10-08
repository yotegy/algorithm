package Exercise.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Exercise_PriorityQueue2 {

	public static void main(String[] args) {

		PriorityQueue<Prisoner2> pq = new PriorityQueue<Prisoner2>();
		
		Prisoner2 p01 = new Prisoner2("TJ",39);
		Prisoner2 p02 = new Prisoner2("HY",37);
		Prisoner2 p03 = new Prisoner2("OnlyU", 5);
		Prisoner2 p04 = new Prisoner2("Ji",2);
		
		pq.add(p01);
		pq.add(p04);
		pq.add(p03);
		pq.add(p02);
		
		PriorityQueue<Prisoner2> rpq = new PriorityQueue<Prisoner2>(pq.size(), Collections.reverseOrder());
		rpq.addAll(pq);
	
		for(int i=0;i<4;i++)
			System.out.println(pq.poll().name);
		
		for(int i=0;i<4;i++)
			System.out.println(rpq.poll().name);
		
		System.out.println(pq.size());
		System.out.println(rpq.size());
		
	}

}
