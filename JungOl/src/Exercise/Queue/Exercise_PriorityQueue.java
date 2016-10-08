package Exercise.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Exercise_PriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Prisoner> pq = new PriorityQueue<Prisoner>();
		
		Prisoner p01 = new Prisoner("TJ",39);
		Prisoner p02 = new Prisoner("HY",37);
		Prisoner p03 = new Prisoner("OnlyU", 5);
		Prisoner p04 = new Prisoner("Ji",2);
		
		pq.add(p01);
		pq.add(p04);
		pq.add(p03);
		pq.add(p02);
		
		PriorityQueue<Prisoner> rpq = new PriorityQueue<Prisoner>(pq.size(), Collections.reverseOrder());
		rpq.addAll(pq);
		
		for(int i=0;i<4;i++)
			System.out.println(pq.poll().name);
		
		for(int i=0;i<4;i++)
			System.out.println(rpq.poll().name);
		
		System.out.println(pq.size());
		System.out.println(rpq.size());
		
	}

}
