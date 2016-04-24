package Basis.Array01;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main560 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Set<Integer> ts = new TreeSet<Integer>();
		
		for(int i=0;i<10;i++){
			
			ts.add(in.nextInt());
			
		}
		
		Iterator<Integer> it = ts.iterator();
		
		System.out.println(it.next());
		
		in.close();
		
	}

}
